package RubyCraft;

public class Referencia {
 
	public static final String MOD_ID = "rc";
	public static final String NAME = "RubyCraft";
	public static final String VERSION = "1.2";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	public static final String CLIENT_PROXY_CLASS = "RubyCraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "RubyCraft.proxy.ServerProxy";
 
	public static enum RubyCraftItems{
		RUBY("ruby", "ruby"),
		PEPITA_DE_RUBY("pepita_de_ruby","pepita_de_ruby"),
		PEPITA_DE_ZAFIRO("pepita_de_zafiro","pepita_de_zafiro"),
		PEPITA_DE_HIERRO("Pepita_de_Hierro","Pepita_de_Hierro"),
		ZAFIRO("zafiro","zafiro"),
		PLASTICO("plastico","plastico"),
		URANIO("uranio","uranio"),
		AMULETO("amuleto","amuleto"),
		COLORES("colores","colores"),
		BOLADERESINA("boladeresina","boladeresina"),		
		ANILLO("anillo","anillo"),
		MARCODELAMULETO("marcodelamuleto","marcodelamuleto"),
		PALO_VERDE("palo_verde","palo_verde"),
		ALUMINIO("aluminio","aluminio"),
		COBRE("cobre","cobre"),
		MODE_PARA_COFRES("molde_para_cofres","molde_para_cofres"),
		BARRA_DE_ALUMINIO("barra_de_aluminio","barra_de_aluminio"),
		VARITA("varita","varita"),
		LINGOTE_GALACTICO("lingote_galactico","lingote_galactico"),
		PLATINO("platino","platino"),
		ALGA("alga","alga"),
		ENGRANAJE_DE_DIAMANTE("engranaje_de_diamante","engranaje_de_diamante"),
	    
		//Comida
		PAN_DE_CALABAZA("pan_de_calabaza","pan_de_calabaza"),
		HUEVO_FRITO("huevo_frito","huevo_frito"),
		MANZANA_DE_DIAMANTE("manzana_de_diamante","manzana_de_diamante"),
		ALGA_SECA("alga_seca","alga_seca"),
		
	;
		private String UnlocalizedName;
		private String registryName;
		
		
		RubyCraftItems(String unlocalizedName, String registryName){
			this.UnlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return UnlocalizedName;
		}
		public String getRegistryName(){
			return registryName;
		}
		
	}
	public static enum RubyCraftBloques{
		LADRILLO_MARINO("ladrillomarino","ladrillomarino"),
		BLOQUE_DE_RUBY("bloque_de_ruby","bloque_de_ruby"),
		LADRILLO_DE_OBSIDIANA("ladrillodeobsidiana","ladrillodeobsidiana"),
		BLOQUELUMINISCENTE("bloqueluminiscente","bloqueluminiscente"),
		BLOQUE_DE_ZAFIRO("bloque_de_zafiro","bloque_de_zafiro"),
		BLOQUE_DE_AZUCAR("bloque_de_azucar","bloque_de_azucar"),
		BLOQUE_DE_BLAZE("bloque_de_blaze","bloque_de_blaze"),
		BLOQUE_DE_DIAMANTE_TROL("bloque_de_diamante_trol","bloque_de_diamante_trol"),
		BLOQUE_DE_URANIO("bloque_de_uranio","bloque_de_uranio"),
		LADRILLO_DEL_BOSQUE("ladrillo_del_bosque","ladrillo_del_bosque"),
		BLOQUE_DE_COMANDOS("bloque_de_comandos","bloque_de_comandos"),
		BLOQUE_DE_REGERENACION("bloque_de_regeneracion","bloque_de_regeneracion"),
		BLOQUEDEENDERPEARL("bloquedeenderpearld","bloquedeenderpearld"),
		BLOQUE_DE_OJO_DE_ENDERMAN("bloque_de_ojo_de_enderman","bloque_de_ojo_de_enderman"),
		BLOQUE_DE_VENENO("bloque_de_veneno","bloque_de_veneno"),
		LADRILLO_DE_GRANITO("ladrillo_de_granito","ladrillo_de_granito"),
		LADRILLO_DE_ANDESITA("ladrillo_de_andesita","ladrillo_de_andesita"),
		LADRILLO_DE_DIORITA("ladrillo_de_diorita","ladrillo_de_diorita"),
		LADRILLO_DE_INFIEDRA("ladrillo_de_infiedra","ladrillo_de_infiedra"),
		BLOQUE_De_PEDERNAL("bloque_de_pedernal","bloque_de_pedernal"),
		OBSIDIANA_QUE_LLORA("obsidiana_que_llora","obsidiana_que_llora"),
		CUARZO_AZUL("cuarzo_azul","cuarzo_azul"),
	    CUARZO_VERDE("cuarzo_verde","cuarzo_verde"),
	    CUARZO_ROJO("cuarzo_rojo","cuarzo_rojo"),
		POLVO_DE_CEMENTO_AZUL("polvo_de_cemento_azul","polvo_de_cemento_azul"),
		MENA_DE_RUBY("mena_de_ruby","mena_de_ruby"),
		MENA_DE_ZAFIRO("mena_de_zafiro","mena_de_zafiro"),
		MENA_DE_ZAFIRO_END("mena_de_zafiro_end","mena_de_zafiro_end"),
		MENA_DE_RUBY_END("mena_de_ruby_end","mena_de_ruby_end"),
		MESA_DE_CONJURACIONES("mesa_de_conjuraciones","mesa_de_conjuraciones"),
		BLOQUE_DE_COBRE("bloque_de_cobre","bloque_de_cobre"),
        CRISTAL_AZUL_CLARO("cristal_azul_claro","cristal_azul_claro"),
        CRISTAL_VERDE_LIMA("cristal_verde_lima","cristal_verde_lima"),
        BLOQUE_DE_CACA("bloque_de_caca","bloque_de_caca"),
        GENERAR_DRAGON("generar_dragon","generar_dragon"),
		MESA_DE_RUBY("mesa_de_ruby","mesa_de_ruby"),
        MESA_DE_ZAFIRO("mesa_de_zafiro","mesa_de_zafiro"),
        MESA_DE_ZAFIRO_BASICA("mesa_de_zafiro_basica","mesa_de_zafiro_basica"),
        BLOQUE_GALACTICO("bloque_galactico","bloque_galactico"),
        CALABAZA_ESPECTRAL("calabaza_espectral","calabaza_espectral"),
        BLOQUE_REFORZADO_TIER_I("bloque_reforzado_tier_1","bloque_reforzado_tier_1"),
        BLOQUE_DE_PLATINO("bloque_de_platino","bloque_de_platino"),
        MENA_DE_PLATINO("mena_de_platino","mena_de_platino"),
        BLOQUE_DE_ACTUALIZACIONES("bloque_de_actualizaciones","bloque_de_actualizaciones"),
        TRONCO_AZUL("tronco_azul","tronco_azul"),
        TRONCO_VERDE("tronco_verde","tronco_verde"),
        MADERA_AZUL("madera_azul","madera_azul"),
        MADERA_VERDE("madera_verde","madera_verde"),
        MINERO("minero","minero"),
        
        
        //Corales
        CORAL_AZUL("coral_azul","coral_azul"),
        CORAL_AZUL_MUERTO("coral_azul_muerto","coral_azul_muerto"),
    	CORAL_AMARILLO("coral_amarillo","coral_amarillo"),
        CORAL_AMARILLO_MUERTO("coral_amarillo_muerto","coral_amarillo_muerto"),
        CORAL_MORADO("coral_morado","coral_morado"),
        CORAL_MORADO_MUERTO("coral_morado_muerto","coral_morado_muerto"),
        CORAL_ROJO("coral_rojo","coral_rojo"),
        CORAL_ROJO_MUERTO("coral_rojo_muerto","coral_rojo_muerto"),
        CORAL_ROSA("coral_rosa","coral_rosa"),
        CORAL_ROSA_MUERTO("coral_rosa_muerto","coral_rosa_muerto"),
		
        
        //PRUEBA
        PRUEBA("prueba","prueba"),
        
        
		;
		private String UnlocalizedName;
		private String registryName;
		
		
		RubyCraftBloques(String unlocalizedName, String registryName){
			this.UnlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return UnlocalizedName;
		}
		public String getRegistryName(){
			return registryName;
		}
		
	   }
	
	public static enum RubyCraftHerramientas{
	PICO_DE_RUBY("pico_de_ruby","pico_de_ruby"),
	HACHA_DE_RUBY("hacha_de_ruby","hacha_de_ruby"),
	PALA_DE_RUBY("pala_de_ruby","pala_de_ruby"),
	AZADA_DE_RUBY("azada_de_ruby","azada_de_ruby"),
	ESPADA_DE_RUBY("espada_de_ruby","espada_de_ruby"),
	TIJERA_DE_RUBY("tijera_de_ruby","tijera_de_ruby"),
	ARCO_DE_RUBY("arco_de_ruby","arco_de_ruby"),
	
	PICO_DE_ZAFIRO("pico_de_zafiro","pico_de_zafiro"),
	HACHA_DE_ZAFIRO("hacha_de_zafiro","hacha_de_zafiro"),
	PALA_DE_ZAFIRO("pala_de_zafiro","pala_de_zafiro"),
	AZADA_DE_ZAFIRO("azada_de_zafiro","azada_de_zafiro"),
	ESPADA_DE_ZAFIRO("espada_de_zafiro","espada_de_zafiro"),
	TIJERA_DE_ZAFIRO("tijera_de_zafiro","tijera_de_zafiro"),
	ARCO_DE_ZAFIRO("arco_de_zafiro","arco_de_zafiro"),
	
	PICO_DE_COBRE("pico_de_cobre","pico_de_cobre"),
	HACHA_DE_COBRE("hacha_de_cobre","hacha_de_cobre"),
	PALA_DE_COBRE("pala_de_cobre","pala_de_cobre"),
	AZADA_DE_COBRE("azada_de_cobre","azada_de_cobre"),
	ESPADA_DE_COBRE("espada_de_cobre","espada_de_cobre"),
	TIJERA_DE_COBRE("tijera_de_cobre","tijera_de_cobre"),
	
	ESPADA_DE_PLATINO("espada_de_platino","espada_de_platino"),
	
	;
		private String UnlocalizedName;
		private String registryName;
		
		
		RubyCraftHerramientas(String unlocalizedName, String registryName){
			this.UnlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return UnlocalizedName;
		}
		public String getRegistryName(){
			return registryName;
		}
	
	}
	
	public static enum RubyCraftEscaleras{
		
		ESCALERA_DE_ANDESITA("escalera_de_andesita","escalera_de_andesita"),
		
			
		;
			private String UnlocalizedName;
			private String registryName;
			
			
			RubyCraftEscaleras(String unlocalizedName, String registryName){
				this.UnlocalizedName = unlocalizedName;
				this.registryName = registryName;
			}
			public String getUnlocalizedName(){
				return UnlocalizedName;
			}
			public String getRegistryName(){
				return registryName;
			}
		
		}
}

		