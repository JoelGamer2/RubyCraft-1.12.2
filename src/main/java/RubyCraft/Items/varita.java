package RubyCraft.Items;

import java.util.List;

import javax.annotation.Nullable;

import RubyCraft.Referencia;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class varita extends Item {

	public varita(){
		
		setUnlocalizedName(Referencia.RubyCraftItems.VARITA.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.VARITA.getRegistryName());
		
		setMaxStackSize(1);
		setMaxDamage(1);
		
	}
	
	 /**
     * Called when a Block is right-clicked with this Item
     */
    
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Bloques.mesa_de_zafiro_basica)
                {
                    this.setBlock(itemstack, player, worldIn, pos, Bloques.mesa_de_zafiro.getDefaultState());
                    return EnumActionResult.SUCCESS;
                
            }

            return EnumActionResult.PASS;
            }
        }
        return EnumActionResult.PASS;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }

    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, RubyCraftSoundhandler.mesa_de_conjuraciones_hechizo, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }
    
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
    	
    tooltip.add(TextFormatting.GREEN + "Este Item Sirve para convertir la Mesa de Zafiro Basica en la " + TextFormatting.RED + "Mesa de Zafiro Real");
    tooltip.add(TextFormatting.GOLD + "This Item it use to turn the basic zafiro table into the " + TextFormatting.DARK_AQUA + "Real zafiro crafting table");
    
    }
}
