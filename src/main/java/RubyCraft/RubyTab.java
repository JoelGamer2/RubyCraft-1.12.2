package RubyCraft;

import RubyCraft.Iniciar.Bloques;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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
		
		   return new ItemStack(Bloques.bloque_de_ruby);
		   
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

}