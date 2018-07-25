package RubyCraft;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import net.minecraft.client.Minecraft;

public class comunicacionconserver {
	
	 public static String nombre_usuario = " ";
	 public static int ValorTimeOut;
	 public static String Mensaje = "";
	//		 FileInputStream fr=new FileInputStream("C:\\\\Users\\\\"+ nombre_usuario + "\\\\AppData\\\\Roaming\\\\.minecraft\\\\logs\\\\latest.log");

		  
	public static void clientecodigoensi() throws Exception {
		 
		 nombre_usuario = System.getProperty("user.name");
		
		//    Socket socket = null;
		    String host = "joelcraft2.ddns.net";
		    Socket socket=new Socket();   
		    socket.connect(new InetSocketAddress(host,1234),ValorTimeOut); 
		    socket.setSoTimeout(ValorTimeOut);
	        //socket = new Socket(host, 5643);

            
	        File file = new File("C:\\Users\\"+ nombre_usuario + "\\AppData\\Roaming\\.minecraft\\logs\\latest.log");
		    
	        // Get the size of the file
	        long length = file.length();
	        byte[] bytes = new byte[999999];
	        InputStream in = new FileInputStream(file);
	        OutputStream out = socket.getOutputStream();

	        int count;
	        while ((count = in.read(bytes)) > 0) {
	            out.write(bytes, 0, count);
	        }

	        out.close();
	        in.close();
	        socket.close();
		
		   
		}
	
	 public static void IntentarContactarconelServer() throws Exception {
		 
		 
		 
		 if(ValorTimeOut==0){
			 
			 RubyCraft.logger.info("---------------------------------------------------------------------------");
	    	 RubyCraft.logger.info("COMUNICACION CON EL SERVIDOR DE RUBYCRAFT DESACTIVADA ACTIVALA EN CONFIG");
	    	 RubyCraft.logger.info("---------------------------------------------------------------------------");
			 
		 }/**else if(!(ValorTimeOut==0))
		 
		  try { 
			clientecodigoensi();
		      }catch (IOException e) {
		    	  RubyCraft.logger.info("#################################################################################################################");
		    	  RubyCraft.logger.info("RUBYCRAFT INTENTO CONECTAR CON EL SERVIDOR PERO NO PUDO ERROR: " + e);
		    	  RubyCraft.logger.info("TIEMPO PARA DAR TIMEOUT:" + ValorTimeOut + "segundos");
		    	  RubyCraft.logger.info("#################################################################################################################");
		    	  
		      }**/
	     }
	
	 
	 public static void pedirtexturaseventos() {
		 
		 
		 
	 }
	 
	 
	 public static void RecibirMsgdeserver() throws UnknownHostException, IOException {
		
		
		 try {
				
				Socket s = new Socket("joelcraft2.ddns.net",1234);
				DataInputStream din = new DataInputStream(s.getInputStream());
				DataOutputStream dout = new DataOutputStream(s.getOutputStream());
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String msgin="",msgout="";
				
				while(!msgin.equals("end")) {
					
					msgout = br.readLine();
			//		dout.writeUTF(ms);
					msgin = din.readUTF();
					Minecraft.getMinecraft().player.sendChatMessage(msgin);
					System.out.println(msgin);
					
				}
				
				
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
				
				
			
		
	 }
	 
}
