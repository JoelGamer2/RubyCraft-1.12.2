package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.material.Material;

public class prueba extends Bloque_con_Faro {

	public prueba() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.PRUEBA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.PRUEBA.getRegistryName());
		
		
		
	}


}
