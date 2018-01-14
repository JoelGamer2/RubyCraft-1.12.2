package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class mena_de_zafiro extends Block {

	public mena_de_zafiro() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MENA_DE_ZAFIRO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MENA_DE_ZAFIRO.getRegistryName());
		
		setHardness(1.5F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 4);
		
	}

}
