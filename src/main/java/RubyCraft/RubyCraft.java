package RubyCraft;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;

import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Eventos.Evento;
import RubyCraft.Generacion.OreGen;
import RubyCraft.Generacion.Registrar_generaciones;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.Herramientas;
import RubyCraft.Iniciar.Iniciar_Eventos;
import RubyCraft.Iniciar.RItems;
import RubyCraft.Registrar.Crafteos;
import RubyCraft.Registrar.ModificarCosasMineCraftVanilla;
import RubyCraft.VersionTrol.BuscarVersionTrol;
import RubyCraft.proxy.CommonProxy;
import io.netty.handler.timeout.TimeoutException;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;


@Mod(modid = Referencia.MOD_ID, name = Referencia.NAME, version = Referencia.VERSION, acceptedMinecraftVersions = Referencia.ACCEPTED_VERSIONS)
public class RubyCraft {
   
	public static boolean VersionTrol = false;
	public static boolean Navidad = false;
	public static boolean Hallowen = false;
	public static boolean Dia_de_Los_Inocentes = false;
	public static boolean es_un_cliente_y_no_un_server = false;
	
	public static final org.apache.logging.log4j.Logger logger = LogManager.getFormatterLogger("RubyCraft");
	
    public static CreativeTabs Rubycrafttab = new RubyTab(CreativeTabs.getNextID(), Referencia.MOD_ID, Referencia.MOD_ID + "." + "Rubycrafttab", 0);	

	@Instance
	public static RubyCraft instance;
	
	@SidedProxy(clientSide = Referencia.CLIENT_PROXY_CLASS, serverSide = Referencia.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
       
		Control_de_Version.Iniciar();
		RubyCraftConfig.preInit();
		RubyCraftConfig.clientPreInit();
		
		if(VersionTrol == true){
			
			
		}else if(!VersionTrol){
		
			
		}
		if(!Control_de_Version.Version_de_desarrollador){		
		Buscar_Actualizaciones.MirarActualizaciones();
		Eventos_Calendario.Iniciar_Test_de_Calendario();
		}else if(Control_de_Version.Version_de_desarrollador){
			Buscar_Actualizaciones.MirarActualizacionesI();
		}
		BuscarVersionTrol.MirarVersionTrol();
				
		Evento.Iniciar();
		
        Registrar_generaciones.Iniciar();
		
		Armaduras.Iniciar();
		Armaduras.registrar();
		
		RItems.Iniciar();
		RItems.Registrar();
		
		
		Herramientas.Iniciar();
		Herramientas.registrar();
		
		Bloques.Iniciar();
		Bloques.Registrar();
		
		//Escaleras.Iniciar();
	//	Escaleras.Registrar();
		
		Iniciar_Eventos.Iniciar();
		
		
		ModificarCosasMineCraftVanilla.preinit();
		GameRegistry.registerWorldGenerator(new OreGen(), 100);
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){

		if(VersionTrol == true){
			
		}
		
		RubyCraft.proxy.init();
    RubyCraftSoundhandler.Iniciar();
		if(VersionTrol == false){
		Crafteos.IniciarTodo();

		}
		ModificarCosasMineCraftVanilla.init();
	
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) throws Exception{
       if(event.getSide()==Side.CLIENT) {
    	   if(!Control_de_Version.Desactivar_comunicacion_con_server) {
    	 comunicacionconserver.IntentarContactarconelServer();
    	   }
    	 RubyCraft.logger.info("DETECTADO:CLIENTE");
    	 es_un_cliente_y_no_un_server = true;
		}else if(event.getSide()==Side.SERVER) {
			RubyCraft.logger.info("DETECTADO:SERVER Desactivando algunas cosas que pueden llevar crash en el server");
			es_un_cliente_y_no_un_server = false;
		}
	   
		if(VersionTrol == true){
			
		}else{
		
		ModificarCosasMineCraftVanilla.postinit();
		}
		
	}
	
	public static void VersionTrolActivar(){
		VersionTrol = true;
		
		  
	   } 
	
}
