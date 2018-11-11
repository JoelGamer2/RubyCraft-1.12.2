package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class monton_de_fosiles extends Block {

	public monton_de_fosiles() {
		super(Material.ROCK);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.MONTON_DE_FOSILES.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.MONTON_DE_FOSILES.getRegistryName());

		
		setHardness(4.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		
	}

}
