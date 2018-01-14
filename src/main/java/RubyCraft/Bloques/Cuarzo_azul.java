package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cuarzo_azul extends Block {

	public Cuarzo_azul() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CUARZO_AZUL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CUARZO_AZUL.getRegistryName());
		
		setHardness(1.5F);
		
	}

}
