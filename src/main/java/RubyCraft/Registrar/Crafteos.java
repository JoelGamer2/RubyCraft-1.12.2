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
		
	}
	
	public static void Crafteos_Normal(){
		
		//ConForma
		RegistrarCrafteoBloque(Bloques.bloque_de_ruby);	
	    RegistrarCrafteo(RItems.varita);
		/**RegistrarCrafteoBloque(Bloques.Ladrillo_de_obsidiana);
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
		RegistrarCrafteoBloque(Bloques.cristal_verde_lima);
		RegistrarCrafteoBloque(Bloques.cristal_azul_claro);
		RegistrarCrafteoBloque(Bloques.bloque_de_caca);
		RegistrarCrafteoBloque(Bloques.generar_dragon);
	    RegistrarCrafteoBloque(Bloques.bloque_reforzado_tier_1);
	    RegistrarCrafteoBloque(Bloques.bloque_de_actualizaciones);
	    RegistrarCrafteo(Armaduras.elitros);	    
	    RegistrarCrafteoBloque(Bloques.Bloque_de_Zafiro);
	    RegistrarCrafteoBloque(Bloques.bloque_de_pedernal);
	    RegistrarCrafteoBloque(Bloques.bloque_de_ojo_de_enderman);
	    RegistrarCrafteoBloque(Bloques.bloque_de_cobre);
	    RegistrarCrafteoBloque(Bloques.bloque_galactico);
	    RegistrarCrafteoBloque(Bloques.bloque_de_platino);
		
	    **/
	    //SinForma
		RegistrarCrafteoSinFormaItem(RItems.ruby);
	    /**RegistrarCrafteoSinFormaItem(Items.FLINT);
	    RegistrarCrafteoSinFormaItem(Items.BLAZE_ROD);
	    RegistrarCrafteoSinFormaItem(RItems.Pepita_de_Ruby);
	    RegistrarCrafteoSinFormaBloque(Bloques.Ladrillo_Marino);
	    RegistrarCrafteoSinFormaBloque(Bloques.Ladrillo_del_Bosque);
	    RegistrarCrafteoSinFormaItem(RItems.zafiro);
	    RegistrarCrafteoSinFormaItem(RItems.cobre);
	    RegistrarCrafteoBloque(Bloques.Bloque_de_Regeneracion);
	    RegistrarCrafteo(RItems.BoladeResina);
	    RegistrarCrafteoBloque(Bloques.Bloque_de_azucar);
	    RegistrarCrafteo(RItems.Pepita_de_Zafiro);    
	    RegistrarCrafteo(Items.ENDER_PEARL);
	    RegistrarCrafteo(Items.ENDER_EYE);
	    RegistrarCrafteoBloque(Bloques.Bloque_de_veneno);
	    RegistrarCrafteoBloque(Bloques.Cuarzo_azul);
	    RegistrarCrafteoBloque(Bloques.Cuarzo_rojo);
	    RegistrarCrafteoBloque(Bloques.Cuarzo_verde);
	    RegistrarCrafteo(RItems.lingote_galactico);
	    RegistrarCrafteoBloque(Bloques.calabaza_espectral);
	    RegistrarCrafteoBloque(Blocks.PUMPKIN);
	    RegistrarCrafteo(RItems.platino);
	    **/
	    
	    //Herramientas
	    
	    RegistrarCrafteo(Herramientas.Pico_de_ruby);
	   /** RegistrarCrafteo(Herramientas.hacha_de_ruby);
	    RegistrarCrafteo(Herramientas.pala_de_ruby);
	    RegistrarCrafteo(Herramientas.azada_de_ruby);
	    RegistrarCrafteo(Herramientas.espada_de_ruby);
	    RegistrarCrafteo(Herramientas.tijera_de_ruby);
	    RegistrarCrafteo(Herramientas.arco_de_ruby);
	    
	    RegistrarCrafteo(Herramientas.pico_de_zafiro);
	    RegistrarCrafteo(Herramientas.hacha_de_zafiro);
	    RegistrarCrafteo(Herramientas.pala_de_zafiro);
	    RegistrarCrafteo(Herramientas.azada_de_zafiro);
	    RegistrarCrafteo(Herramientas.espada_de_zafiro);
	    RegistrarCrafteo(Herramientas.tijera_de_zafiro);
	    RegistrarCrafteo(Herramientas.arco_de_zafiro);	
	    
	    RegistrarCrafteo(Herramientas.pico_de_cobre);
	    RegistrarCrafteo(Herramientas.hacha_de_cobre);
	    RegistrarCrafteo(Herramientas.pala_de_cobre);
	    RegistrarCrafteo(Herramientas.azada_de_cobre);
	    RegistrarCrafteo(Herramientas.espada_de_cobre);
	    RegistrarCrafteo(Herramientas.tijera_de_cobre);
	    **/
	    //Armaduras
	    
	    RegistrarCrafteo(Armaduras.casco_de_ruby);
	    /**RegistrarCrafteo(Armaduras.pechera_de_ruby);
	    RegistrarCrafteo(Armaduras.grebas_de_ruby);
	    RegistrarCrafteo(Armaduras.botas_de_ruby);
	    
	    RegistrarCrafteo(Armaduras.casco_de_zafiro);
	    RegistrarCrafteo(Armaduras.pechera_de_zafiro);
	    RegistrarCrafteo(Armaduras.grebas_de_zafiro);
	    RegistrarCrafteo(Armaduras.botas_de_zafiro);
	    
	    RegistrarCrafteo(Armaduras.casco_de_uranio);
	    RegistrarCrafteo(Armaduras.pechera_de_uranio);
	    RegistrarCrafteo(Armaduras.pantacas_de_uranio);
	    RegistrarCrafteo(Armaduras.botas_de_uranio);
	    **/
	    //Horno
		GameRegistry.addSmelting(RItems.BoladeResina, new ItemStack(RItems.Plastico, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_ruby, new ItemStack(RItems.ruby, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_zafiro, new ItemStack(RItems.zafiro, 1), 15.0F);
    	GameRegistry.addSmelting(Items.EGG, new ItemStack(RItems.huevo_frito, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_ruby_end, new ItemStack(RItems.ruby, 1), 20.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_zafiro_end, new ItemStack(RItems.zafiro, 1), 20.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_platino, new ItemStack(RItems.platino, 1), 50.0F);
    	GameRegistry.addSmelting(RItems.alga, new ItemStack(RItems.alga_seca, 1), 20.0F);
		
/**     
  
    
 Estos Objetos no tienen Crafteo Aun porque o no funcionan Bien o directamente no tiene utilidad en esta Version  
 Los Crafteos de la Version trol estan totalmente eliminados debido a que el equipo de desarrolo no saben ponerlos todavia
 al igual que la mesa de ruby y mesa de zafiro que estan inutilizables debido a cambios de codigo en version de Forge
 	
	     Crafteos_Mesa_de_Ruby
		
         Registros.addRecipeRuby(new ItemStack(Bloques.mesa_de_zafiro_basica, 1), new Object[]{"zbbbz","bmmmb","bmdmb","bmmmb","zbbbz", 'z', RItems.zafiro, 'm', Blocks.CRAFTING_TABLE, 'd', Items.DIAMOND, 'b', Bloques.bloque_de_ruby});
		 Registros.addRecipeRuby(new ItemStack(Bloques.bloque_de_blaze, 1), new Object[]{"bbbbb","bbbbb","bbbbb","bbbbb","bbbbb",'b',Items.BLAZE_ROD});
         Registros.addRecipeRuby(new ItemStack(Bloques.cristal_verde_lima, 21), new Object[]{"vvvvv","vvtvv","vtvtv","vvtvv","vvvvv",'v',new ItemStack(Blocks.STAINED_GLASS,1,5),'t',new ItemStack(Items.DYE,1,2)});
         Registros.addRecipeRuby(new ItemStack(Bloques.cristal_azul_claro, 21), new Object[]{"aaaaa","aataa","atata","aataa","aaaaa",'a',new ItemStack(Blocks.STAINED_GLASS,1,3),'t',new ItemStack(Items.DYE,1,12)});
       
         
	
  
	     Crafteos_Mesa_Zafiro
		
         Registros.addRecipeZafiro(new ItemStack(Bloques.mesa_de_conjuraciones, 1), new Object[]{"cppu","varv","vzav","uppc",'c',Bloques.bloque_de_caca,'p',RItems.Plastico,'v',RItems.varita,'a',RItems.anillo,'u',RItems.uranio,'z',RItems.zafiro,'r',RItems.ruby});
         Registros.addRecipeZafiro(new ItemStack(RItems.molde_para_cofres, 2), new Object[]{"hpph","phcp","pchp","hpph",'h',Items.IRON_INGOT,'p',RItems.Pepita_de_Ruby,'c',Blocks.CHEST});
		
	**/
	
		   
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
	
