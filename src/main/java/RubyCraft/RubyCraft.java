package RubyCraft;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;

import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import RubyCraft.Biomas.IniciarBiomas;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Dimensiones.Dimensiones;
import RubyCraft.Eventos.Evento;
import RubyCraft.Generacion.OreGenDimensiones;
import RubyCraft.Generacion.Registrar_generaciones;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.Herramientas;
import RubyCraft.Iniciar.Iniciar_Eventos;
import RubyCraft.Iniciar.RItems;
import RubyCraft.Iniciar.TileEntityR;
import RubyCraft.Registrar.Crafteos;
import RubyCraft.Registrar.ModificarCosasMineCraftVanilla;
import RubyCraft.Server.Cambiar_cosas_para_server;
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
	public static boolean ModActualizado = true;
	
	public static final org.apache.logging.log4j.Logger logger = LogManager.getFormatterLogger("RubyCraft");
	
    public static CreativeTabs Rubycrafttab = new RubyTab(CreativeTabs.getNextID(), Referencia.MOD_ID, Referencia.MOD_ID + "." + "Rubycrafttab", 0);	

	@Instance
	public static RubyCraft instance;
	
	@SidedProxy(clientSide = Referencia.CLIENT_PROXY_CLASS, serverSide = Referencia.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) throws Exception{
		
		
		if(event.getSide()==Side.CLIENT) {
			es_un_cliente_y_no_un_server = true;
			Cambiar_comportamiento_para_los_eventos.Iniciar();
		}else if(event.getSide()==Side.SERVER) {
			Cambiar_cosas_para_server.pre_init();
			es_un_cliente_y_no_un_server = false;
		}
		
		  Control_de_Version.Iniciar(); 
		RubyCraftConfig.preInit();
		RubyCraftConfig.clientPreInit();
		if(Control_de_Version.Desactivar_comunicacion_con_server == false) {
		     comunicacionconserver.IntentarContactarconelServer();
		    	   }
		if(VersionTrol == true){
			
			
		}else if(!VersionTrol){
		
			
		}
		if(!Control_de_Version.Version_de_desarrollador){		
		Buscar_Actualizaciones.MirarActualizaciones();
		}else if(Control_de_Version.Version_de_desarrollador){
			Buscar_Actualizaciones.MirarActualizacionesI();
		}
		
		
			
		Eventos_Calendario.Iniciar_Test_de_Calendario();
			
		BuscarVersionTrol.MirarVersionTrol();
				
		Evento.Iniciar();
		
       
		
		Armaduras.Iniciar();
		
		
		RItems.Iniciar();
		

		
		Herramientas.Iniciar();
		
		
		Bloques.Iniciar();
		
		
		//Escaleras.Iniciar();
	//	Escaleras.Registrar();
		
		Iniciar_Eventos.Iniciar();
		
		
		ModificarCosasMineCraftVanilla.preinit();
		
		
		Dimensiones.registrarDimensiones();
		IniciarBiomas.registarBiomas();
		
		if(ModActualizado) {
			Armaduras.registrar();
			RItems.Registrar();
			Herramientas.registrar();
			Bloques.Registrar(); 
			Registrar_generaciones.Iniciar();
		}
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){

		TileEntityR.RegistrarTileEntitys();
		
		if(VersionTrol == true){
			
		}
		
		RubyCraft.proxy.init();
    RubyCraftSoundhandler.Iniciar();
		if(VersionTrol == false && RubyCraft.ModActualizado){
		Crafteos.IniciarTodo();

		}
		ModificarCosasMineCraftVanilla.init();
	
		if(es_un_cliente_y_no_un_server == false) {
			Cambiar_cosas_para_server.init();
		}
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) throws Exception{
       if(event.getSide()==Side.CLIENT) {
    	  
    	 RubyCraft.logger.info("DETECTADO:CLIENTE");
    	 es_un_cliente_y_no_un_server = true;
		}else if(event.getSide()==Side.SERVER) {
			RubyCraft.logger.info("DETECTADO:SERVER Desactivando algunas cosas que pueden llevar crash en el server");
			es_un_cliente_y_no_un_server = false;
			Cambiar_cosas_para_server.posinit();
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
