package RubyCraft.Items;

import RubyCraft.Referencia;
import net.minecraft.item.Item;

public class anillo_angelico extends Item {

	public anillo_angelico () {
		
		setUnlocalizedName(Referencia.RubyCraftItems.ANILLO_ANGELICO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftItems.ANILLO_ANGELICO.getRegistryName());
		
		this.setMaxDamage(100);
	}
	
}
