package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Bases.Bloque_con_Faro;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Bloque_de_Zafiro extends Bloque_con_Faro {

	public Bloque_de_Zafiro() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_ZAFIRO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_ZAFIRO.getRegistryName());
		
		this.setHardness(1.0F).setHarvestLevel("pickaxe", 3);
		this.setSoundType(SoundType.METAL);
		
	}
	
	
}
