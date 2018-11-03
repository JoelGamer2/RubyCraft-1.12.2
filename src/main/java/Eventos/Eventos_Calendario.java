package Eventos;

import java.util.Calendar;

import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Eventos_Calendario {

	public static void Iniciar_Test_de_Calendario() {
		
		 /** Testear Calendario **/
		 
		//Testear Navidad
			Calendar calendar = Calendar.getInstance();
		if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 31 && Control_de_Version.Navidad_Activar == false){
			 Verificar_Fechas.Navidad = true;
		       
		       if(RubyCraft.es_un_cliente_y_no_un_server) {
		    	   Verificar_Fechas.Iniciar();
		       }else if(!RubyCraft.es_un_cliente_y_no_un_server) {
		    	   RubyCraft.Navidad = true;
		    	   
		       }
	      
	        Texturas_Navidad();
	        
	        if(calendar.get(2) + 1 == 12 && calendar.get(5) == 28) {
	        	RubyCraft.Dia_de_Los_Inocentes = true;
	        }
	    }else{
	    	//Testear Hallowen
	    	if(calendar.get(2) + 1 == 10 && calendar.get(5) == 31){
	    		 Verificar_Fechas.HalloWen = true;
	    		 if(RubyCraft.es_un_cliente_y_no_un_server) {
	    			 Verificar_Fechas.Iniciar();
	  		       }else if(!RubyCraft.es_un_cliente_y_no_un_server) {
			    	   RubyCraft.Hallowen = true;
			    	   
			       }
	    		
	    		} else if (Control_de_Version.Navidad_Activar == false){
	    			RubyCraft.Navidad = false;
	    			RubyCraft.Hallowen = false;
	    			RubyCraft.Dia_de_Los_Inocentes = false;
	    			
	    			Texturas_Normales();
	    		}else if(Control_de_Version.Navidad_Activar == true) {
	    			
	    			Texturas_Navidad();
	    			RubyCraft.Navidad = true;
	    			
	    		}
	      }
		
	    }
		
	
	public static void Texturas_Normales() {
			
		
	}
	
	public static void Texturas_Navidad() {
	
		
	}
	public static void Texturas_Hallowen() {
		
		
	}
	
	private static void RegistrarRenderizado(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	private static void RegistrarRenderNavidad(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(":Navidad/" + block.getRegistryName(), "inventory"));
	}
	
	
		
	
}
