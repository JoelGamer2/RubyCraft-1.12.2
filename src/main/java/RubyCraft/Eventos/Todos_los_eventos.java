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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

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
	public void OnPlayerTickEvent(PlayerTickEvent player) {
		/**Comrpueba los nombres de los jugadores y si son jugadores de chaoticraft Hace funciones especiales para el**/
		  if(player.player.getName().equalsIgnoreCase("JoelGamer2") || player.player.getName().equalsIgnoreCase("Patxis") || player.player.getName().equalsIgnoreCase("Markus_Parker") | player.player.getName().equalsIgnoreCase("Maverick8812") || player.player.getName().equalsIgnoreCase("totalgamer23") || player.player.getName().equalsIgnoreCase("Juanathan_M") || player.player.getName().equalsIgnoreCase("Zedraliu")) {	
			/**Esta funcion solo te deja volar si tienes un Item especifico en el Inventario**/
		  if(!player.player.capabilities.isCreativeMode && !player.player.inventory.hasItemStack(new ItemStack(RItems.anillo_angelico, 1)) && player.player.world.getDifficulty() == EnumDifficulty.HARD) {
			  player.player.capabilities.allowFlying = false;
			    player.player.capabilities.isFlying = false;
		}else if(player.player.capabilities.isCreativeMode && !player.player.inventory.hasItemStack(new ItemStack(RItems.anillo_angelico, 1)) && player.player.world.getDifficulty() == EnumDifficulty.HARD) {
			      player.player.capabilities.allowFlying = true;	     
		}  
		  /**Hace da�o a los Jugadores que estan abajo de la capa 120 y sea de dia y el Mundo este en dificultad Dificl se puede evitar si tieenes un Item en especifico en el Inventario**/
		if(player.player.world.isDaytime() && player.player.world.getDifficulty() == EnumDifficulty.HARD && !player.player.inventory.hasItemStack(new ItemStack(RItems.pompa_de_imunidad,1))) {	
			if(player.player.posY < 120) {
			     player.player.attackEntityFrom(MuetePorInsolacion, 1.0F);
		      }
		   }		
		}		
		  if(!player.player.world.isDaytime() && !(player.player.posY < 120) && !player.player.inventory.hasItemStack(new ItemStack(RItems.pompa_de_imunidad,1)) && player.player.world.getDifficulty() == EnumDifficulty.HARD) {
			  player.player.addPotionEffect(new PotionEffect(Potion.getPotionById(17), 50, 0));
		  }
		//Poner Musica dimension de ruby en prueba		
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
		/**Quita vida al jugador si no tieene puesto el equipo de Uranio Puesto**/	
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
	}
	@SubscribeEvent
	public void OnWorldTick(WorldTickEvent event) {	
	}
}