package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class barro_congelado_hueso extends Block {

	public barro_congelado_hueso() {
		super(Material.ROCK);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.BARRO_CONGELADO_HUESO.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.BARRO_CONGELADO_HUESO.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
