package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class madera_fosil_hueso extends Block {

	public madera_fosil_hueso() {
		super(Material.WOOD);
	
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.MADERA_FOSIL_HUESO.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.MADERA_FOSIL_HUESO.getRegistryName());
		
		setHardness(4.0F).setResistance(3.0F);
		setHarvestLevel("pickaxe", 7);
		
	}

}
