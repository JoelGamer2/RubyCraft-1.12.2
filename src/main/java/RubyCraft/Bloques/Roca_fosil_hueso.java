package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Roca_fosil_hueso extends Block {

	public Roca_fosil_hueso() {
		super(Material.ROCK);
	
		
		setUnlocalizedName(Referencia.RubyCraftBloques.ROCA_FOSIL_HUESO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.ROCA_FOSIL_HUESO.getRegistryName());
		
		setHardness(4.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
