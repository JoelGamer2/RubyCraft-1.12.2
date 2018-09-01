package RubyCraft.Generacion;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registrar_generaciones {

	public static void Iniciar(){
		

		GameRegistry.registerWorldGenerator(new OreGenDimensiones(), 100);
		GameRegistry.registerWorldGenerator(new OreGenOverworld(), 100);
	

	}
	
}
