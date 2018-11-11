package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Roca_fosil extends Block {

	public Roca_fosil() {
		super(Material.ROCK);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.ROCA_FOSIL.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.ROCA_FOSIL.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
