package RubyCraft;

import java.io.File;

public class Cambiar_comportamiento_para_los_eventos {

	public static void Iniciar() {
		//ESTA EN DESSAROLLO POR ESO ESTA DESACTIVADO
		
	//	Crear_carpeta_para_lo_del_menu();
	//	cambiar_nombre_background();
	}
	
	public static void Crear_carpeta_para_lo_del_menu() {

		String nombre = System.getProperty("user.name");
		
        File file = new File("C:\\Users\\" + nombre + "\\AppData\\Roaming\\.minecraft\\resourcepacks\\RubyCraftTexturePack");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }


    }

	public static void cambiar_nombre_background() {
		
		if(RubyCraft.Navidad) {
		
		File dir = new File("C:\\Users\\pc\\AppData\\Roaming\\.minecraft\\resourcepacks\\RubyCraftTexturePack\\assets\\minecraft\\textures\\gui\\title\\navidad");
        File newName = new File("C:\\Users\\pc\\AppData\\Roaming\\.minecraft\\resourcepacks\\RubyCraftTexturePack\\assets\\minecraft\\textures\\gui\\title\\background");
        if ( dir.isDirectory() ) {
                dir.renameTo(newName);
        } else {
                dir.mkdir();
                dir.renameTo(newName);
        }

		
	 }
	}
}
	

