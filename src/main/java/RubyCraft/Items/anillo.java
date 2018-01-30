package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.Item;

public class anillo extends Item {
	public anillo(){
       setUnlocalizedName(Referencia.RubyCraftItems.ANILLO.getUnlocalizedName());
       setRegistryName(Referencia.RubyCraftItems.ANILLO.getRegistryName());
       
       this.setMaxStackSize(1);
     }	
}
