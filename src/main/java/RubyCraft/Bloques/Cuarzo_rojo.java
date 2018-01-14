package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cuarzo_rojo extends Block {

	public Cuarzo_rojo() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CUARZO_ROJO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CUARZO_ROJO.getRegistryName());
		
		setHardness(1.5F);
		
	}

}
