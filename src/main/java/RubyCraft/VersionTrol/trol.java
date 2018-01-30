package RubyCraft.VersionTrol;

import RubyCraft.RubyCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class trol {

	private boolean Iniciadosesion = false;
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		if(BuscarVersionTrol.HayVersionTrol() && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
		     Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + "La Version Trol esta Activada."));
			Iniciadosesion = true;
			RubyCraft.VersionTrol = true;
		}
	}
	
}
