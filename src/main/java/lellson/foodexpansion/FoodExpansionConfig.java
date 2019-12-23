package lellson.foodexpansion;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class FoodExpansionConfig {
	
	public static boolean disableRecipeBacon;
	public static boolean disableRecipeCookedBacon;
	public static boolean disableRecipeBaconAndEgg;
	public static boolean disableRecipeBlazeCream;
	public static boolean disableRecipeCactusFruit;
	public static boolean disableRecipeCarrotSeedSoup;
	public static boolean disableRecipeChocolateBar;
	public static boolean disableRecipeCompressedFlesh;
	public static boolean disableRecipeCookedBatWing;
	public static boolean disableRecipeCookedHorseMeat;
	public static boolean disableRecipeCookedMushroom;
	public static boolean disableRecipeCookedSquid;
	public static boolean disableRecipeCookedWolfMeat;
	public static boolean disableRecipeCookedOcelotMeat;
	public static boolean disableRecipeFriedEgg;
	public static boolean disableRecipeJelly;
	public static boolean disableRecipeNetherwartStew;
	public static boolean disableRecipeCarrotPie;
	public static boolean disableRecipeSpiderSoup;
	public static boolean disableRecipeCompressedToLeather;
	public static boolean disableRecipeBatToLeather;
	public static boolean disableSquidDrop;
	public static boolean disableHorseMeatDrop;
	public static boolean disableBatWingDrop;
	public static boolean disableWolfMeatDrop;
	public static boolean disableOcelotMeatDrop;
	public static boolean enableForbiddenFruit;
	public static boolean disableMelonSalad;
	public static boolean disableRoastedSeed;
	public static boolean disableDough;
	public static boolean enableStarvingFruit;
	public static boolean disableLollipop;
	public static boolean disableBeetrootNoodles;
	public static boolean disableRecipeCookedParrotMeat;
	public static boolean disableRecipeCookedLlamaMeat;
	public static boolean disableRecipeCookedPolarBearMeat;
	public static boolean disableParrotMeatDrop;
	public static boolean disableLlamaMeatDrop;
	public static boolean disablePolarBearMeatDrop;
	public static String[] bowlStackSizeItems;
	
	private static final String DISABLERECIPE_Bacon = "Disable Bacon Recipe";
	private static final String DISABLERECIPE_CookedBacon = "Disable Cooked Bacon Smelting Recipe";
	private static final String DISABLERECIPE_BaconAndEgg = "Disable Bacon And Egg Recipe";
	private static final String DISABLERECIPE_BlazeCream = "Disable Blaze Cream Recipe";
	private static final String DISABLERECIPE_CactusFruit = "Disable Cactus Fruit Recipe";
	private static final String DISABLERECIPE_CarrotSeedSoup = "Disable Carrot Seed Soup Recipe";
	private static final String DISABLERECIPE_ChocolateBar = "Disable Chocolate Bar Recipe";
	private static final String DISABLERECIPE_CompressedFlesh = "Disable Compressed Flesh Recipe";
	private static final String DISABLERECIPE_CookedMushroom = "Disable Cooked Mushroom Smelting Recipe";
	private static final String DISABLERECIPE_CookedSquid = "Disable Cooked Squid Smelting Recipe";
	private static final String DISABLERECIPE_CookedBatWing = "Disable Cooked Bat Wing Smelting Recipe";
	private static final String DISABLERECIPE_CookedHorseMeat = "Disable Cooked Horse Meat Smelting Recipe";
	private static final String DISABLERECIPE_CookedWolfMeat = "Disable Cooked Wolf Meat Smelting Recipe";
	private static final String DISABLERECIPE_CookedOcelotMeat = "Disable Cooked Ocelot Meat Smelting Recipe";
	private static final String DISABLERECIPE_CookedParrotMeat = "Disable Cooked Parrot Meat Smelting Recipe";
	private static final String DISABLERECIPE_CookedLlamaMeat = "Disable Llama Steak Smelting Recipe";
	private static final String DISABLERECIPE_CookedPolarBearMeat = "Disable Polar Bear Steak Smelting Recipe";
	private static final String DISABLERECIPE_FriedEgg = "Disable Fried Egg Smelting Recipe";
	private static final String DISABLERECIPE_Jelly = "Disable Jelly Recipe";
	private static final String DISABLERECIPE_NetherWartStew = "Disable Nether Wart Stew Recipe";
	private static final String DISABLERECIPE_CarrotPie = "Disable Carrot Pie Recipe";
	private static final String DISABLERECIPE_SpiderSoup = "Disable Spider Soup Recipe";
	private static final String DISABLERECIPE_CompressedToLeather = "Disable Compressed Flesh to Leather Smelting Recipe";
	private static final String DISABLERECIPE_BatToLeather = "Disable Bat Wing to Leather Recipe";
	private static final String DISABLEDROP_SquidDrop = "If set to true, squids are not allowed to drop Squid Meat";
	private static final String DISABLEDROP_HorseMeatDrop = "If set to true, horses are not allowed to drop Horse Meat";
	private static final String DISABLEDROP_BatWingDrop = "If set to true, bats are not allowed to drop Bat Wings";
	private static final String DISABLEDROP_WolfMeatDrop = "If set to true, wolves are not allowed to drop Wolf Meat";
	private static final String DISABLEDROP_OcelotMeatDrop = "If set to true, ocelots are not allowed to drop Ocelot Meat";
	private static final String ENABLERECIPE_ForbiddenFruit = "Enable Recipe for the Forbidden Fruit (8 Notch Apples + 1 Diamond Block)";
	private static final String ENABLERECIPE_StarvingFruit = "Enable Recipe for the Starving Fruit (8 Rotten Flesh + 1 Diamond Block)";
	private static final String DISABLERECIPE_MelonSalad = "Disable Melon Salad Recipe";
	private static final String DISABLERECIPE_RoastedSeed = "Disable Roasted Seed Recipe";
	private static final String DISABLERECIPE_Dough = "Disable Dough Recipe";
	private static final String DISABLERECIPE_Lollipop = "Disable Lollipop Recipe";
	private static final String DISABLERECIPE_BeetrootNoodles = "Disable Beetroot Noodles Recipe";
	private static final String STACKSIZE_BowlItems = "Items defined here have their stacksize increased to 64";
	private static final String DISABLEDROP_ParrotMeatDrop = "If set to true, parrots are not allowed to drop Parrot Meat";
	private static final String DISABLEDROP_LlamaMeatDrop = "If set to true, llamas are not allowed to drop Llama Meat";
	private static final String DISABLEDROP_PolarBearMeatDrop = "If set to true, polar bears are not allowed to drop Polar Bear Meat";
	
	public static void syncConfig(){
		FMLCommonHandler.instance().bus().register(FoodExpansion.instance);
		
		final String RECIPES = FoodExpansion.config.CATEGORY_GENERAL + FoodExpansion.config.CATEGORY_SPLITTER + "Disable Recipes";
		FoodExpansion.config.addCustomCategoryComment(RECIPES, "Set to true, to disable the Recipes");
		
		final String DROPS = FoodExpansion.config.CATEGORY_GENERAL + FoodExpansion.config.CATEGORY_SPLITTER + "Disable Mobdrops";
		FoodExpansion.config.addCustomCategoryComment(DROPS, "Set to true, to disable the Mobdrops");
		
		final String GENERAL = FoodExpansion.config.CATEGORY_GENERAL + FoodExpansion.config.CATEGORY_SPLITTER + "General";
		FoodExpansion.config.addCustomCategoryComment(GENERAL, "General Settings");
		
		disableRecipeBacon = FoodExpansion.config.get(RECIPES, DISABLERECIPE_Bacon, false).getBoolean(false);
		disableRecipeCookedBacon = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedBacon, false).getBoolean(false);
		disableRecipeBaconAndEgg = FoodExpansion.config.get(RECIPES, DISABLERECIPE_BaconAndEgg, false).getBoolean(false);
		disableRecipeBlazeCream = FoodExpansion.config.get(RECIPES, DISABLERECIPE_BlazeCream, false).getBoolean(false);
		disableRecipeCactusFruit = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CactusFruit, false).getBoolean(false);
		disableRecipeCarrotSeedSoup = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CarrotSeedSoup, false).getBoolean(false);
		disableRecipeChocolateBar = FoodExpansion.config.get(RECIPES, DISABLERECIPE_ChocolateBar, false).getBoolean(false);
		disableRecipeCompressedFlesh = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CompressedFlesh, false).getBoolean(false);
		disableRecipeCookedSquid = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedSquid, false).getBoolean(false);
		disableRecipeFriedEgg = FoodExpansion.config.get(RECIPES, DISABLERECIPE_FriedEgg, false).getBoolean(false);
		disableRecipeJelly = FoodExpansion.config.get(RECIPES, DISABLERECIPE_Jelly, false).getBoolean(false);
		disableRecipeNetherwartStew = FoodExpansion.config.get(RECIPES, DISABLERECIPE_NetherWartStew, false).getBoolean(false);
		disableRecipeSpiderSoup = FoodExpansion.config.get(RECIPES, DISABLERECIPE_SpiderSoup, false).getBoolean(false);
		disableRecipeCookedHorseMeat = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedHorseMeat, false).getBoolean(false);
		disableRecipeCompressedToLeather = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CompressedToLeather, false).getBoolean(false);
		disableSquidDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_SquidDrop, false).getBoolean(false);
		disableHorseMeatDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_HorseMeatDrop, false).getBoolean(false);
		disableBatWingDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_BatWingDrop, false).getBoolean(false);
		enableForbiddenFruit = FoodExpansion.config.get(GENERAL, ENABLERECIPE_ForbiddenFruit, false).getBoolean(false);
		disableRecipeCookedMushroom = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedMushroom, false).getBoolean(false);
		disableRecipeCarrotPie = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CarrotPie, false).getBoolean(false);
		disableRecipeCookedBatWing = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedBatWing, false).getBoolean(false);
		disableRecipeBatToLeather = FoodExpansion.config.get(RECIPES, DISABLERECIPE_BatToLeather, false).getBoolean(false);
		disableMelonSalad = FoodExpansion.config.get(RECIPES, DISABLERECIPE_MelonSalad, false).getBoolean(false);
		disableRoastedSeed = FoodExpansion.config.get(RECIPES, DISABLERECIPE_RoastedSeed, false).getBoolean(false);
		disableDough = FoodExpansion.config.get(RECIPES, DISABLERECIPE_Dough, false).getBoolean(false);
		disableRecipeCookedWolfMeat = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedWolfMeat, false).getBoolean(false);
		disableRecipeCookedOcelotMeat = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedOcelotMeat, false).getBoolean(false);
		disableWolfMeatDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_WolfMeatDrop, false).getBoolean(false);
		disableOcelotMeatDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_OcelotMeatDrop, false).getBoolean(false);
		enableStarvingFruit = FoodExpansion.config.get(GENERAL, ENABLERECIPE_StarvingFruit, false).getBoolean(false);
		disableLollipop = FoodExpansion.config.get(RECIPES, DISABLERECIPE_Lollipop, false).getBoolean(false);
		disableBeetrootNoodles = FoodExpansion.config.get(RECIPES, DISABLERECIPE_BeetrootNoodles, false).getBoolean(false);
		disableRecipeCookedParrotMeat = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedParrotMeat, false).getBoolean(false);
		disableRecipeCookedLlamaMeat = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedLlamaMeat, false).getBoolean(false);
		disableRecipeCookedPolarBearMeat = FoodExpansion.config.get(RECIPES, DISABLERECIPE_CookedPolarBearMeat, false).getBoolean(false);
		disableParrotMeatDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_ParrotMeatDrop, false).getBoolean(false);
		disableLlamaMeatDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_LlamaMeatDrop, false).getBoolean(false);
		disablePolarBearMeatDrop = FoodExpansion.config.get(DROPS, DISABLEDROP_PolarBearMeatDrop, false).getBoolean(false);
		
		bowlStackSizeItems = FoodExpansion.config.getStringList("bowlStackSizeItems", GENERAL, new String[]{"minecraft:mushroom_stew", "minecraft:rabbit_stew", "minecraft:beetroot_soup", "foodexpansion:itemmelonsalad", "foodexpansion:itemcarrotseedsoup", "foodexpansion:itemblazecream", "foodexpansion:itemnetherwartsoup", "foodexpansion:itemspidersoup", "foodexpansion:itembeetrootnoodles"}, STACKSIZE_BowlItems);
		
		if(FoodExpansion.config.hasChanged()){
			FoodExpansion.config.save();
		}
	}
}
