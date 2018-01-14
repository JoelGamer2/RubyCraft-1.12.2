package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class espada_de_zafiro extends ItemSword {

	public espada_de_zafiro(ToolMaterial material) {
		super(material);
	
		setUnlocalizedName(Referencia.RubyCraftHerramientas.ESPADA_DE_ZAFIRO.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.ESPADA_DE_ZAFIRO.getRegistryName());
		
		
	}
	
}
