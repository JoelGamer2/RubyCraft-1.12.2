package RubyCraft.Config;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.config.Property;
import RubyCraft.Referencia;
import RubyCraft.comunicacionconserver;
import RubyCraft.Eventos.Todos_los_eventos;
import RubyCraft.Iniciar.Dimensiones;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RubyCraftConfig {

	private static Configuration config = null;
	
	
	public static final String CATEGORY_NAME_EVENTOS = "Eventos_de_RubyCraft";
	public static final String CATEGORY_NAME_EXTRAS = "Cosas_Extras";
	
	public static boolean ValorEventodeMuerte;
	public static boolean MensajeActualizacion;
	
	public static void preInit() {
		File configFile = new File(Loader.instance().getConfigDir(), "RubyCraft/RubyCraft.cfg");
		config = new Configuration(configFile);
		syncFromFiles();
		
	}
	
	public static Configuration getConfig() {
		
		return config;
		
	}
	
	public static void clientPreInit() {
		
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}
	
	public static void syncFromFiles() {
		syncConfig(true, true);	
	}
	
	public static void synceFromGui() {
		syncConfig(false, true);
	}
	
	public static void syncFromFields() {
		syncConfig(false, false);
	}
	
	private static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig) {
		if(loadFromConfigFile)
			config.load();
		
		//Aqui va las Propertys
		Property EventoMueteMensaje  = config.get(CATEGORY_NAME_EVENTOS, "Coordenas_al_morir", true);
		EventoMueteMensaje.setComment("Esto si esta en false desactiva la vista de coordenadas de donde muriste. true por default significa que esta activado");
	    
		Property Actualizacion  = config.get(CATEGORY_NAME_EVENTOS, "Mostrar_Notificaciones_de_Actualizaciones", true);
		Actualizacion.setComment("Te notifica si esta en true de actualizaciones si lo pones en false en consola seguira apareciendo igualmente. Por defecto true");
	    
		Property Servercomunicacion = config.get(CATEGORY_NAME_EXTRAS, "comunicacion_con_el_server_time_of_timeout", 10);
		Servercomunicacion.setComment("Si lo pones en 0 se desactivara la comunicacion con el servidor de rubycraft si lo pones mas alto de 0 estara activado y sera el timepo de espera por si el servidor a lento es recomendable o desactivarlo o dejarlo como esta porque el sever no esta 24h a si que. DEFAULT:10");
		
		Property iddimension = config.get(CATEGORY_NAME_EXTRAS, "DimensionRuby_ID", 2);
		iddimension.setComment("Esto es la id de la dimension de ruby:");
		
		//Ordena
		List<String> propertyOrderBlocks = new ArrayList<String>();
		List<String> propertyOrderExtras = new ArrayList<String>();
		
		//Registra al archivo la config
		propertyOrderBlocks.add(EventoMueteMensaje.getName());
		propertyOrderBlocks.add(Actualizacion.getName());
		
		//Las categorias
		config.setCategoryPropertyOrder(CATEGORY_NAME_EVENTOS, propertyOrderBlocks);
		config.setCategoryPropertyOrder(CATEGORY_NAME_EXTRAS, propertyOrderExtras);
 		
		if(readFieldsFromConfig) {
			//Para que lea valores
			ValorEventodeMuerte = EventoMueteMensaje.getBoolean(); 
			MensajeActualizacion = Actualizacion.getBoolean();
			comunicacionconserver.ValorTimeOut = Servercomunicacion.getInt();
			Dimensiones.iddimensionruby = iddimension.getInt();
			
		}
		
		EventoMueteMensaje.set(ValorEventodeMuerte);
		
		if(config.hasChanged())
			config.save();
		
	}
	
	public static class ConfigEventHandler{
		
		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			if(event.getModID().equals(Referencia.MOD_ID)) {
				
				synceFromGui();
				
			}
			
		}
	}
	
}
