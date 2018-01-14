package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class espada_de_ruby extends ItemSword {

	public espada_de_ruby(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Referencia.RubyCraftHerramientas.ESPADA_DE_RUBY.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.ESPADA_DE_RUBY.getRegistryName());
		
		
		
	}

	
}
