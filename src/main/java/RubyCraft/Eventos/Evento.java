package RubyCraft.Eventos;

import RubyCraft.Actualizaciones.TestearActualizaciones;
import RubyCraft.VersionTrol.trol;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Evento {


	public static void Iniciar() {
		
		FMLCommonHandler.instance().bus().register(new trol());
		FMLCommonHandler.instance().bus().register(new TestearActualizaciones());
		FMLCommonHandler.instance().bus().register(new Cuando_el_jugador_muere());		
	}
}
