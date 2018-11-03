package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_reforzado_tier_2 extends Block {

	public bloque_reforzado_tier_2() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_II.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_II.getRegistryName());
		
		setHardness(80.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.METAL);	
		
	}

	
}
