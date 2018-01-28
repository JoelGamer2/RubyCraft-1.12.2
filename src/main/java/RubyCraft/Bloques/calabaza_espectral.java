package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class calabaza_espectral extends Block {

	public calabaza_espectral() {
		super(Material.PLANTS);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.CALABAZA_ESPECTRAL.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.CALABAZA_ESPECTRAL.getRegistryName());
				
		setHardness(1.0F);
		setSoundType(SoundType.WOOD);
		
	}
	
}
