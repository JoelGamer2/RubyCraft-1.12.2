package Eventos;

import RubyCraft.RubyCraft;

public class IniciarItemsEventos {

	
	public static void Iniciartodo() {
		Navidad();
		Hallowen();
		Crafteos();
	}
	
	public static void Navidad() {
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
	
	public static void Hallowen() {
		if(RubyCraft.Hallowen) {
			
			
			
		}else if(RubyCraft.Navidad) {
			
			
			
		}
	}
	
	
	
	public static void Crafteos() {
		
		
		if(RubyCraft.Hallowen) {
			
		}
		
		
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
}
