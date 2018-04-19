package RubyCraft.Bloques;

import RubyCraft.Referencia;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class prueba extends Block{

	public prueba() {
		super(Material.ROCK);
		
		
		setUnlocalizedName(Referencia.RubyCraftBloques.PRUEBA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.PRUEBA.getRegistryName());
		
		
		
	}	
	
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		
		if(worldIn.canBlockSeeSky(pos)) {
			
			playerIn.sendMessage(new TextComponentTranslation("veo el cielo"));
			
			
			if(worldIn.isRaining()) {
				
				playerIn.sendMessage(new TextComponentTranslation("y llueve"));
				
			}
		}
		
		return true;
		
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		worldIn.setRainStrength(10.0F);
		super.onEntityWalk(worldIn, pos, entityIn);
	}
	
}