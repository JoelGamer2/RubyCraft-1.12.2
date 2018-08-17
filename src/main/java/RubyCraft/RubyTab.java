package RubyCraft;

import RubyCraft.Iniciar.Bloques;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class RubyTab extends CreativeTabs {

	public static void Inicializar_Tabs(){
        

	}

	public RubyTab(int i, String modid, String string, int j) {
		super(Referencia.MOD_ID);
		
		setBackgroundImageName("rubycraft.png");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		   if(RubyCraft.ModActualizado) {
		   return new ItemStack(Bloques.bloque_de_ruby);
		   }else {
			   return new ItemStack(Blocks.DIAMOND_BLOCK);
		   }
	}

	@Override
	public boolean hasSearchBar() {
		if(RubyCraft.ModActualizado) {
		return true;
		}else {
			return false;
		}
	}

}