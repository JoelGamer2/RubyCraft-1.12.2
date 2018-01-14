package RubyCraft.Maquinas;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class mesa_de_zafiro extends Block {

	public mesa_de_zafiro() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MESA_DE_ZAFIRO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MESA_DE_ZAFIRO.getRegistryName());
		
		setSoundType(SoundType.WOOD);
		this.setHardness(3.5F).setResistance(0.5F);
	}

	/**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
    if(!player.isSneaking()){
            player.openGui(RubyCraft.instance, Bloques.guiIDMesadeTrabajodeZafiro, world, pos.getX(), pos.getY(), pos.getZ());
        }
	return true;
    }
	
	
}
