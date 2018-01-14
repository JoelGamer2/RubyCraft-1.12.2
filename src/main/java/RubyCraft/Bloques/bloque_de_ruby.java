package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_ruby extends Bloque_con_Faro {

	public bloque_de_ruby() {
		super(Material.ROCK);
		

		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_RUBY.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_RUBY.getRegistryName());
		
		this.setHardness(1.0F).setHarvestLevel("pickaxe", 2);
		this.setSoundType(SoundType.METAL);
		
	}

	
}
