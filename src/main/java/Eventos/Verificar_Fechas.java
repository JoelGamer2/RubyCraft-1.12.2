package Eventos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import RubyCraft.RubyCraft;

public class Verificar_Fechas {

	public static int puerto = 1234;

	
	public static String Mensajedelserver;
	public static String mensajees_un_cliente_y_no_un_server;
	public static DataOutputStream dout1;
	
	public static boolean Iniciado = false;	
	public static boolean inicia = true;	
	public static boolean HalloWen = false;
	public static boolean Navidad = false;
	
	public static void Iniciar() {
		try {
			
			Socket s = new Socket("217.217.155.253",puerto);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			s.setSoTimeout(10000);
			
			dout1 = dout;
			dout=dout1;
			
			String msgin="",msgout="";	
			
			while(inicia) {
				
			if(HalloWen == true && !Iniciado) {
				dout.writeUTF("Hallowen");
				dout.flush();
				Iniciado = true;
			}else if(Navidad == true && !Iniciado) {
				dout.writeUTF("Navidad");
				dout.flush();
				Iniciado = true;
			}
			
			msgin = din.readUTF();
			
			if(msgin.equals("true") && HalloWen == true) {
				
				RubyCraft.Hallowen = true;
	    	//	Crafteos.IniciarCrafteosHallowen();
	    		if(RubyCraft.es_un_cliente_y_no_un_server) {
	    	//	Cambiador_de_Texturas.Texturas();
	    		}
	    		IniciarItemsEventos.Iniciartodo();
				inicia = false;
				
			}else if(HalloWen == true && msgin.equals("false")) {
       
				inicia = false;
				if(RubyCraft.es_un_cliente_y_no_un_server) {
		    	//	Cambiador_de_Texturas.Texturas();
		    		}
				
			}else if(Navidad == true && msgin.equals("true")) {
			
				 RubyCraft.Navidad = true;
				// Crafteos.IniciarCrafteosNavidad();
				 if(RubyCraft.es_un_cliente_y_no_un_server) {
			   //  Cambiador_de_Texturas.Texturas();
				 }
			     IniciarItemsEventos.Iniciartodo();
				inicia = false;
				
			}else if(Navidad == true && msgin.equals("false")) {

				inicia = false;
				if(RubyCraft.es_un_cliente_y_no_un_server) {
		    	//	Cambiador_de_Texturas.Texturas();
		    		}
			     }		

			}
			
	}catch (Exception e) {
		
		inicia = false;
		RubyCraft.Navidad = false;
		RubyCraft.Hallowen = false;
		Navidad = false;
		HalloWen = false;
	//	Cambiador_de_Texturas.Texturas();
		System.out.println(e);
		
	      }
	
     }
}
