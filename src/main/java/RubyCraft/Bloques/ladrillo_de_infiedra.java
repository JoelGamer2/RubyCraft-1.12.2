package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ladrillo_de_infiedra extends Block {

	public ladrillo_de_infiedra() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.LADRILLO_DE_INFIEDRA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.LADRILLO_DE_INFIEDRA.getRegistryName());
		
		setHardness(1.0F);
		
	}

}
