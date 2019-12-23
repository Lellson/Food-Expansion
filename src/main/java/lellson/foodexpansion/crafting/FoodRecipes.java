package lellson.foodexpansion.crafting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lellson.foodexpansion.FoodExpansionConfig;
import lellson.foodexpansion.FoodItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class FoodRecipes {
		
	public static void initShapelessRecipes(){
		
		/*Shapeless Recipes
		addShapeless(new ItemStack(FoodItems.itemJelly), FoodExpansionConfig.disableRecipeJelly, new ItemStack(Items.SLIME_BALL), new ItemStack(Items.SLIME_BALL), new ItemStack(Items.SLIME_BALL), new ItemStack(Items.SLIME_BALL), new ItemStack(Items.SUGAR));
		addShapeless(new ItemStack(FoodItems.itemBacon, 2), FoodExpansionConfig.disableRecipeBacon, new ItemStack(Items.PORKCHOP));
		addShapeless(new ItemStack(FoodItems.itemBaconAndEgg), FoodExpansionConfig.disableRecipeBaconAndEgg, new ItemStack(FoodItems.itemFriedEgg), new ItemStack(FoodItems.itemCookedBacon));
		addShapeless(new ItemStack(FoodItems.itemCarrotSeedSoup), FoodExpansionConfig.disableRecipeCarrotSeedSoup, new ItemStack(Items.CARROT), new ItemStack(Items.CARROT), new ItemStack(Items.BOWL));
		addShapeless(new ItemStack(FoodItems.itemChocolateBar), FoodExpansionConfig.disableRecipeChocolateBar, new ItemStack(Items.DYE, 1, 3), new ItemStack(Items.DYE, 1, 3), new ItemStack(Items.SUGAR), new ItemStack(Items.SUGAR), new ItemStack(Items.MILK_BUCKET));
		addShapeless(new ItemStack(FoodItems.itemSpiderSoup), FoodExpansionConfig.disableRecipeSpiderSoup, new ItemStack(Items.FERMENTED_SPIDER_EYE), new ItemStack(Items.SPIDER_EYE), new ItemStack(Items.BOWL));
		addShapeless(new ItemStack(FoodItems.itemNetherWartSoup), FoodExpansionConfig.disableRecipeNetherwartStew, new ItemStack(Items.NETHER_WART), new ItemStack(Items.NETHER_WART), new ItemStack(Items.SUGAR), new ItemStack(Items.BOWL));
		addShapeless(new ItemStack(FoodItems.itemCarrotPie), FoodExpansionConfig.disableRecipeCarrotPie, new ItemStack(Items.CARROT), new ItemStack(Items.WHEAT), new ItemStack(Items.EGG));
		addShapeless(new ItemStack(FoodItems.itemCactusFruit), FoodExpansionConfig.disableRecipeCactusFruit, new ItemStack(Blocks.CACTUS));
		addShapeless(new ItemStack(FoodItems.itemCompressedFlesh), FoodExpansionConfig.disableRecipeCompressedFlesh, new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.SUGAR));
		addShapeless(new ItemStack(Items.LEATHER), FoodExpansionConfig.disableRecipeBatToLeather, new ItemStack(FoodItems.itemBatWing), new ItemStack(FoodItems.itemBatWing), new ItemStack(FoodItems.itemBatWing), new ItemStack(FoodItems.itemBatWing), new ItemStack(Items.DYE, 1, 15));
		addShapeless(new ItemStack(FoodItems.itemBlazeCream), FoodExpansionConfig.disableRecipeBlazeCream, new ItemStack(Items.BOWL), new ItemStack(Items.BLAZE_POWDER), new ItemStack(Items.BLAZE_POWDER), new ItemStack(Items.MILK_BUCKET));
		addShapeless(new ItemStack(FoodItems.itemMelonSalad), FoodExpansionConfig.disableMelonSalad, new ItemStack(Items.BOWL), new ItemStack(Items.MELON), new ItemStack(Items.MELON), new ItemStack(Items.MELON));
		addShapeless(new ItemStack(FoodItems.itemBeetrootNoodles), FoodExpansionConfig.disableBeetrootNoodles, new ItemStack(Items.BOWL), new ItemStack(Items.BEETROOT), new ItemStack(Items.BEETROOT), new ItemStack(Items.WHEAT), new ItemStack(Items.WATER_BUCKET));
		*/
	}
	public static void initShapedRecipes(){	
			
		/*Shaped Recipes
		addShaped(new ItemStack(FoodItems.itemForbiddenFruit), !FoodExpansionConfig.enableForbiddenFruit, new Object[] {"GGG", "GDG", "GGG", 'G', new ItemStack(Items.GOLDEN_APPLE, 1, 1), 'D', Blocks.DIAMOND_BLOCK});
		addShaped(new ItemStack(FoodItems.itemStarvingFruit), !FoodExpansionConfig.enableStarvingFruit, new Object[] {"RRR", "RDR", "RRR", 'R', Items.ROTTEN_FLESH, 'D', Blocks.DIAMOND_BLOCK});
		addShaped(new ItemStack(FoodItems.itemLollipop), FoodExpansionConfig.disableLollipop, new Object[]{" SS", " SS", "W  ", 'S', Items.SUGAR, 'W', Items.STICK});
		*/
	}
	public static void initSmeltingRecipes(){
		
			
		//Smelting Recipes
			
		if(!FoodExpansionConfig.disableRecipeFriedEgg){
			GameRegistry.addSmelting(new ItemStack(Items.EGG), new ItemStack(FoodItems.itemFriedEgg), 0.35F);
		}
			
		if(!FoodExpansionConfig.disableRecipeCookedBacon){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemBacon), new ItemStack(FoodItems.itemCookedBacon), 0.35F);
		}
			
		if(!FoodExpansionConfig.disableRecipeCookedSquid){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemSquid), new ItemStack(FoodItems.itemCookedSquid), 0.35F);
		}
			
		if(!FoodExpansionConfig.disableRecipeCompressedToLeather){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemCompressedFlesh), new ItemStack(Items.LEATHER), 0.35F);	
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedHorseMeat){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemHorseMeat), new ItemStack(FoodItems.itemCookedHorseMeat), 0.35F);
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedMushroom){
			GameRegistry.addSmelting(new ItemStack(Blocks.BROWN_MUSHROOM), new ItemStack(FoodItems.itemCookedMushroom), 0.35F);
			GameRegistry.addSmelting(new ItemStack(Blocks.RED_MUSHROOM), new ItemStack(FoodItems.itemCookedMushroom), 0.35F);
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedBatWing){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemBatWing), new ItemStack(FoodItems.itemCookedBatWing), 0.35F);	
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedWolfMeat){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemWolfMeat), new ItemStack(FoodItems.itemCookedWolfMeat), 0.35F);	
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedOcelotMeat){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemOcelotMeat), new ItemStack(FoodItems.itemCookedOcelotMeat), 0.35F);	
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedParrotMeat){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemParrotMeat), new ItemStack(FoodItems.itemCookedParrotMeat), 0.35F);
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedLlamaMeat){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemLlamaMeat), new ItemStack(FoodItems.itemCookedLlamaMeat), 0.35F);
		}
		
		if(!FoodExpansionConfig.disableRecipeCookedPolarBearMeat){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemPolarBearMeat), new ItemStack(FoodItems.itemCookedPolarBearMeat), 0.35F);
		}
		
		if(!FoodExpansionConfig.disableDough){
			GameRegistry.addSmelting(new ItemStack(FoodItems.itemDough), new ItemStack(Items.BREAD), 0.35F);	
		}
		
		if(!FoodExpansionConfig.disableRoastedSeed){
			
			GameRegistry.addSmelting(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(FoodItems.itemRoastedSeed), 0.35F);	
			GameRegistry.addSmelting(new ItemStack(Items.MELON_SEEDS), new ItemStack(FoodItems.itemRoastedSeed), 0.35F);	
			GameRegistry.addSmelting(new ItemStack(Items.PUMPKIN_SEEDS), new ItemStack(FoodItems.itemRoastedSeed), 0.35F);
			GameRegistry.addSmelting(new ItemStack(Items.BEETROOT_SEEDS), new ItemStack(FoodItems.itemRoastedSeed), 0.35F);
		}
	}
	
	public static void addShapeless(ItemStack output, boolean disable, ItemStack... input) {
		
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		for (ItemStack stack : input)
			ingredients.add(Ingredient.fromStacks(stack));
		
		if (!disable)
			GameRegistry.addShapelessRecipe(output.getItem().getRegistryName(), null, output, ingredients.toArray(new Ingredient[ingredients.size()]));
	}
	
	public static void addShaped(ItemStack output, boolean disable, Object[] object) {
		
		if (!disable)
			GameRegistry.addShapedRecipe(output.getItem().getRegistryName(), null, output, object);
	}
}
	
	

