package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.BloqueSinUsoEnEstaVersion;
import net.minecraft.block.material.Material;

public class mena_de_platino extends BloqueSinUsoEnEstaVersion {

	public mena_de_platino() {
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MENA_DE_PLATINO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MENA_DE_PLATINO.getRegistryName());
		
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(5.0F);
		
	}

}
