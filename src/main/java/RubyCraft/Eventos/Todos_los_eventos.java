package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Config.RubyCraftConfig;
import RubyCraft.Dimensiones.Dimensiones;
import RubyCraft.Handles.RubyCraftSoundhandler;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.RItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import scala.util.Random;

public class Todos_los_eventos {
	public static boolean Iniciadosesion = true;
	public static DamageSource MuetePorInsolacion = new DamageSource("Insolacion").setMagicDamage().setDamageIsAbsolute().setDamageBypassesArmor();
	public static int tick = 0;
	public static int cooldown = 200;
	public static boolean Mensaje = false;
	public static DamageSource RadioActividad = new DamageSource("RadioActividad").setMagicDamage();
	//Mensaje de donde has muerto
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent event){		
		/**Pone mensaje de Muerte en el chat con coordenadas y Dimension donde has muerto**/
		if(event.getEntity() instanceof EntityPlayer){
			if(RubyCraftConfig.ValorEventodeMuerte==true) {
			event.getEntity().sendMessage(new TextComponentTranslation(TextFormatting.BLUE + event.getEntity().getName() + TextFormatting.GOLD + " Has Muerto en:" + TextFormatting.GREEN + " X:" + TextFormatting.RED + (int)event.getEntity().posX + TextFormatting.GREEN + " ,Y:" + TextFormatting.RED + (int)event.getEntity().posY + TextFormatting.GREEN + " ,Z:" + TextFormatting.RED + (int)event.getEntity().posZ + TextFormatting.GOLD +" Has muerto en la dimension:" + TextFormatting.BLUE + event.getEntity().dimension));
			}
		}	
	}
	@SubscribeEvent
	public void OnPlayerTickEvent(PlayerTickEvent event) {	
		/**Comrpueba los nombres de los jugadores y si son jugadores de chaoticraft Hace funciones especiales para el**/
		  if(event.player.getName().equalsIgnoreCase("JoelGamer2") || event.player.getName().equalsIgnoreCase("Patxis") || event.player.getName().equalsIgnoreCase("Markus_Parker") | event.player.getName().equalsIgnoreCase("Maverick8812") || event.player.getName().equalsIgnoreCase("totalgamer23") || event.player.getName().equalsIgnoreCase("Juanathan_M") || event.player.getName().equalsIgnoreCase("Zedraliu")) {	
			/**Esta funcion solo te deja volar si tienes un Item especifico en el Inventario**/
		  if(!event.player.capabilities.isCreativeMode && !event.player.inventory.hasItemStack(new ItemStack(RItems.anillo_angelico, 1)) && event.player.world.getDifficulty() == EnumDifficulty.HARD) {
			  event.player.capabilities.allowFlying = false;
			  event.player.capabilities.isFlying = false;
		}else if(event.player.capabilities.isCreativeMode && !event.player.inventory.hasItemStack(new ItemStack(RItems.anillo_angelico, 1)) && event.player.world.getDifficulty() == EnumDifficulty.HARD) {
			event.player.capabilities.allowFlying = true;	     
		}  
		  /**Hace daño a los Jugadores que estan abajo de la capa 120 y sea de dia y el Mundo este en dificultad Dificl se puede evitar si tieenes un Item en especifico en el Inventario**/
		if(event.player.world.isDaytime() && event.player.world.getDifficulty() == EnumDifficulty.HARD && !event.player.inventory.hasItemStack(new ItemStack(RItems.pompa_de_imunidad,1))) {	
			if(event.player.posY < 120) {
				event.player.attackEntityFrom(MuetePorInsolacion, 1.0F);
		      }
		   }
		
		 if(!event.player.world.isDaytime() && !(event.player.posY < 120) && !event.player.inventory.hasItemStack(new ItemStack(RItems.pompa_de_imunidad,1)) && event.player.world.getDifficulty() == EnumDifficulty.HARD) {
			  event.player.addPotionEffect(new PotionEffect(Potion.getPotionById(17), 50, 0));
		  }
		
		}		
		//Poner Musica dimension de ruby en prueba		
		if(RubyCraft.es_un_cliente_y_no_un_server == true) {
		     if(event.player.dimension == Dimensiones.iddimensionruby && Minecraft.getMinecraft().currentScreen == null) {
			   if(Iniciadosesion) {
				   event.player.playSound(RubyCraftSoundhandler.ruby, Float.MAX_VALUE, 1.0F);
			         Iniciadosesion = false;
			  }
		   }
		            if(!(event.player.dimension == Dimensiones.iddimensionruby)) {
			           Iniciadosesion = true;
		}
	 }				
		/**Quita vida al jugador si no tieene puesto el equipo de Uranio Puesto**/	
		    //Testear si no tiene la armadura puesta
		    ItemStack casco = event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
	        ItemStack pechera = event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);  
	        ItemStack pantacas = event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);  
	        ItemStack botas = event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET);  
	            if (!(casco.getItem() == Armaduras.casco_de_uranio) || !(pechera.getItem() == Armaduras.pechera_de_uranio) || !(pantacas.getItem() == Armaduras.pantacas_de_uranio) || !(botas.getItem() == Armaduras.botas_de_uranio)) {	                 	            		    		           
	            	if(event.player.inventory.hasItemStack(new ItemStack(RItems.uranio))) {		
	            		event.player.attackEntityFrom(RadioActividad, 4.0F);		
	        		}
	        }
	}
	
	@SubscribeEvent
	public void OnWorldTick(WorldTickEvent event) {	
	}
}