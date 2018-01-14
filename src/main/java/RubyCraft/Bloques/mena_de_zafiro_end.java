package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class mena_de_zafiro_end extends Block {

	public mena_de_zafiro_end() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MENA_DE_ZAFIRO_END.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MENA_DE_ZAFIRO_END.getRegistryName());
		
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(Float.MAX_VALUE);
		
	}

}
