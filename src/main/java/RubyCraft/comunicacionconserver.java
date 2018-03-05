package RubyCraft;

import java.io.*;
import java.net.*;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;

public class comunicacionconserver {
	
	 public static String nombre_usuario = " ";
	 public static int ValorTimeOut;
	//		 FileInputStream fr=new FileInputStream("C:\\\\Users\\\\"+ nombre_usuario + "\\\\AppData\\\\Roaming\\\\.minecraft\\\\logs\\\\latest.log");

		  
	public static void clientecodigoensi() throws Exception {
		 
		 nombre_usuario = System.getProperty("user.name");
		
		//    Socket socket = null;
		    String host = "joelcraft2.ddns.net";
		    Socket socket=new Socket();   
		    socket.connect(new InetSocketAddress(host,5643),ValorTimeOut); 
		    socket.setSoTimeout(ValorTimeOut);
	        //socket = new Socket(host, 5643);

            
	        File file = new File("C:\\Users\\"+ nombre_usuario + "\\AppData\\Roaming\\.minecraft\\logs\\latest.log");
		    
	        // Get the size of the file
	        long length = file.length();
	        byte[] bytes = new byte[16 * 1024];
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
			 
		 }else if(!(ValorTimeOut==0))
		 
		  try { 
			clientecodigoensi();
		      }catch (IOException e) {
		    	  RubyCraft.logger.info("#################################################################################################################");
		    	  RubyCraft.logger.info("RUBYCRAFT INTENTO CONECTAR CON EL SERVIDOR PERO NO PUDO ERROR: " + e);
		    	  RubyCraft.logger.info("TIEMPO PARA DAR TIMEOUT:" + ValorTimeOut + "segundos");
		    	  RubyCraft.logger.info("#################################################################################################################");
		    	  
		      }
	     }
	
}
