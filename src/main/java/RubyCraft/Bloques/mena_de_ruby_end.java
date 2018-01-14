package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class mena_de_ruby_end extends Block {

	public mena_de_ruby_end() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MENA_DE_RUBY_END.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MENA_DE_RUBY_END.getRegistryName());
		
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(Float.MAX_VALUE);
		
		
	}

}
