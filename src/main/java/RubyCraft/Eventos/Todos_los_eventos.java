package RubyCraft.Eventos;

import RubyCraft.comunicacionconserver;
import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Handles.RubyCraftSoundhandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

public class Todos_los_eventos {

	public static boolean Iniciadosesion = true;
	
	//Mensaje de donde has muerto
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent event){
		
		if(event.getEntity() instanceof EntityPlayer){
			if(RubyCraftConfig.ValorEventodeMuerte==true) {
			event.getEntity().sendMessage(new TextComponentTranslation(TextFormatting.BLUE + event.getEntity().getName() + TextFormatting.GOLD + " Has Muerto en:" + TextFormatting.GREEN + " X:" + TextFormatting.RED + (int)event.getEntity().posX + TextFormatting.GREEN + " ,Y:" + TextFormatting.RED + (int)event.getEntity().posY + TextFormatting.GREEN + " ,Z:" + TextFormatting.RED + (int)event.getEntity().posZ));
			}
		}
		
	}
	
	
	@SubscribeEvent
	public void OnPlayerTickEvent(PlayerTickEvent player) {
		
		//player.player.playSound(RubyCraftSoundhandler.casco_de_tortuga, 1.0F, 1.0F);
		
		if(player.player.dimension == 2 && Minecraft.getMinecraft().currentScreen == null && Iniciadosesion) {
			
			player.player.playSound(RubyCraftSoundhandler.ruby, Float.MAX_VALUE, 1.0F);
			Iniciadosesion = false;
		 
		}
		if(!(player.player.dimension == 2)) {
			Iniciadosesion = true;
		}
		
	}
	
	@SubscribeEvent
	public void onWorldTickEevent(WorldTickEvent event) {
		
		
		
	}
	

}
