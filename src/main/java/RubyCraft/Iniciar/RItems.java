package RubyCraft.Iniciar;

import RubyCraft.RubyCraft;
import RubyCraft.Items.BoladeResina;
import RubyCraft.Items.Marcodelamuleto;
import RubyCraft.Items.Pepita_de_Ruby;
import RubyCraft.Items.Pepita_de_Zafiro;
import RubyCraft.Items.Plastico;
import RubyCraft.Items.alga;
import RubyCraft.Items.alga_seca;
import RubyCraft.Items.aluminio;
import RubyCraft.Items.amuleto;
import RubyCraft.Items.anillo;
import RubyCraft.Items.anillo_angelico;
import RubyCraft.Items.barra_de_aluminio;
import RubyCraft.Items.cobre;
import RubyCraft.Items.colores;
import RubyCraft.Items.engranaje_de_diamante;
import RubyCraft.Items.huevo_frito;
import RubyCraft.Items.lingote_galactico;
import RubyCraft.Items.manzana_de_diamante;
import RubyCraft.Items.molde_para_cofres;
import RubyCraft.Items.palo_verde;
import RubyCraft.Items.pan_de_calabaza;
import RubyCraft.Items.platino;
import RubyCraft.Items.pompa_de_imunidad;
import RubyCraft.Items.ruby;
import RubyCraft.Items.uranio;
import RubyCraft.Items.varita;
import RubyCraft.Items.zafiro;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RItems {
	
	public static Item ruby;
	public static Item colores;
	public static Item Marcodelamuleto;
	public static Item zafiro;
	public static Item Plastico;
	public static Item uranio;
	public static Item amuleto;
	public static Item BoladeResina;
	public static Item anillo;
	public static Item Totem_de_la_no_muerte;
	public static Item Pepita_de_Ruby;
	public static Item Pepita_de_Zafiro;
	public static Item palo_verde;
	public static Item aluminio;
	public static Item cobre;
	public static Item molde_para_cofres;
	public static Item barra_de_aluminio;
	public static Item varita;
	public static Item lingote_galactico;
	public static Item platino;
	public static Item alga;
	public static Item engranaje_de_diamante;
	public static Item pompa_de_imunidad;
	public static Item anillo_angelico;
	
	//Comida
	public static Item pan_de_calabaza;
	public static Item huevo_frito;
	public static Item manzana_de_diamante;
	public static Item alga_seca;
	
	public static void Iniciar(){
		ruby = new ruby();
		Pepita_de_Ruby = new Pepita_de_Ruby();
		colores = new colores();
		zafiro = new zafiro();
		Plastico = new Plastico();
		uranio = new uranio();
		amuleto = new amuleto();
		BoladeResina = new BoladeResina();
		anillo = new anillo();
		Marcodelamuleto = new Marcodelamuleto();
		Pepita_de_Zafiro = new Pepita_de_Zafiro();
		palo_verde = new palo_verde();
		aluminio = new aluminio();
		cobre = new cobre();
		molde_para_cofres = new molde_para_cofres();
		barra_de_aluminio = new barra_de_aluminio();
		varita = new varita();
		lingote_galactico = new lingote_galactico();
		platino = new platino();
		alga = new alga();
		engranaje_de_diamante = new engranaje_de_diamante();
		pompa_de_imunidad = new pompa_de_imunidad();
		anillo_angelico = new anillo_angelico();
		
		//Comida
		pan_de_calabaza = new pan_de_calabaza(10, 1.0F, false);
		huevo_frito = new huevo_frito(5, 0.6F, true);
		manzana_de_diamante = new manzana_de_diamante(6, 1.0F, false);
		alga_seca = new alga_seca(1,0.3F, false);
	}
	public static void Registrar(){
		RegistrarItem(ruby);
		RegistrarItem(Pepita_de_Ruby);
		RegistrarItem(colores);
		RegistrarItem(zafiro);
		RegistrarItem(Plastico);
		RegistrarItem(uranio);
		RegistrarItem(amuleto);
		RegistrarItem(BoladeResina);
		RegistrarItem(anillo);
		RegistrarItem(Marcodelamuleto);
		RegistrarItem(Pepita_de_Zafiro);
		RegistrarItem(palo_verde);
		RegistrarItem(aluminio);
		RegistrarItem(cobre);
		RegistrarItem(molde_para_cofres);
		RegistrarItem(barra_de_aluminio);
		RegistrarItem(varita);
		RegistrarItem(lingote_galactico);
		RegistrarItem(platino);
		RegistrarItem(alga);
		RegistrarItem(alga_seca);
		RegistrarItem(engranaje_de_diamante);
		RegistrarItem(pompa_de_imunidad);
		RegistrarItem(anillo_angelico);
		
		//Comidas
		RegistrarItem(pan_de_calabaza);
		RegistrarItem(huevo_frito);
		RegistrarItem(manzana_de_diamante);
	}
	
	public static void RegistrarRenders(){	
		RegistrarRender(ruby);
		RegistrarRender(Pepita_de_Ruby);
		RegistrarRender(colores);
		RegistrarRender(zafiro);
		RegistrarRender(Plastico);
		RegistrarRender(uranio);
		RegistrarRender(amuleto);
		RegistrarRender(BoladeResina);
		RegistrarRender(anillo);
		RegistrarRender(Marcodelamuleto);
		RegistrarRender(Pepita_de_Zafiro); 
		RegistrarRender(palo_verde);
		RegistrarRender(aluminio);
		RegistrarRender(cobre);
		RegistrarRender(molde_para_cofres);
		RegistrarRender(barra_de_aluminio);
		RegistrarRender(varita);
		RegistrarRender(lingote_galactico);
		RegistrarRender(platino);
		RegistrarRender(alga);
		RegistrarRender(alga_seca);
		RegistrarRender(engranaje_de_diamante);
		RegistrarRender(pompa_de_imunidad);
		RegistrarRender(anillo_angelico);
		
		//Comidad
		RegistrarRender(pan_de_calabaza);
		RegistrarRender(huevo_frito);
		RegistrarRender(manzana_de_diamante);
	}
	
	public static void RegistrarItem(Item item){
		
		item.setCreativeTab(RubyCraft.Rubycrafttab);
		ForgeRegistries.ITEMS.register(item);
		
	}
	
	public static  void RegistrarRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}
	
}
