package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.material.Material;

public class bloque_de_pedernal extends Bloque_con_Faro {

	public bloque_de_pedernal() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_De_PEDERNAL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_De_PEDERNAL.getRegistryName());
		
		setHardness(1.5F);
		setHarvestLevel("pickaxe", 1);
		
	}

}
