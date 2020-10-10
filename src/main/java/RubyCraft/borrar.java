package RubyCraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;



public class borrar extends ForgeRegistries{
	
	public borrar(Item item){
		 ForgeRegistry<IRecipe> r = (ForgeRegistry<IRecipe>) RECIPES;
		 r.remove(item.getRegistryName());
		 CraftingHelper.loadRecipes(false);
		 CraftingManager.init();
	}
	public borrar(ItemStack itemStack){
		 ForgeRegistry<IRecipe> r = (ForgeRegistry<IRecipe>) RECIPES;
		 r.remove(itemStack.getItem().getRegistryName());
		 CraftingHelper.loadRecipes(false);
		 CraftingManager.init();
	}
	public borrar(Block block){
		 ForgeRegistry<IRecipe> r = (ForgeRegistry<IRecipe>) RECIPES;
		 r.remove(Item.getItemFromBlock(block).getRegistryName());
		 CraftingHelper.loadRecipes(false);
		 CraftingManager.init();
	}
}