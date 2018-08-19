package RubyCraft.Iniciar;

import RubyCraft.Referencia;
import RubyCraft.TileEntity.TileEntityMinero;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityR {

	public static void RegistrarTileEntitys() {
		
		GameRegistry.registerTileEntity(TileEntityMinero.class, Referencia.MOD_ID + ":TileEntityMinero");
		
		
	}
	
}
