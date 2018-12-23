package RubyCraft.Maquinas;

import RubyCraft.Referencia;
import RubyCraft.TileEntity.TileEntityMinero;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class minero extends Block implements ITileEntityProvider{

	public minero() {
		super(Material.ROCK);
		
		this.setUnlocalizedName(Referencia.RubyCraftBloques.MINERO.getUnlocalizedName());
		this.setRegistryName(Referencia.RubyCraftBloques.MINERO.getRegistryName());
		setHardness(1.0F);
		setHarvestLevel("pickaxe", 1);
	}

	
	@Override
	public boolean hasTileEntity() {
		return true;
	   }

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityMinero();
	         }


	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityMinero();
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer,ItemStack stack) {
		
		BlockPos xmenoszmenos = new BlockPos(pos.getX() - 1,pos.getY(), pos.getZ()-1);
		BlockPos xmenoszmas = new BlockPos(pos.getX() - 1,pos.getY(), pos.getZ()+1);
		BlockPos xmasszmas = new BlockPos(pos.getX() + 1,pos.getY(), pos.getZ()+1);
		BlockPos xmaszmenos = new BlockPos(pos.getX() + 1,pos.getY(), pos.getZ()-1);

		
		if(world.getBlockState(pos.east()).getBlock() == Blocks.AIR) {
		world.setBlockState(pos.east(), Blocks.STONE.getDefaultState());
		}
		
		if(world.getBlockState(pos.west()).getBlock() == Blocks.AIR) {
		world.setBlockState(pos.west(), Blocks.STONE.getDefaultState());
		}
		
		
		if(world.getBlockState(pos.south()).getBlock() == Blocks.AIR) {
		world.setBlockState(pos.south(), Blocks.STONE.getDefaultState());
		}
		
		if(world.getBlockState(xmenoszmenos).getBlock() == Blocks.AIR) {
		world.setBlockState(xmenoszmenos, Blocks.STONE.getDefaultState());
		}
		
		if(world.getBlockState(xmenoszmas).getBlock() == Blocks.AIR) {
		world.setBlockState(xmenoszmas, Blocks.STONE.getDefaultState());
		}
		
		if(world.getBlockState(xmasszmas).getBlock() == Blocks.AIR) {
		world.setBlockState(xmasszmas, Blocks.STONE.getDefaultState());
		}
		
		if(world.getBlockState(xmaszmenos).getBlock() == Blocks.AIR) {
		world.setBlockState(xmaszmenos, Blocks.STONE.getDefaultState());

		}
		
	}
	
}
