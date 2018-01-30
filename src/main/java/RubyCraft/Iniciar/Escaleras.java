package RubyCraft.Iniciar;

import RubyCraft.RubyCraft;
import RubyCraft.Escaleras.escalera_de_andesita;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

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
