package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class generar_dragon extends Block {

	public generar_dragon() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.GENERAR_DRAGON.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.GENERAR_DRAGON.getRegistryName());
		
		setHardness(1.5F);
		setHarvestLevel("pickaxe", 1);
		
	}
	
	
}
