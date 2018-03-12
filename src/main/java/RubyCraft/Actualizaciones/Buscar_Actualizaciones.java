package RubyCraft.Actualizaciones;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.Bloques.bloque_de_actualizaciones;

public class Buscar_Actualizaciones {

	private static final String Actualizacion_Url = "https://www.dropbox.com/s/fan0ya9zg5m10y9/RubyCraft-Updates.txt?raw=1";
	private static boolean NuevaVersion = false;
	public static boolean URLNOVALIDAERROR = false;
	
	public static void MirarActualizaciones(){
		new Thread("Actualizaciones"){
			
			public void run(){
				try {
					URL url = new URL(Actualizacion_Url);
					Scanner scanner = new Scanner(url.openStream());
					String Mensaje11 = scanner.nextLine();
					String Mensaje22 = scanner.nextLine();
					String Mensaje33 = scanner.nextLine();
					String Mensaje44 = scanner.nextLine();
					String Mensaje55 = scanner.nextLine();
					String Mensaje66 = scanner.nextLine();
					String Mensaje77 = scanner.nextLine();
					String Mensaje88 = scanner.nextLine();
					String Mensaje99 = scanner.nextLine();		
					String Mensaje1010 = scanner.nextLine();
					String Mensaje1111 = scanner.nextLine();		
					String Mensaje1212 = scanner.nextLine();
					String UltimaVersion = scanner.nextLine();
					String Mensaje1 = scanner.nextLine();
					String Mensaje2 = scanner.nextLine();
					String Mensaje3 = scanner.nextLine();
					scanner.close();
					if(!Referencia.VERSION.equals(UltimaVersion) && !URLNOVALIDAERROR){
						RubyCraft.logger.info("============================================================");
						RubyCraft.logger.info(UltimaVersion + " Esta es la Ultima Version de RubyCraft Disponible");
						bloque_de_actualizaciones.UltimaVersion = UltimaVersion;
						if(!Mensaje1.equals("")){
						RubyCraft.logger.info(Mensaje1);
						bloque_de_actualizaciones.Mensaje1 = Mensaje1;
						TestearActualizaciones.Mensaje1 = Mensaje1;
						}if(!Mensaje2.equals("")){
							RubyCraft.logger.info(Mensaje2);
							bloque_de_actualizaciones.Mensaje2 = Mensaje2;
							TestearActualizaciones.Mensaje2 = Mensaje2;
						}else{
							TestearActualizaciones.Mensaje2a = false;
						}	
						if(!Mensaje3.equals("")){
							RubyCraft.logger.info(Mensaje3);
							bloque_de_actualizaciones.Mensaje3 = Mensaje3;
							TestearActualizaciones.Mensaje3 = Mensaje3;
							RubyCraft.logger.info("============================================================");
						}else{
							TestearActualizaciones.Mensaje3a = false;
						}
						if(Mensaje1.equals("") && Mensaje2.equals("") && Mensaje3.equals("")){			
							RubyCraft.logger.info("No hay cambios en actualizacion");
							bloque_de_actualizaciones.Mensaje1 = "No Hay Cambios en actualizacion";
							TestearActualizaciones.Mensaje1 = "No hay Cambios en actualizacion";
							RubyCraft.logger.info("============================================================");
						}
						
						TestearActualizaciones.UltimaVersion = UltimaVersion;
						FijarNuevaVersion();
					}
				} catch (MalformedURLException e) {
					URLNOVALIDAERROR = true;
					
				} catch (IOException e) {
					RubyCraft.logger.info("Error al buscar actualizaciones: " + e);
					URLNOVALIDAERROR = true;
				}
			}
			
		}.start();
	}
	
	public static synchronized void FijarNuevaVersion(){
		NuevaVersion = true;
	}
	
	public static synchronized boolean HayNuevaVersion(){
		return NuevaVersion;
	}
	
}
