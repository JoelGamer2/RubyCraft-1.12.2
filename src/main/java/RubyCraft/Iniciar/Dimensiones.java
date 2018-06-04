package RubyCraft.Iniciar;

import RubyCraft.Dimensiones.DimensiondeRuby;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class Dimensiones {
    public static int iddimensionruby = 2;
	public static final DimensionType RUBY = DimensionType.register("Ruby", "_ruby", iddimensionruby, DimensiondeRuby.class, false);
	
	
	public static void registrarDimensiones() {
		
		DimensionManager.registerDimension(iddimensionruby, RUBY);
		
	}
	
}
