package lellson.foodexpansion;

import java.util.ArrayList;
import java.util.List;

import lellson.foodexpansion.items.ItemFoodBasic;
import lellson.foodexpansion.items.ItemForbiddenFruit;
import lellson.foodexpansion.items.ItemLollipop;
import lellson.foodexpansion.items.ItemNetherWartSoup;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodItems {
	
	public static final List<Item> ITEM_LIST = new ArrayList<Item>();
	
	public static Item itemJelly;
	public static Item itemBacon;
	public static Item itemCookedBacon;
	public static Item itemFriedEgg;
	public static Item itemBaconAndEgg;
	public static Item itemCarrotSeedSoup;
	public static Item itemSquid;
	public static Item itemCookedSquid;
	public static Item itemCompressedFlesh;
	public static Item itemChocolateBar;
	public static Item itemSpiderSoup;
	public static Item itemNetherWartSoup;
	public static Item itemCactusFruit;
	public static Item itemHorseMeat;
	public static Item itemCookedHorseMeat;
	public static Item itemCookedMushroom;
	public static Item itemCarrotPie;
	public static Item itemBatWing;
	public static Item itemCookedBatWing;
	public static Item itemBlazeCream;
	public static Item itemMelonSalad;
	public static Item itemRoastedSeed;
	public static Item itemDough;
	public static Item itemWolfMeat;
	public static Item itemCookedWolfMeat;
	public static Item itemOcelotMeat;
	public static Item itemCookedOcelotMeat;
	public static Item itemLollipop;
	public static Item itemForbiddenFruit;
	public static Item itemStarvingFruit;
	public static Item itemBeetrootNoodles;
	public static Item itemParrotMeat;
	public static Item itemCookedParrotMeat;
	public static Item itemLlamaMeat;
	public static Item itemCookedLlamaMeat;
	public static Item itemPolarBearMeat;
	public static Item itemCookedPolarBearMeat;

	public static void init() {
		
		ItemStack bowl = new ItemStack(Items.BOWL);
		
		itemJelly = new ItemFoodBasic("itemJelly", 4, 0.6F, false, new PotionEffect[]{new PotionEffect(MobEffects.NAUSEA, 200, 0)}, null, 64);
		itemBacon = new ItemFoodBasic("itemBacon", 1, 0.2F, true, 16);
		itemCookedBacon = new ItemFoodBasic("itemCookedBacon", 3, 0.4F, true, 16);
		itemFriedEgg = new ItemFoodBasic("itemFriedEgg", 2, 0.3F);
		itemBaconAndEgg = new ItemFoodBasic("itemBaconAndEgg", 7, 0.8F);
		itemCarrotSeedSoup = new ItemFoodBasic("itemCarrotSeedSoup", 8, 0.8F, false, bowl);
		itemSquid = new ItemFoodBasic("itemSquid", 1, 0.2F);
		itemCookedSquid = new ItemFoodBasic("itemCookedSquid", 3, 0.5F);
		itemCompressedFlesh = new ItemFoodBasic("itemCompressedFlesh", 6, 0.2F, true);
		itemChocolateBar = new ItemFoodBasic("itemChocolateBar", 8, 1.0F);
		itemSpiderSoup = new ItemFoodBasic("itemSpiderSoup", 3, 0.4F, false, new PotionEffect[]{new PotionEffect(MobEffects.NIGHT_VISION, 200, 0), new PotionEffect(MobEffects.POISON, 100, 0)}, bowl, 32);
		itemNetherWartSoup = new ItemNetherWartSoup();
		itemCactusFruit = new ItemFoodBasic("itemCactusFruit", 1, 0.1F);
		itemHorseMeat = new ItemFoodBasic("itemHorseMeat", 3, 0.3F, true);
		itemCookedHorseMeat = new ItemFoodBasic("itemCookedHorseMeat", 8, 0.8F, true);
		itemCookedMushroom = new ItemFoodBasic("itemCookedMushroom", 2, 0.2F);
		itemCarrotPie = new ItemFoodBasic("itemCarrotPie", 8, 0.8F);
		itemBatWing = new ItemFoodBasic("itemBatWing", 1, 0.1F, false, new PotionEffect[]{new PotionEffect(MobEffects.HUNGER, 200, 0)}, 2, null, 32);
		itemCookedBatWing = new ItemFoodBasic("itemCookedBatWing", 3, 0.2F, false, new PotionEffect[]{new PotionEffect(MobEffects.HUNGER, 200, 0)}, 8, null, 32);
		itemBlazeCream = new ItemFoodBasic("itemBlazeCream", 4, 0.4F, false, new PotionEffect[]{new PotionEffect(MobEffects.FIRE_RESISTANCE, 300, 0)}, bowl, 32);
		itemMelonSalad = new ItemFoodBasic("itemMelonSalad", 6, 0.6F, false, bowl);
		itemRoastedSeed = new ItemFoodBasic("itemRoastedSeed", 1, 0.1F);
		itemDough = new Item().setUnlocalizedName("itemDough").setRegistryName("itemDough");
		ITEM_LIST.add(itemDough);
		itemWolfMeat = new ItemFoodBasic("itemWolfMeat", 2, 0.3F, true);
		itemCookedWolfMeat = new ItemFoodBasic("itemCookedWolfMeat", 6, 0.7F, true);
		itemOcelotMeat = new ItemFoodBasic("itemOcelotMeat", 2, 0.3F, true);
		itemCookedOcelotMeat = new ItemFoodBasic("itemCookedOcelotMeat", 6, 0.7F, true);
		itemLollipop = new ItemLollipop();
		itemBeetrootNoodles = new ItemFoodBasic("itemBeetrootNoodles", 6, 0.6F, false, bowl);
		itemParrotMeat = new ItemFoodBasic("itemParrotMeat", 2, 0.3F, true);
		itemCookedParrotMeat = new ItemFoodBasic("itemCookedParrotMeat", 6, 0.7F, true);
		itemLlamaMeat = new ItemFoodBasic("itemLlamaMeat", 2, 0.3F, true);
		itemCookedLlamaMeat = new ItemFoodBasic("itemCookedLlamaMeat", 7, 0.8F, true);
		itemPolarBearMeat = new ItemFoodBasic("itemPolarBearMeat", 3, 0.3F, true);
		itemCookedPolarBearMeat = new ItemFoodBasic("itemCookedPolarBearMeat", 8, 0.8F, true);
		itemForbiddenFruit = new ItemForbiddenFruit("itemForbiddenFruit", true);
		itemStarvingFruit = new ItemForbiddenFruit("itemStarvingFruit", false);
	}
	
	public static void increaseStackSizes() {
		
		for (String s : FoodExpansionConfig.bowlStackSizeItems)
		{
			Item item = Item.getByNameOrId(s);
			
			if (item != null)
				item.setMaxStackSize(64);
			else
				FMLLog.warning("Food Expansion: Couldn't increase stacksize. %s is not a valid item!", s);
		}
	}

	public static void renderRegistry() {
		
		for(Item item : ITEM_LIST) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}
