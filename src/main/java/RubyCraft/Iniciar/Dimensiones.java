package RubyCraft.Iniciar;

import RubyCraft.Dimensiones.DimensiondeRuby;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class Dimensiones {

	public static final DimensionType RUBY = DimensionType.register("Ruby", "_ruby", 2, DimensiondeRuby.class, false);
	
	public static void registrarDimensiones() {
		
		DimensionManager.registerDimension(2, RUBY);
		
	}
	
}
