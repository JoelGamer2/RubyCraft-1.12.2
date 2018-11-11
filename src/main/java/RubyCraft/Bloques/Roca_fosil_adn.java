package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Roca_fosil_adn extends Block {

	public Roca_fosil_adn() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.ROCA_FOSIL_ADN.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.ROCA_FOSIL_ADN.getRegistryName());
		
		this.setHardness(4.0F);
		this.setResistance(3.0F);
		this.setHarvestLevel("pickaxe", 7);
		
	}

}
