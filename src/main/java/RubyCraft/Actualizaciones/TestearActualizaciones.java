package RubyCraft.Actualizaciones;

import RubyCraft.Control_de_Version;
import RubyCraft.Referencia;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Handles.RubyCraftSoundhandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TestearActualizaciones {

	private boolean Iniciadosesion = false;
	public static boolean Mensaje2a = true;
	public static boolean Mensaje3a = true;
	public static String UltimaVersion = "0";
	public static String Mensaje1 = "";
	public static String Mensaje2 = "";
	public static String Mensaje3 = "";

	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		if(Buscar_Actualizaciones.HayNuevaVersion() && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null && RubyCraftConfig.MensajeActualizacion == true && !Buscar_Actualizaciones.URLNOVALIDAERROR){
			Minecraft.getMinecraft().player.playSound(RubyCraftSoundhandler.actualiza, 1.0F , 1.0F);
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " Hay Una Nueva Version Disponible: " + TextFormatting.RED + UltimaVersion));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje1));
			if(Mensaje2a == true){
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje2));
			}if(Mensaje3a == true){
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Mensaje3));
			}
			Iniciadosesion = true;
		}else if(Control_de_Version.Version_de_desarrollador == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null && RubyCraftConfig.MensajeActualizacion == true) {
			
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " Cuidado esta es la DeveloperBuild " + TextFormatting.GOLD + "puede ocurrir muchos bugs Version: " + TextFormatting.RED + Referencia.VERSION + TextFormatting.RED + " INDEV"));
            Minecraft.getMinecraft().player.playSound(RubyCraftSoundhandler.actualiza, 1.0F, 1.0F);
			Iniciadosesion = true;
		}if(!Iniciadosesion && Minecraft.getMinecraft().currentScreen == null && Buscar_Actualizaciones.URLNOVALIDAERROR && !Control_de_Version.Version_de_desarrollador) {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentTranslation(TextFormatting.GRAY + "[" + TextFormatting.GREEN + "RubyCraft" + TextFormatting.GRAY + "] " + TextFormatting.GOLD + Minecraft.getMinecraft().player.getName() + " No se pudo encontrar actualizaciones " + TextFormatting.GOLD + "error de conexion" + TextFormatting.RED));
			Iniciadosesion = true;

		}
	}
	
}
