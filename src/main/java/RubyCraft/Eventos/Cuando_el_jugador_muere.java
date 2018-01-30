package RubyCraft.Eventos;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Cuando_el_jugador_muere {

	
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent event){
		
		if(event.getEntity() instanceof EntityPlayer){
			
			event.getEntity().sendMessage(new TextComponentTranslation(TextFormatting.BLUE + event.getEntity().getName() + TextFormatting.GOLD + " Has Muerto en:" + TextFormatting.GREEN + " X:" + TextFormatting.RED + (int)event.getEntity().posX + TextFormatting.GREEN + " ,Y:" + TextFormatting.RED + (int)event.getEntity().posY + TextFormatting.GREEN + " ,Z:" + TextFormatting.RED + (int)event.getEntity().posZ));
			
		}
		
	}

}
