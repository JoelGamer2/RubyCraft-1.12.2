package RubyCraft.Eventos;

import net.minecraft.block.BlockBed;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class Cuando_el_jugador_muere {

	
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent event){
		
		if(event.getEntity() instanceof EntityPlayer){
			
			event.getEntity().sendMessage(new TextComponentTranslation(event.getEntity().getName() + " Has Muerto en:" + " X:" + (int)event.getEntity().posX + " ,Y:" + (int)event.getEntity().posY + " ,Z:" + (int)event.getEntity().posZ));
			
		}
		
	}

}
