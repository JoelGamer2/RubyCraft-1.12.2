package RubyCraft.Registrar;

import com.google.gson.JsonObject;

import RubyCraft.Referencia;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.Herramientas;
import RubyCraft.Iniciar.RItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos {

	public static void IniciarTodo(){
		
		Crafteos_Normal();
		//Iniciar_Crafteos_Mesa_de_Ruby();
		//Iniciar_Crafteos_Mesa_Zafiro();
		
	}
	
	public static void Crafteos_Normal(){
		
		//ConForma
		
		RegistrarDescrafteoItem(RItems.ruby);
		RegistrarCrafteoBloque(Bloques.bloque_de_ruby);	
		RegistrarCrafteoBloque(Bloques.Ladrillo_de_obsidiana);
		RegistrarCrafteo(RItems.amuleto);
		RegistrarCrafteo(RItems.Marcodelamuleto);
		RegistrarCrafteo(RItems.colores);
		RegistrarCrafteoBloque(Bloques.Bloqueluminiscente);
		RegistrarCrafteoBloque(Bloques.Bloque_de_Diamante_Trol);
		RegistrarCrafteoBloque(Bloques.Bloque_de_uranio);
		RegistrarCrafteo(RItems.uranio);
		RegistrarCrafteo(RItems.anillo);
		RegistrarCrafteo(RItems.ruby);
		RegistrarCrafteo(RItems.zafiro);
		RegistrarCrafteoBloque(Bloques.BloquedeEnderPearld);
		RegistrarCrafteoBloque(Bloques.ladrillo_de_granito);
		RegistrarCrafteoBloque(Bloques.ladrillo_de_andesita);
		RegistrarCrafteoBloque(Bloques.ladrillo_de_diorita);
		RegistrarCrafteoBloque(Bloques.ladrillo_de_infiedra);
		RegistrarCrafteo(RItems.palo_verde);
		RegistrarCrafteoBloque(Bloques.obsidiana_que_llora);
		RegistrarCrafteo(RItems.pan_de_calabaza);
		RegistrarCrafteo(Herramientas.arco_de_ruby);
	    RegistrarCrafteo(Herramientas.arco_de_zafiro);	
		RegistrarCrafteoBloque(Bloques.cristal_verde_lima);
		RegistrarCrafteoBloque(Bloques.cristal_azul_claro);
		RegistrarCrafteoBloque(Bloques.bloque_de_caca);
		RegistrarCrafteoBloque(Bloques.generar_dragon);
	    RegistrarCrafteo(RItems.varita);
	    RegistrarCrafteoBloque(Bloques.bloque_reforzado_tier_1);
	    RegistrarCrafteoBloque(Bloques.bloque_de_actualizaciones);
	    RegistrarCrafteo(Armaduras.elitros);	    
	    RegistrarCrafteoBloque(Bloques.Bloque_de_Zafiro);
	    RegistrarCrafteoBloque(Bloques.bloque_de_pedernal);
	    RegistrarCrafteoBloque(Bloques.bloque_de_ojo_de_enderman);
	    RegistrarCrafteoBloque(Bloques.bloque_de_cobre);
	    RegistrarCrafteoBloque(Bloques.bloque_galactico);
	    RegistrarCrafteoBloque(Bloques.bloque_de_platino);
		
	    
	    //SinForma
	    RegistrarCrafteoSinFormaItem(Items.FLINT);
	    RegistrarCrafteoSinFormaItem(Items.BLAZE_ROD);
	    RegistrarCrafteoSinFormaItem(RItems.Pepita_de_Ruby);
	    RegistrarCrafteoSinFormaBloque(Bloques.Ladrillo_Marino);
	    RegistrarCrafteoSinFormaBloque(Bloques.Ladrillo_del_Bosque);
	    RegistrarCrafteoSinFormaItem(RItems.zafiro);
	    RegistrarCrafteoSinFormaItem(RItems.cobre);
	    RegistrarCrafteoSinFormaBloque(Bloques.Madera_Azul);
	    
		//Horno
		GameRegistry.addSmelting(RItems.BoladeResina, new ItemStack(RItems.Plastico, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_ruby, new ItemStack(RItems.ruby, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_zafiro, new ItemStack(RItems.zafiro, 1), 15.0F);
    	GameRegistry.addSmelting(Items.EGG, new ItemStack(RItems.huevo_frito, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_ruby_end, new ItemStack(RItems.ruby, 1), 20.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_zafiro_end, new ItemStack(RItems.zafiro, 1), 20.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_platino, new ItemStack(RItems.platino, 1), 50.0F);
		
		/**
		//Crafteos que no tiene que ver con el Mod
		GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[]{"bbb","bmb","bbb",'b',Blocks.GOLD_BLOCK,'m',Items.APPLE});
		GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR), new Object[]{"ccc","aaa","eaf",'c',new ItemStack(Items.SKULL,1,1),'a',Blocks.SOUL_SAND,'e',Items.DIAMOND_SWORD,'f',Items.BOW});
       
    	
		//Sin Forma
    	
	    GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Madera_Verde, 4), new Object[] {Bloques.Tronco_de_Madera_verde});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Tronco_de_Madera_verde, 1), new Object[] {Blocks.LOG,Blocks.CACTUS});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Bloque_de_Regeneracion, 4), new Object[]{Blocks.MAGMA,Items.GOLDEN_APPLE,Blocks.CACTUS,Blocks.CACTUS,Blocks.CACTUS});
	    GameRegistry.addShapelessRecipe(new ItemStack(RItems.BoladeResina, 9), new Object[]{Blocks.COAL_BLOCK,Items.GOLD_NUGGET});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Bloque_de_azucar, 1), new Object[]{Items.SUGAR,Items.SUGAR,Items.SUGAR,Items.SUGAR});
    	GameRegistry.addShapelessRecipe(new ItemStack(RItems.Pepita_de_Zafiro, 9), new Object[]{RItems.zafiro});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_PEARL, 9), new Object[]{Bloques.BloquedeEnderPearld});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_EYE, 9), new Object[]{Bloques.bloque_de_ojo_de_enderman});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Bloque_de_veneno, 4), new Object[]{Bloques.Bloque_de_Regeneracion,Bloques.Bloque_de_Regeneracion, Bloques.Bloque_de_Regeneracion, Bloques.Bloque_de_Regeneracion, Items.POISONOUS_POTATO});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Cuarzo_azul, 4), new Object[]{Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Items.WATER_BUCKET});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Cuarzo_verde, 4), new Object[]{Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.CACTUS});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Cuarzo_rojo, 4), new Object[]{Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Items.REDSTONE});
    	GameRegistry.addShapelessRecipe(new ItemStack(RItems.lingote_galactico, 9), new Object[]{Bloques.bloque_galactico});
        GameRegistry.addShapelessRecipe(new ItemStack(Bloques.calabaza_espectral, 2), new Object[]{Blocks.PUMPKIN, Blocks.PUMPKIN});
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PUMPKIN, 2), new Object[]{Bloques.calabaza_espectral ,Bloques.calabaza_espectral});
		GameRegistry.addShapelessRecipe(new ItemStack(RItems.platino,  9), new Object[]{Bloques.bloque_de_platino});
    	//Horno
	    
    	
    	
    	//Herramientas o Armaduras
    	
    	
    	Crafteos_Bases.Herramientas(RItems.cobre, Items.STICK, Herramientas.pico_de_cobre, Herramientas.espada_de_cobre, Herramientas.hacha_de_cobre, Herramientas.pala_de_cobre, Herramientas.azada_de_cobre, Herramientas.tijera_de_cobre);
    	
    	
    	Crafteos_Bases.Armaduras(RItems.uranio, Armaduras.casco_de_uranio, Armaduras.pechera_de_uranio, Armaduras.pantacas_de_uranio, Armaduras.botas_de_uranio);
    	
    	
	}
	
	public static void Iniciar_Crafteos_Mesa_de_Ruby(){
		
         Registros.addRecipeRuby(new ItemStack(Bloques.mesa_de_zafiro_basica, 1), new Object[]{"zbbbz","bmmmb","bmdmb","bmmmb","zbbbz", 'z', RItems.zafiro, 'm', Blocks.CRAFTING_TABLE, 'd', Items.DIAMOND, 'b', Bloques.bloque_de_ruby});
		 Registros.addRecipeRuby(new ItemStack(Bloques.bloque_de_blaze, 1), new Object[]{"bbbbb","bbbbb","bbbbb","bbbbb","bbbbb",'b',Items.BLAZE_ROD});
         Registros.addRecipeRuby(new ItemStack(Bloques.cristal_verde_lima, 21), new Object[]{"vvvvv","vvtvv","vtvtv","vvtvv","vvvvv",'v',new ItemStack(Blocks.STAINED_GLASS,1,5),'t',new ItemStack(Items.DYE,1,2)});
         Registros.addRecipeRuby(new ItemStack(Bloques.cristal_azul_claro, 21), new Object[]{"aaaaa","aataa","atata","aataa","aaaaa",'a',new ItemStack(Blocks.STAINED_GLASS,1,3),'t',new ItemStack(Items.DYE,1,12)});
         Registros.addRecipeRuby(new ItemStack(Herramientas.Pico_de_ruby, 1), new Object[]{"rrrrr","  p  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.hacha_de_ruby, 1), new Object[]{" rr  "," rp  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.azada_de_ruby, 1), new Object[]{" rr  ","  p  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.pala_de_ruby, 1), new Object[]{"  r  ","  p  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.espada_de_ruby, 1), new Object[]{"  r  ","  r  ","  r  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.pico_de_zafiro , 1), new Object[]{"zzzzz","  p  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.hacha_de_zafiro, 1), new Object[]{" zz  "," zp  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.azada_de_zafiro, 1), new Object[]{" zz  ","  p  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.pala_de_zafiro, 1), new Object[]{"  z  ","  p  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.espada_de_zafiro, 1), new Object[]{"  z  ","  z  ","  z  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Armaduras.casco_de_ruby, 1), new Object[]{"rrrrr","r   r","r   r",'r',RItems.ruby});
         Registros.addRecipeRuby(new ItemStack(Armaduras.pechera_de_ruby, 1), new Object[]{"r   r","rrrrr","rrrrr","rrrrr","rrrrr",'r',RItems.ruby});
         Registros.addRecipeRuby(new ItemStack(Armaduras.grebas_de_ruby, 1), new Object[]{"rrrrr","r   r","r   r","r   r","r   r",'r',RItems.ruby});
         Registros.addRecipeRuby(new ItemStack(Armaduras.botas_de_ruby, 1), new Object[]{"r   r","r   r","rr rr",'r',RItems.ruby});
         
	}
  
	public static void Iniciar_Crafteos_Mesa_Zafiro(){
		
         Registros.addRecipeZafiro(new ItemStack(RItems.manzana_de_diamante, 1), new Object[]{"zodz","dmmo","ommd","zdoz",'z',RItems.zafiro,'o',Items.GOLDEN_APPLE,'d',Items.DIAMOND,'m',Items.APPLE});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.casco_de_zafiro ,1), new Object[]{"zzz","z z",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.pechera_de_zafiro ,1), new Object[]{"z z","zzz","zzz",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.grebas_de_zafiro ,1), new Object[]{"zzz","z z","z z",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.botas_de_zafiro ,1), new Object[]{"z z","z z",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Bloques.mesa_de_conjuraciones, 1), new Object[]{"cppu","varv","vzav","uppc",'c',Bloques.bloque_de_caca,'p',RItems.Plastico,'v',RItems.varita,'a',RItems.anillo,'u',RItems.uranio,'z',RItems.zafiro,'r',RItems.ruby});
         Registros.addRecipeZafiro(new ItemStack(RItems.molde_para_cofres, 2), new Object[]{"hpph","phcp","pchp","hpph",'h',Items.IRON_INGOT,'p',RItems.Pepita_de_Ruby,'c',Blocks.CHEST});
	}
	
	public static void Crafteos_Version_Trol(){
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 4), new Object[]{"mm","mm",'m',Blocks.PLANKS});
		
	}
	
	public static void IniciarCrafteosDiadelosInocentes() {
		
	}
	
	public static void IniciarCrafteosHallowen() {
		
	}
	
	public static void IniciarCrafteosNavidad() {
		
	}**/
	
		   
    }
	public static void RegistrarCrafteo(Item name) {
		
		
		CraftingHelper.register(new ResourceLocation(Referencia.MOD_ID + ":" + name.getUnlocalizedName() + ".json"), new IRecipeFactory() {
			
			
			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
		});
		
	}
	
	public static void RegistrarCrafteoBloque(Block name) {
		
		CraftingHelper.register(new ResourceLocation(Referencia.MOD_ID + ":" + name.getUnlocalizedName() + ".json"), new IRecipeFactory() {
			
			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
		});
			
		}

public static void RegistrarDescrafteoBloque(Block name) {
		
		CraftingHelper.register(new ResourceLocation(Referencia.MOD_ID + ":" + name.getUnlocalizedName() + ".bdescrafteo.json"), new IRecipeFactory() {
			
			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
		});
}
		public static void RegistrarDescrafteoItem(Item name) {
			
			CraftingHelper.register(new ResourceLocation(Referencia.MOD_ID + ":" + name.getUnlocalizedName() + ".idescrafteo.json"), new IRecipeFactory() {
				
				@Override
				public IRecipe parse(JsonContext context, JsonObject json) {
					
					return CraftingHelper.getRecipe(json, context);
				}
			});
		
		}


		public static void RegistrarCrafteoSinFormaItem(Item name) {
			
			CraftingHelper.register(new ResourceLocation(Referencia.MOD_ID + ":SinForma/" + name.getUnlocalizedName() + ".json"), new IRecipeFactory() {
				
				@Override
				public IRecipe parse(JsonContext context, JsonObject json) {
					
					return CraftingHelper.getRecipe(json, context);
				}
			});
		
		}
		
	public static void RegistrarCrafteoSinFormaBloque(Block name) {
			
			CraftingHelper.register(new ResourceLocation(Referencia.MOD_ID + ":SinForma/" + name.getUnlocalizedName() + ".json"), new IRecipeFactory() {
				
				@Override
				public IRecipe parse(JsonContext context, JsonObject json) {
					
					return CraftingHelper.getRecipe(json, context);
				}
			});
		
		}
		
		
		
	}
	
