package RubyCraft.Bloques;

import RubyCraft.Referencia;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Dimensiones.Dimensiones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class prueba extends Block

{

	public prueba(){
		
		super(Material.ROCK);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.PRUEBA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.PRUEBA.getRegistryName());
		
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		playerIn.changeDimension(Dimensiones.iddimensionruby);
		
		return true;
	}
	
}