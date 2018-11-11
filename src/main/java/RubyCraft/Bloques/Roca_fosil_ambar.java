package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Roca_fosil_ambar extends Block {

	public Roca_fosil_ambar() {
		super(Material.ROCK);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.ROCA_FOSIL_AMBAR.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.ROCA_FOSIL_AMBAR.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
