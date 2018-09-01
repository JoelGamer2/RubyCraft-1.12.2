package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Dimensiones.Dimensiones;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.RItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

public class Todos_los_eventos {

	public static boolean Iniciadosesion = true;
	public static int tick = 0;
	public static int cooldown = 200;
	
	  public static DamageSource RadioActividad = new DamageSource("RadioActividad").setMagicDamage();

	
	//Mensaje de donde has muerto
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent event){
		
		if(event.getEntity() instanceof EntityPlayer){
			if(RubyCraftConfig.ValorEventodeMuerte==true) {
			event.getEntity().sendMessage(new TextComponentTranslation(TextFormatting.BLUE + event.getEntity().getName() + TextFormatting.GOLD + " Has Muerto en:" + TextFormatting.GREEN + " X:" + TextFormatting.RED + (int)event.getEntity().posX + TextFormatting.GREEN + " ,Y:" + TextFormatting.RED + (int)event.getEntity().posY + TextFormatting.GREEN + " ,Z:" + TextFormatting.RED + (int)event.getEntity().posZ + TextFormatting.GOLD +" Has muerto en la dimension:" + TextFormatting.BLUE + event.getEntity().dimension));
			}
		}
		
	}
	
	
	@SubscribeEvent
	public void OnPlayerTickEvent(PlayerTickEvent player) {
		//Poner Musica dimension
		
		//player.player.playSound(RubyCraftSoundhandler.casco_de_tortuga, 1.0F, 1.0F);
		if(RubyCraft.es_un_cliente_y_no_un_server == true) {
		if(player.player.dimension == Dimensiones.iddimensionruby && Minecraft.getMinecraft().currentScreen == null) {
			if(Iniciadosesion) {
			player.player.playSound(RubyCraftSoundhandler.ruby, Float.MAX_VALUE, 1.0F);
			Iniciadosesion = false;
			}
		}
		if(!(player.player.dimension == Dimensiones.iddimensionruby)) {
			Iniciadosesion = true;
		}
	 }		
		
		    //Testear si no tiene la armadura puesta
		    ItemStack casco = player.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
	        ItemStack pechera = player.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);  
	        ItemStack pantacas = player.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);  
	        ItemStack botas = player.player.getItemStackFromSlot(EntityEquipmentSlot.FEET);  

	            if (!(casco.getItem() == Armaduras.casco_de_uranio) || !(pechera.getItem() == Armaduras.pechera_de_uranio) || !(pantacas.getItem() == Armaduras.pantacas_de_uranio) || !(botas.getItem() == Armaduras.botas_de_uranio)) {	                 	            		
	            		           
	            	
	            	if(player.player.inventory.hasItemStack(new ItemStack(RItems.uranio))) {
	        			
	        			
	        				player.player.attackEntityFrom(RadioActividad, 4.0F);
	        			
	        			
	        		}
	              }
		
		//Dar Jugador veneno si no tiene puesta la armadura de uranio para cojer uranio
		
		
	}
	
	@SubscribeEvent
	public void OnWorldTick(WorldTickEvent event) {
		
		
		
	}
	
	
}

