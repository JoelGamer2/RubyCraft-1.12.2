package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class bloque_de_caca extends Block {

	public bloque_de_caca() {
		super(Material.GROUND);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_CACA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_CACA.getRegistryName());
		
		this.setHardness(0.5F);
		this.setSoundType(SoundType.GROUND);
		
	}
	
}
