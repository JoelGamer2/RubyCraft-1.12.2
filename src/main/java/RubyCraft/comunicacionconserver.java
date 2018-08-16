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
	
	 public static int ValorTimeOut;	 
	 private static int puerto = 4444;

		  
	public static void clientecodigoensi() throws Exception {
		 
	
						
		Socket s = new Socket("joelcraft2.ddns.net",puerto);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msgin="",msgout="";
		
		
		
		while(!msgin.equals("end") ) {
			
		
			
			dout.writeUTF(Referencia.VERSION);
			
			
			
			msgin = din.readUTF();
            RubyCraft.logger.info(msgin);			
			
			if(msgin.equalsIgnoreCase("Inicia")) {
				RubyCraft.ModActualizado = true;
				dout.close();
				
			}else if(msgin.equalsIgnoreCase("Apaga")) {
				RubyCraft.ModActualizado = false;
				dout.close();
			}
			
		}
		
	
	
		   
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
	
	 
	 public static void pedirtexturaseventos() {
		 
		 
		 
	 }
	 
}
