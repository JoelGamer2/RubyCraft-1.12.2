package RubyCraft.Iniciar;

import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import RubyCraft.Bloques.Bloque_de_Regeneracion;
import RubyCraft.Bloques.Bloque_de_Zafiro;
import RubyCraft.Bloques.Bloque_de_azucar;
import RubyCraft.Bloques.Bloque_de_comandos;
import RubyCraft.Bloques.Bloque_de_uranio;
import RubyCraft.Bloques.Bloque_de_veneno;
import RubyCraft.Bloques.BloquedeEnderPearld;
import RubyCraft.Bloques.Bloqueluminiscente;
import RubyCraft.Bloques.Ladrillo_Marino;
import RubyCraft.Bloques.Ladrillo_de_obsidiana;
import RubyCraft.Bloques.Ladrillo_del_Bosque;
import RubyCraft.Bloques.Madera_Azul;
import RubyCraft.Bloques.Madera_Verde;
import RubyCraft.Bloques.Tronco_Azul;
import RubyCraft.Bloques.Tronco_de_Madera_verde;
import RubyCraft.Bloques.bloque_de_blaze;
import RubyCraft.Bloques.ladrillo_de_andesita;
import RubyCraft.Bloques.ladrillo_de_diorita;
import RubyCraft.Bloques.ladrillo_de_granito;
import RubyCraft.Bloques.ladrillo_de_infiedra;
import RubyCraft.Bloques.bloque_de_ruby;
import RubyCraft.Escaleras.escalera_de_andesita;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiShulkerBox;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ContainerShulkerBox;
import net.minecraft.inventory.SlotShulkerBox;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Escaleras {
	
	public static escalera_de_andesita escalera_de_andesita;
	
	public static void Iniciar(){
		
	//	escalera_de_andesita = new escalera_de_andesita(Blocks.STONE, 0);
		
	}
	public static void Registrar(){
	
 //    RegistrarEscalera(escalera_de_andesita, Blocks.STONE);
		
	}
	
	
	public static void RegistrarRenderizado(){
		 
	//	RegistrarRenderizado(escalera_de_andesita);
	   
	}
	
      private static void RegistrarEscalera(Block Escalera, Block material_crafteo){
		
		//GameRegistry.register(Escalera);
		ItemBlock item = new ItemBlock(Escalera);
		item.setRegistryName(Escalera.getRegistryName());
		//GameRegistry.register(item);
		Escalera.setCreativeTab(RubyCraft.Rubycrafttab);
		//GameRegistry.addRecipe(new ItemStack(Escalera, 4), new Object[]{"b","bb","bbb"});
		
	}
      
	private static void RegistrarRenderizado(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
