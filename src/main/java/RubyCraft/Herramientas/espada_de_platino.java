package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class espada_de_platino extends ItemSword {

	public espada_de_platino(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.ESPADA_DE_PLATINO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.ESPADA_DE_PLATINO.getRegistryName());
		
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

		if(world.isRemote && player.isSneaking()){
		    if(player.inventory.hasItemStack(new ItemStack(Blocks.ANVIL))) {
		    	player.sendMessage(new TextComponentTranslation("123", "asd")); 	
		    	player.inventoryContainer.inventoryItemStacks.remove(new ItemStack(Blocks.ANVIL));
		    	player.inventoryContainer.detectAndSendChanges();
		    	
		    	
		    }else {
		    	player.sendMessage(new TextComponentTranslation("poli", "asd"));

		    }
			
			
		}
		return super.onItemRightClick(world, player, hand);
	}

 }
	         
	

