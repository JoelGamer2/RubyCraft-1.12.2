package RubyCraft.Iniciar;

import RubyCraft.Control_de_Version;
import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import RubyCraft.Bloques.Bloque_de_Regeneracion;
import RubyCraft.Bloques.Bloque_de_Zafiro;
import RubyCraft.Bloques.Bloque_de_azucar;
import RubyCraft.Bloques.Bloque_de_comandos;
import RubyCraft.Bloques.Bloque_de_uranio;
import RubyCraft.Bloques.Bloque_de_veneno;
import RubyCraft.Bloques.BloquedeEnderPearld;
import RubyCraft.Bloques.Bloqueluminiscente;
import RubyCraft.Bloques.Cuarzo_azul;
import RubyCraft.Bloques.Cuarzo_rojo;
import RubyCraft.Bloques.Cuarzo_verde;
import RubyCraft.Bloques.Ladrillo_Marino;
import RubyCraft.Bloques.Ladrillo_de_obsidiana;
import RubyCraft.Bloques.Ladrillo_del_Bosque;
import RubyCraft.Bloques.bloque_de_actualizaciones;
import RubyCraft.Bloques.bloque_de_blaze;
import RubyCraft.Bloques.bloque_de_caca;
import RubyCraft.Bloques.bloque_de_cobre;
import RubyCraft.Bloques.bloque_de_ojo_de_enderman;
import RubyCraft.Bloques.bloque_de_pedernal;
import RubyCraft.Bloques.bloque_de_platino;
import RubyCraft.Bloques.bloque_de_ruby;
import RubyCraft.Bloques.bloque_galactico;
import RubyCraft.Bloques.bloque_reforzado_tier_1;
import RubyCraft.Bloques.calabaza_espectral;
import RubyCraft.Bloques.coral_amarillo;
import RubyCraft.Bloques.coral_amarillo_muerto;
import RubyCraft.Bloques.coral_azul;
import RubyCraft.Bloques.coral_azul_muerto;
import RubyCraft.Bloques.coral_morado;
import RubyCraft.Bloques.coral_morado_muerto;
import RubyCraft.Bloques.coral_rojo;
import RubyCraft.Bloques.coral_rojo_muerto;
import RubyCraft.Bloques.coral_rosa;
import RubyCraft.Bloques.coral_rosa_muerto;
import RubyCraft.Bloques.cristal_azul_claro;
import RubyCraft.Bloques.cristal_verde_lima;
import RubyCraft.Bloques.generar_dragon;
import RubyCraft.Bloques.ladrillo_de_andesita;
import RubyCraft.Bloques.ladrillo_de_diorita;
import RubyCraft.Bloques.ladrillo_de_granito;
import RubyCraft.Bloques.ladrillo_de_infiedra;
import RubyCraft.Bloques.madera_azul;
import RubyCraft.Bloques.madera_verde;
import RubyCraft.Bloques.mena_de_platino;
import RubyCraft.Bloques.mena_de_ruby;
import RubyCraft.Bloques.mena_de_ruby_end;
import RubyCraft.Bloques.mena_de_zafiro;
import RubyCraft.Bloques.mena_de_zafiro_end;
import RubyCraft.Bloques.mesa_de_zafiro_basica;
import RubyCraft.Bloques.obsidiana_que_llora;
import RubyCraft.Bloques.polvo_de_cemento_azul;
import RubyCraft.Bloques.prueba;
import RubyCraft.Bloques.tronco_azul;
import RubyCraft.Bloques.tronco_verde;
import RubyCraft.Maquinas.mesa_de_conjuraciones;
import RubyCraft.Maquinas.mesa_de_zafiro;
import RubyCraft.Maquinas.minero;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Bloques {
	
	public static Block Ladrillo_Marino;
	public static Block bloque_de_ruby;
	public static Block Ladrillo_de_obsidiana;
	public static Block Bloqueluminiscente;
	public static Block Bloque_de_Zafiro;
    public static Block Bloque_de_azucar;
    public static Block bloque_de_blaze;
    public static Block Bloque_de_Diamante_Trol;
    public static Block Bloque_de_uranio;
    public static Block Ladrillo_del_Bosque;
    public static Block Bloque_de_comandos;
    public static Block Bloque_de_Regeneracion;
    public static Block BloquedeEnderPearld;
    public static Block bloque_de_ojo_de_enderman;
    public static Block Bloque_de_veneno;
    public static Block ladrillo_de_granito;
    public static Block ladrillo_de_andesita;
    public static Block ladrillo_de_diorita;
    public static Block ladrillo_de_infiedra;
    public static Block bloque_de_pedernal;
    public static Block obsidiana_que_llora;
    public static Block Cuarzo_azul;
    public static Block Cuarzo_verde;
    public static Block Cuarzo_rojo;
    public static Block polvo_de_cemento_azul;
    public static Block mena_de_ruby;
    public static Block mena_de_zafiro;
    public static Block mena_de_zafiro_end;
    public static Block mena_de_ruby_end;
    public static Block mesa_de_conjuraciones;
    public static Block bloque_de_cobre;
    public static Block cristal_azul_claro;
    public static Block cristal_verde_lima;
    public static Block bloque_de_caca;
    public static Block generar_dragon;    
    public static Block mesa_de_zafiro_basica;
    public static Block mesa_de_zafiro;
    public static Block bloque_galactico;
    public static Block calabaza_espectral;
    public static Block bloque_reforzado_tier_1;
    public static Block bloque_de_platino;
    public static Block mena_de_platino;
    public static Block bloque_de_actualizaciones;
    public static Block prueba;
    public static Block tronco_azul;
    public static Block tronco_verde;
    public static Block madera_azul;
    public static Block madera_verde;
    public static Block minero;
    
    //corales
    public static Block coral_azul;
    public static Block coral_azul_muerto;
    public static Block coral_amarillo;
    public static Block coral_amarillo_muerto;
    public static Block coral_morado;
    public static Block coral_morado_muerto;
    public static Block coral_rojo;
    public static Block coral_rojo_muerto;
    public static Block coral_rosa;
    public static Block coral_rosa_muerto;
    
    //Interfaces
    
    public static final int guiIDMesadeTrabajodeRuby = 0;
    public static final int guiIDMesadeTrabajodeZafiro = 1;
	
	public static void Iniciar(){	
		
		Ladrillo_Marino = new Ladrillo_Marino();
		bloque_de_ruby = new bloque_de_ruby();
		Ladrillo_de_obsidiana = new Ladrillo_de_obsidiana();
		Bloqueluminiscente = new Bloqueluminiscente();
		Bloque_de_Zafiro = new Bloque_de_Zafiro();
		Bloque_de_azucar = new Bloque_de_azucar();
		bloque_de_blaze = new bloque_de_blaze();
		Bloque_de_Diamante_Trol = new Bloque_de_Diamante_Trol();
		Bloque_de_uranio = new Bloque_de_uranio();
		Ladrillo_del_Bosque = new Ladrillo_del_Bosque();
		Bloque_de_comandos = new Bloque_de_comandos();
		Bloque_de_Regeneracion = new Bloque_de_Regeneracion();
		BloquedeEnderPearld = new BloquedeEnderPearld();
		bloque_de_ojo_de_enderman = new bloque_de_ojo_de_enderman();
		Bloque_de_veneno = new Bloque_de_veneno();
		ladrillo_de_granito = new ladrillo_de_granito();
		ladrillo_de_andesita = new ladrillo_de_andesita();
		ladrillo_de_diorita = new ladrillo_de_diorita();
		ladrillo_de_infiedra = new ladrillo_de_infiedra();
		bloque_de_pedernal = new bloque_de_pedernal();
		obsidiana_que_llora = new obsidiana_que_llora();
		Cuarzo_azul = new Cuarzo_azul();
		Cuarzo_verde = new Cuarzo_verde();
		Cuarzo_rojo = new Cuarzo_rojo();
		polvo_de_cemento_azul = new polvo_de_cemento_azul();
		mena_de_ruby = new mena_de_ruby();
		mena_de_zafiro = new mena_de_zafiro();
		mena_de_zafiro_end = new mena_de_zafiro_end();
		mena_de_ruby_end = new mena_de_ruby_end();
		mesa_de_conjuraciones = new mesa_de_conjuraciones();
		bloque_de_cobre = new bloque_de_cobre();
		cristal_azul_claro = new cristal_azul_claro();
		cristal_verde_lima = new cristal_verde_lima();
		bloque_de_caca = new bloque_de_caca();
		generar_dragon = new generar_dragon();
        mesa_de_zafiro_basica = new mesa_de_zafiro_basica();
        bloque_galactico = new bloque_galactico();
        calabaza_espectral = new calabaza_espectral();
        bloque_reforzado_tier_1 = new bloque_reforzado_tier_1();
        bloque_de_platino = new bloque_de_platino();
        mena_de_platino = new mena_de_platino();
        bloque_de_actualizaciones = new bloque_de_actualizaciones();
        mesa_de_zafiro = new mesa_de_zafiro();
        tronco_azul = new tronco_azul();
        tronco_verde = new tronco_verde();
        madera_azul = new madera_azul();
        madera_verde = new madera_verde();
        minero = new minero();
        
        //Bloques de arboles
     
        
        //corales
        coral_azul = new coral_azul();
        coral_azul_muerto = new coral_azul_muerto();
        coral_amarillo = new coral_amarillo();
        coral_amarillo_muerto  = new coral_amarillo_muerto();
        coral_morado  = new coral_morado();
        coral_morado_muerto  = new coral_morado_muerto();
        coral_rojo  = new coral_rojo();
        coral_rojo_muerto  = new coral_rojo_muerto();
        coral_rosa  = new coral_rosa();
        coral_rosa_muerto  = new coral_rosa_muerto();
        
        
        //Bloques de pruebas solo en version de desaroolador
        
        if(Control_de_Version.Version_de_desarrollador) {
        	prueba = new prueba();
        }
	}
	public static void Registrar(){
		RegistrarBloque(Ladrillo_Marino);
		RegistrarBloque(bloque_de_ruby);
		RegistrarBloque(Ladrillo_de_obsidiana);
		RegistrarBloque(Bloqueluminiscente);
		RegistrarBloque(Bloque_de_Zafiro);
		RegistrarBloque(Bloque_de_azucar);
		RegistrarBloque(bloque_de_blaze);
		RegistrarBloque(Bloque_de_Diamante_Trol);
		RegistrarBloque(Bloque_de_uranio);
		RegistrarBloque(Ladrillo_del_Bosque);
		RegistrarBloque(Bloque_de_comandos);
		RegistrarBloque(Bloque_de_Regeneracion);
		RegistrarBloque(BloquedeEnderPearld);
		RegistrarBloque(bloque_de_ojo_de_enderman);
		RegistrarBloque(Bloque_de_veneno);
		RegistrarBloque(ladrillo_de_granito);
		RegistrarBloque(ladrillo_de_andesita);
		RegistrarBloque(ladrillo_de_diorita);
		RegistrarBloque(ladrillo_de_infiedra);
		RegistrarBloque(bloque_de_pedernal);
		RegistrarBloque(obsidiana_que_llora);
		RegistrarBloque(Cuarzo_azul);
		RegistrarBloque(Cuarzo_verde);
		RegistrarBloque(Cuarzo_rojo);
		RegistrarBloque(polvo_de_cemento_azul);
		RegistrarBloque(mena_de_ruby);
		RegistrarBloque(mena_de_zafiro);		
		RegistrarBloque(mena_de_zafiro_end);
		RegistrarBloque(mena_de_ruby_end);
		RegistrarBloque(mesa_de_conjuraciones);
		RegistrarBloque(bloque_de_cobre);
		RegistrarBloque(cristal_azul_claro);
		RegistrarBloque(cristal_verde_lima);
		RegistrarBloque(bloque_de_caca);
		RegistrarBloque(generar_dragon);
		RegistrarBloque(mesa_de_zafiro_basica);
		RegistrarBloque(bloque_galactico);
		RegistrarBloque(calabaza_espectral);
		RegistrarBloque(bloque_reforzado_tier_1);
		RegistrarBloque(bloque_de_platino);
		RegistrarBloque(mena_de_platino);
		RegistrarBloque(bloque_de_actualizaciones);
		RegistrarBloque(mesa_de_zafiro);
		RegistrarBloque(tronco_azul);
	    RegistrarBloque(tronco_verde);
	    RegistrarBloque(madera_azul);
	    RegistrarBloque(madera_verde);
	    RegistrarBloque(minero);
		
		//corales
		RegistrarBloque(coral_azul);
		RegistrarBloque(coral_azul_muerto);
		RegistrarBloque(coral_amarillo);
	    RegistrarBloque( coral_amarillo_muerto);
	    RegistrarBloque( coral_morado);
	    RegistrarBloque(coral_morado_muerto);
	    RegistrarBloque( coral_rojo);
	    RegistrarBloque( coral_rojo_muerto);
	    RegistrarBloque( coral_rosa);
	    RegistrarBloque( coral_rosa_muerto);

	    //Bloques con subid
	    
	     //bloque de pruebas
        if(Control_de_Version.Version_de_desarrollador) {
        	RegistrarBloque(prueba);
        }
	    
	}
	
	public static void RegistarRenders(){ 
		
	    RegistrarRenderizado(Ladrillo_Marino);
	    RegistrarRenderizado(bloque_de_ruby);
	    RegistrarRenderizado(Ladrillo_de_obsidiana);
	    RegistrarRenderizado(Bloqueluminiscente);
	    RegistrarRenderizado(Bloque_de_Zafiro);
	    RegistrarRenderizado(Bloque_de_azucar);
	    RegistrarRenderizado(bloque_de_blaze);
	    RegistrarRenderizado(Bloque_de_Diamante_Trol);
	    RegistrarRenderizado(Bloque_de_uranio);
	    RegistrarRenderizado(Ladrillo_del_Bosque);
	    RegistrarRenderizado(Bloque_de_comandos);
	    RegistrarRenderizado(Bloque_de_Regeneracion);
	    RegistrarRenderizado(BloquedeEnderPearld);
	    RegistrarRenderizado(bloque_de_ojo_de_enderman);
	    RegistrarRenderizado(Bloque_de_veneno);
	    RegistrarRenderizado(ladrillo_de_granito);
	    RegistrarRenderizado(ladrillo_de_andesita);
	    RegistrarRenderizado(ladrillo_de_diorita);
	    RegistrarRenderizado(ladrillo_de_infiedra);
	    RegistrarRenderizado(bloque_de_pedernal);
	    RegistrarRenderizado(obsidiana_que_llora);
	    RegistrarRenderizado(Cuarzo_azul);
	    RegistrarRenderizado(Cuarzo_verde);
	    RegistrarRenderizado(Cuarzo_rojo);
	    RegistrarRenderizado(polvo_de_cemento_azul);
	    RegistrarRenderizado(mena_de_ruby);
	    RegistrarRenderizado(mena_de_zafiro);
	    RegistrarRenderizado(mena_de_zafiro_end);
	    RegistrarRenderizado(mena_de_ruby_end);
	    RegistrarRenderizado(mesa_de_conjuraciones);
	    RegistrarRenderizado(bloque_de_cobre);
	    RegistrarRenderizado(cristal_azul_claro);
	    RegistrarRenderizado(cristal_verde_lima);
	    RegistrarRenderizado(bloque_de_caca);
	    RegistrarRenderizado(generar_dragon);
	    RegistrarRenderizado(mesa_de_zafiro_basica);
	    RegistrarRenderizado(bloque_galactico);
	    RegistrarRenderizado(calabaza_espectral);
	    RegistrarRenderizado(bloque_reforzado_tier_1);
	    RegistrarRenderizado(bloque_de_platino);
	    RegistrarRenderizado(mena_de_platino);
	    RegistrarRenderizado(bloque_de_actualizaciones);
	    RegistrarRenderizado(mesa_de_zafiro);
	    RegistrarRenderizado(tronco_azul);
	    RegistrarRenderizado(tronco_verde);
	    RegistrarRenderizado(madera_azul);
	    RegistrarRenderizado(madera_verde);
	    RegistrarRenderizado(minero);
	    
	    //corales
	    RegistrarRenderizado(coral_azul);
	    RegistrarRenderizado(coral_azul_muerto);
	    RegistrarRenderizado(coral_amarillo);
	    RegistrarRenderizado( coral_amarillo_muerto);
	    RegistrarRenderizado( coral_morado);
	    RegistrarRenderizado(coral_morado_muerto);
	    RegistrarRenderizado( coral_rojo);
	    RegistrarRenderizado( coral_rojo_muerto);
	    RegistrarRenderizado( coral_rosa);
	    RegistrarRenderizado( coral_rosa_muerto);
	    
	    
	     //bloque de pruebas
        if(Control_de_Version.Version_de_desarrollador) {
        	RegistrarRenderizado(prueba);
        }
        
	}
	
	
      private static void RegistrarBloque(Block block){
		
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		block.setCreativeTab(RubyCraft.Rubycrafttab);
		
	}
	
      
      
      
      
	private static void RegistrarRenderizado(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Referencia.MOD_ID + ":" + block.getUnlocalizedName().substring(5)));	
		}
	
	
}
