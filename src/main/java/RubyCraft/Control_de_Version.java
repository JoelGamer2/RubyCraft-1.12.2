package RubyCraft;

public class Control_de_Version {

	
	public static boolean Version_de_desarrollador = true;
	public static boolean Activar_Version_Trol = false;
	public static boolean Navidad_Activar = false;
	public static boolean Desactivar_comunicacion_con_server = false;
	
	public static void Iniciar() {
		
		if(Version_de_desarrollador) {
			
			if(Activar_Version_Trol) {
			RubyCraft.VersionTrol = true;
			
			}
					
			if(Navidad_Activar) {
				
				RubyCraft.Navidad = true;
			}
			
		
		}
		
	}
	
}
