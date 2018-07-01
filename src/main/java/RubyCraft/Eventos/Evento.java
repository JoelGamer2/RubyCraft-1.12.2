package RubyCraft.Eventos;

import RubyCraft.Actualizaciones.TestearActualizaciones;
import RubyCraft.ArmadurasConEventos.casco_de_tortuga;
import RubyCraft.VersionTrol.trol;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Evento {


	public static void Iniciar() {
		
		FMLCommonHandler.instance().bus().register(new trol());
		FMLCommonHandler.instance().bus().register(new TestearActualizaciones());
		FMLCommonHandler.instance().bus().register(new Todos_los_eventos());		
	}
}
