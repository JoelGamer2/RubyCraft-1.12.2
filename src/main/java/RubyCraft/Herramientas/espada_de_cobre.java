package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class espada_de_cobre extends ItemSword {

	public espada_de_cobre(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.ESPADA_DE_COBRE.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.ESPADA_DE_COBRE.getRegistryName());
		
		
	}
	
}
