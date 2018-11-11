package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class barro_congelado extends Block {

	public barro_congelado() {
		super(Material.ROCK);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.BARRO_CONGELADO.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.BARRO_CONGELADO.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
