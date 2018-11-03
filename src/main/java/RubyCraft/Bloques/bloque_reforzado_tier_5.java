package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_reforzado_tier_5 extends Block {

	public bloque_reforzado_tier_5() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_V.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_V.getRegistryName());
		
		setHardness(110.0F);
		setResistance(250.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.METAL);	
		
	}

	
}
