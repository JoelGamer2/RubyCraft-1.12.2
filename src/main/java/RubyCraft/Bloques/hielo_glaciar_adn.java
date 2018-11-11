package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class hielo_glaciar_adn extends Block {

	public hielo_glaciar_adn() {
		super(Material.ICE);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.HIELO_GLACIAR_ADN.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.HIELO_GLACIAR_ADN.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
