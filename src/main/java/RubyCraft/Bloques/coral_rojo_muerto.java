package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class coral_rojo_muerto extends Block {

	public coral_rojo_muerto() {
		super(Material.ROCK);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CORAL_ROJO_MUERTO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CORAL_ROJO_MUERTO.getRegistryName());
		
		setHardness(1.5F);
		setResistance(2.0F);
	
	}

}
