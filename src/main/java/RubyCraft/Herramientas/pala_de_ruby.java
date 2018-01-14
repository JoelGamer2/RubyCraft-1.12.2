package RubyCraft.Herramientas;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class pala_de_ruby extends ItemSpade {

	public pala_de_ruby(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Referencia.RubyCraftHerramientas.PALA_DE_RUBY.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftHerramientas.PALA_DE_RUBY.getRegistryName());
		

		
	}

	
}
