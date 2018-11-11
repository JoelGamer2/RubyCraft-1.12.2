package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class barro extends Block {

	public barro() {
		super(Material.SAND);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.BARRO.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.BARRO.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
