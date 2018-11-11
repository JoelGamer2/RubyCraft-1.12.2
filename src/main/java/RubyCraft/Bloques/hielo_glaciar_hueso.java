package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class hielo_glaciar_hueso extends Block {

	public hielo_glaciar_hueso() {
		super(Material.ICE);
		
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.HIELO_GLACIAR_HUESO.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.HIELO_GLACIAR_HUESO.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

	
	
}
