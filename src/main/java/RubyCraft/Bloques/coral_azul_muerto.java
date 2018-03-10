package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class coral_azul_muerto extends Block {

	public coral_azul_muerto() {
		super(Material.ROCK);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CORAL_AZUL_MUERTO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CORAL_AZUL_MUERTO.getRegistryName());
		
		setHardness(1.5F);
		setResistance(2.0F);
	
	}

}
