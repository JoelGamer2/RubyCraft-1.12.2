package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_reforzado_tier_1 extends Block {

	public bloque_reforzado_tier_1() {
		super(Material.IRON);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_I.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_REFORZADO_TIER_I.getRegistryName());
		
		setHardness(50.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.METAL);	
		
	}

	
}
