package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cuarzo_verde extends Block {

	public Cuarzo_verde() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CUARZO_VERDE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CUARZO_VERDE.getRegistryName());
		
		setHardness(1.5F);
		
	}

}
