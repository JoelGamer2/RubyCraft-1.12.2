package RubyCraft.Iniciar;



import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.Herramientas.Pico_de_ruby;
import RubyCraft.Herramientas.arco_de_ruby;
import RubyCraft.Herramientas.arco_de_zafiro;
import RubyCraft.Herramientas.azada_de_cobre;
import RubyCraft.Herramientas.azada_de_ruby;
import RubyCraft.Herramientas.azada_de_zafiro;
import RubyCraft.Herramientas.espada_de_cobre;
import RubyCraft.Herramientas.espada_de_ruby;
import RubyCraft.Herramientas.espada_de_zafiro;
import RubyCraft.Herramientas.hacha_de_cobre;
import RubyCraft.Herramientas.hacha_de_ruby;
import RubyCraft.Herramientas.hacha_de_zafiro;
import RubyCraft.Herramientas.pala_de_cobre;
import RubyCraft.Herramientas.pala_de_ruby;
import RubyCraft.Herramientas.pala_de_zafiro;
import RubyCraft.Herramientas.pico_de_cobre;
import RubyCraft.Herramientas.pico_de_zafiro;
import RubyCraft.Herramientas.tijera_de_cobre;
import RubyCraft.Herramientas.tijera_de_ruby;
import RubyCraft.Herramientas.tijera_de_zafiro;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Herramientas {
	
    //Herramientas
	
	public static Item Pico_de_ruby;
	public static Item espada_de_ruby;
	public static Item azada_de_ruby;
	public static Item pala_de_ruby;
	public static Item hacha_de_ruby;
	public static Item tijera_de_ruby;
	public static Item arco_de_ruby;
	
	public static Item pico_de_zafiro;
	public static Item espada_de_zafiro;
	public static Item azada_de_zafiro;
	public static Item pala_de_zafiro;
	public static Item hacha_de_zafiro;
	public static Item tijera_de_zafiro;
	public static Item arco_de_zafiro;
	
	public static Item pico_de_cobre;
	public static Item espada_de_cobre;
	public static Item azada_de_cobre;
	public static Item pala_de_cobre;
	public static Item hacha_de_cobre;
	public static Item tijera_de_cobre;
	
	//ToolMaterial
	
	public static final ToolMaterial MaterialRuby = EnumHelper.addToolMaterial(Referencia.MOD_ID + ":rubytool", 4, 3000, 10.0F, 5.0F, 45);
	public static final Item.ToolMaterial zafiromaterial = EnumHelper.addToolMaterial(Referencia.MOD_ID + ":zafirotool", 5, 2000, 35.0F, 8.0F, 45);
	public static final Item.ToolMaterial CobreMaterial = EnumHelper.addToolMaterial(Referencia.MOD_ID + ":coppertool", 2, 500, 15.0F, 2.0F, 45);
	
	public static void Iniciar(){
		
		Pico_de_ruby = new Pico_de_ruby(MaterialRuby);
		espada_de_ruby = new espada_de_ruby(MaterialRuby);
		hacha_de_ruby = new hacha_de_ruby(MaterialRuby);
		pala_de_ruby = new pala_de_ruby(MaterialRuby);
		azada_de_ruby = new azada_de_ruby(MaterialRuby);
		tijera_de_ruby = new tijera_de_ruby(MaterialRuby);
		arco_de_ruby = new arco_de_ruby();
		
		pico_de_zafiro = new pico_de_zafiro(zafiromaterial);
		espada_de_zafiro = new espada_de_zafiro(zafiromaterial);
		pala_de_zafiro = new pala_de_zafiro(zafiromaterial);
		azada_de_zafiro = new azada_de_zafiro(zafiromaterial);
		hacha_de_zafiro = new hacha_de_zafiro(zafiromaterial);
		tijera_de_zafiro = new tijera_de_zafiro(zafiromaterial);
		arco_de_zafiro = new arco_de_zafiro();
		
		pico_de_cobre = new pico_de_cobre(CobreMaterial);
		espada_de_cobre = new espada_de_cobre(CobreMaterial);
		pala_de_cobre = new pala_de_cobre(CobreMaterial);
		azada_de_cobre = new azada_de_cobre(CobreMaterial);
		hacha_de_cobre = new hacha_de_cobre(CobreMaterial);
		tijera_de_cobre = new tijera_de_cobre(CobreMaterial);
		
	}
	
	public static void registrar(){
		
		RegistrarItem(Pico_de_ruby);
		RegistrarItem(espada_de_ruby);
		RegistrarItem(pala_de_ruby);
		RegistrarItem(hacha_de_ruby);
		RegistrarItem(azada_de_ruby);
		RegistrarItem(tijera_de_ruby);
		RegistrarItem(arco_de_ruby);
		
		RegistrarItem(pico_de_zafiro);
		RegistrarItem(espada_de_zafiro);
		RegistrarItem(pala_de_zafiro);
		RegistrarItem(azada_de_zafiro);
		RegistrarItem(hacha_de_zafiro);
		RegistrarItem(tijera_de_zafiro);
		RegistrarItem(arco_de_zafiro);
		
		RegistrarItem(pico_de_cobre);
		RegistrarItem(espada_de_cobre);
		RegistrarItem(pala_de_cobre);
		RegistrarItem(azada_de_cobre);
		RegistrarItem(hacha_de_cobre);
		RegistrarItem(tijera_de_cobre);
		
	}
	
	public static void RegistrarRenders(){
	
		RegistrarRender(Pico_de_ruby);
		RegistrarRender(espada_de_ruby);
		RegistrarRender(hacha_de_ruby);
		RegistrarRender(pala_de_ruby);
		RegistrarRender(azada_de_ruby);
		RegistrarRender(tijera_de_ruby);
		RegistrarRender(arco_de_ruby);
		
		RegistrarRender(pico_de_zafiro);
		RegistrarRender(espada_de_zafiro);
		RegistrarRender(pala_de_zafiro);
		RegistrarRender(azada_de_zafiro);
		RegistrarRender(hacha_de_zafiro);		
		RegistrarRender(tijera_de_zafiro);
		RegistrarRender(arco_de_zafiro);
		
		RegistrarRender(pico_de_cobre);
		RegistrarRender(espada_de_cobre);
		RegistrarRender(pala_de_cobre);
		RegistrarRender(azada_de_cobre);
		RegistrarRender(hacha_de_cobre);		
		RegistrarRender(tijera_de_cobre);
		
	}
	
	public static void RegistrarItem(Item item){
		item.setCreativeTab(RubyCraft.Rubycrafttab);
		ForgeRegistries.ITEMS.register(item);
		
	}
	
	private static void RegistrarRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}
	
}
