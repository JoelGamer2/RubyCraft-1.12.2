package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_reforzado_tier_3 extends Block {

	public bloque_reforzado_tier_3() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_III.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_III.getRegistryName());
		
		setHardness(90.0F);
		setResistance(150.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.METAL);	
		
	}

	
}
