package lellson.foodexpansion;

import lellson.foodexpansion.crafting.FoodRecipes;
import lellson.foodexpansion.items.ItemEventHandler;
import lellson.foodexpansion.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)

public class FoodExpansion {
	
	@SidedProxy(clientSide = Reference.ClIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static Configuration config;
	
	@Mod.Instance(Reference.MODID)
	public static FoodExpansion instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		FoodExpansionConfig.syncConfig();
		
		FoodItems.init();
		MinecraftForge.EVENT_BUS.register(new FoodRegistry());
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.getModID().equals(Reference.MODID)){
			FoodExpansionConfig.syncConfig();
		}
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		FoodRecipes.initShapedRecipes();
		FoodRecipes.initShapelessRecipes();	
		FoodRecipes.initSmeltingRecipes();	
		FMLCommonHandler.instance().bus().register(instance);
		
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		MinecraftForge.EVENT_BUS.register(new ItemEventHandler());
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FoodItems.increaseStackSizes();
	}
		
	public static CreativeTabs tabFoodExpansion = new CreativeTabs("tabFoodExpansion") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(FoodItems.itemChocolateBar);
		}
	};
}
