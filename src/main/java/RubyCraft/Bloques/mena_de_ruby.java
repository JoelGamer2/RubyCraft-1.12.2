package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class mena_de_ruby extends Block {

	public mena_de_ruby() {
		super(Material.ROCK);

		setUnlocalizedName(Referencia.RubyCraftBloques.MENA_DE_RUBY.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MENA_DE_RUBY.getRegistryName());
		
		setHardness(1.5F).setHarvestLevel("pickaxe", 2);
		
		
	}

}
