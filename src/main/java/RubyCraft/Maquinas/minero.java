package RubyCraft.Maquinas;

import RubyCraft.Referencia;
import RubyCraft.TileEntity.TileEntityMinero;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
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

}
