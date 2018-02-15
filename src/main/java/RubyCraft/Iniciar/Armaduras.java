package RubyCraft.Iniciar;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.ArmadurasConEventosRaros.casco_de_tortuga;
import RubyCraft.Bases.ArmadurasBases;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Armaduras {
	
    //Armaduras
	
	public static Item casco_de_ruby;
	public static Item pechera_de_ruby;
	public static Item grebas_de_ruby;
	public static Item botas_de_ruby;

	public static Item casco_de_zafiro;
	public static Item pechera_de_zafiro;
	public static Item grebas_de_zafiro;
	public static Item botas_de_zafiro;
	
	public static Item casco_de_uranio;
	public static Item pechera_de_uranio;
	public static Item pantacas_de_uranio;
	public static Item botas_de_uranio;
	
	
	public static Item casco_de_tortuga;
	
	public static Item elitros;
	
	//Material
	public static final ItemArmor.ArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmorMaterial",Referencia.MOD_ID + ":ruby", 3000, new int[]{4,5,4,4}, 45, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);	   
	public static final ItemArmor.ArmorMaterial ZafiroArmorMaterial = EnumHelper.addArmorMaterial("ZafiroArmorMaterial", Referencia.MOD_ID + ":zafiro", 2000, new int[]{5,6,7,2}, 45, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);	
	public static final ItemArmor.ArmorMaterial UranioArmorMaterial = EnumHelper.addArmorMaterial("UranioArmorMaterial", Referencia.MOD_ID + ":uranio", 1000, new int[]{3,5,3,1}, 45, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F);
	public static final ItemArmor.ArmorMaterial elitromaterial  = EnumHelper.addArmorMaterial("elitromaterial", Referencia.MOD_ID + ":elitro", 256, new int[] {1,1,1,1}, 45, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 0.0F);
	public static final ItemArmor.ArmorMaterial tortuga = EnumHelper.addArmorMaterial("tortuga", Referencia.MOD_ID + ":tortuga",  275, new int[] {2,2,2,2}, 45, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 0.0F);
	
	public static void Iniciar(){
		
     casco_de_ruby = new ArmadurasBases(RubyArmorMaterial, 1, EntityEquipmentSlot.HEAD, "casco_de_ruby");
     pechera_de_ruby = new ArmadurasBases(RubyArmorMaterial, 1, EntityEquipmentSlot.CHEST, "pechera_de_ruby");
     grebas_de_ruby = new ArmadurasBases(RubyArmorMaterial, 2, EntityEquipmentSlot.LEGS, "grebas_de_ruby");
     botas_de_ruby = new ArmadurasBases(RubyArmorMaterial, 1, EntityEquipmentSlot.FEET, "botas_de_ruby");
     
     casco_de_zafiro = new ArmadurasBases(ZafiroArmorMaterial, 1, EntityEquipmentSlot.HEAD, "casco_de_zafiro");
     pechera_de_zafiro = new ArmadurasBases(ZafiroArmorMaterial, 1, EntityEquipmentSlot.CHEST, "pechera_de_zafiro");
     grebas_de_zafiro = new ArmadurasBases(ZafiroArmorMaterial, 2, EntityEquipmentSlot.LEGS, "grebas_de_zafiro");
     botas_de_zafiro = new ArmadurasBases(ZafiroArmorMaterial, 1, EntityEquipmentSlot.FEET, "botas_de_zafiro");
     
     casco_de_uranio = new ArmadurasBases(UranioArmorMaterial, 1, EntityEquipmentSlot.HEAD, "casco_de_uranio");
     pechera_de_uranio = new ArmadurasBases(UranioArmorMaterial, 1, EntityEquipmentSlot.CHEST, "pechera_de_uranio");
     pantacas_de_uranio = new ArmadurasBases(UranioArmorMaterial, 2, EntityEquipmentSlot.LEGS, "pantacas_de_uranio");
     botas_de_uranio = new ArmadurasBases(UranioArmorMaterial, 1, EntityEquipmentSlot.FEET, "botas_de_uranio");
     
     elitros = new ArmadurasBases(elitromaterial, 1, EntityEquipmentSlot.CHEST, "elitros");
	 
     casco_de_tortuga = new casco_de_tortuga(tortuga, 1 ,EntityEquipmentSlot.HEAD, "casco_de_tortuga");
     
	}
	
	public static void registrar(){
		
	RegistrarItem(casco_de_ruby);
	RegistrarItem(pechera_de_ruby);
	RegistrarItem(grebas_de_ruby);
	RegistrarItem(botas_de_ruby);
	
	RegistrarItem(casco_de_zafiro);
	RegistrarItem(pechera_de_zafiro);
	RegistrarItem(grebas_de_zafiro);
	RegistrarItem(botas_de_zafiro);
	
	RegistrarItem(casco_de_uranio);
	RegistrarItem(pechera_de_uranio);
	RegistrarItem(pantacas_de_uranio);
	RegistrarItem(botas_de_uranio);
	
	RegistrarItem(elitros);
	RegistrarItem(casco_de_tortuga);
	
	}
	
	public static void RegistrarRenders(){
	
   RegistrarRender(casco_de_ruby);
   RegistrarRender(pechera_de_ruby);
   RegistrarRender(grebas_de_ruby);
   RegistrarRender(botas_de_ruby);
   
   RegistrarRender(casco_de_zafiro);
   RegistrarRender(pechera_de_zafiro);
   RegistrarRender(grebas_de_zafiro);
   RegistrarRender(botas_de_zafiro);
   
   RegistrarRender(casco_de_uranio);
   RegistrarRender(pechera_de_uranio);
   RegistrarRender(pantacas_de_uranio);
   RegistrarRender(botas_de_uranio);
   
   RegistrarRender(elitros);
   
   RegistrarRender(casco_de_tortuga);
		
	}
	
	public static void RegistrarItem(Item item){
		item.setCreativeTab(RubyCraft.Rubycrafttab);
		ForgeRegistries.ITEMS.register(item);
		
	}
	
	private static void RegistrarRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}
	
}
