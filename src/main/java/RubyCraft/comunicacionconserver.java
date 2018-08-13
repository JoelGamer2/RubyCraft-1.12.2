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
		 
	try {
						
			Socket s = new Socket("joelcraft2.ddns.net",puerto);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			s.setSoTimeout(ValorTimeOut*1000);
			
			
		
			String msgin="",msgout="";
			
			
			
			while(!msgin.equals("end") ) {
										
				msgin = din.readUTF();
				System.out.println(msgin);
				dout.writeUTF("Cliente online");
				dout.flush();
				
				if(msgin.equalsIgnoreCase("Server Online")) {
					
				RubyCraft.logger.info("abierto");
				dout.close();
				}
			}
			
				
			
		
	}catch (Exception e) {
		if(!e.equals("java.net.SocketException")) {
			
			  RubyCraft.logger.info("#################################################################################################################");
	    	  RubyCraft.logger.info("RUBYCRAFT INTENTO CONECTAR CON EL SERVIDOR PERO NO PUDO ERROR: " + e);
	    	  RubyCraft.logger.info("TIEMPO PARA DAR TIMEOUT:" + ValorTimeOut + "segundos");
	    	  RubyCraft.logger.info("#################################################################################################################");
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
