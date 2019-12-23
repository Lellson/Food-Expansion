package lellson.foodexpansion;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	
	public static final List<Drop> DROP_LIST = new ArrayList<Drop>();
	
	public DropHandler() {
		
		addDrop(FoodExpansionConfig.disableSquidDrop, EntitySquid.class, FoodItems.itemSquid, FoodItems.itemCookedSquid, 2);
		addDrop(FoodExpansionConfig.disableHorseMeatDrop, EntityHorse.class, FoodItems.itemHorseMeat, FoodItems.itemCookedHorseMeat, 3);
		addDrop(FoodExpansionConfig.disableBatWingDrop, EntityBat.class, FoodItems.itemBatWing, FoodItems.itemCookedBatWing, 1);
		addDrop(FoodExpansionConfig.disableWolfMeatDrop, EntityWolf.class, FoodItems.itemWolfMeat, FoodItems.itemCookedWolfMeat, 2);
		addDrop(FoodExpansionConfig.disableOcelotMeatDrop, EntityOcelot.class, FoodItems.itemOcelotMeat, FoodItems.itemCookedOcelotMeat, 1);
		addDrop(FoodExpansionConfig.disableParrotMeatDrop, EntityParrot.class, FoodItems.itemParrotMeat, FoodItems.itemCookedParrotMeat, 1);
		addDrop(FoodExpansionConfig.disableLlamaMeatDrop, EntityLlama.class, FoodItems.itemLlamaMeat, FoodItems.itemCookedLlamaMeat, 2);
		addDrop(FoodExpansionConfig.disablePolarBearMeatDrop, EntityPolarBear.class, FoodItems.itemPolarBearMeat, FoodItems.itemCookedPolarBearMeat, 3);
	}

	private void addDrop(boolean cfgDisable, Class entityClass, Item uncooked, Item cooked, int maxDropAmount) {
		DROP_LIST.add(new Drop(cfgDisable, entityClass, uncooked, cooked, maxDropAmount));
	}

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		
		for(Drop drop : DROP_LIST) 
		{
			drop.tryDrop(event.getEntityLiving());
		}
	}
	
	public class Drop {
		
		public boolean cfgDisable;
		public Class entityClass;
		public Item uncooked, cooked;
		public int maxDropAmount;

		public Drop(boolean cfgDisable, Class entityClass, Item uncooked, Item cooked, int maxDropAmount) {
			
			this.cfgDisable = cfgDisable;
			this.entityClass = entityClass;
			this.uncooked = uncooked;
			this.cooked = cooked;
			this.maxDropAmount = maxDropAmount;
		}
		
		public void tryDrop(EntityLivingBase entity) {
			
			if (!cfgDisable && entityClass.isInstance(entity) && !entity.isChild())
			{
				entity.entityDropItem(new ItemStack(entity.isBurning() ? cooked : uncooked, entity.getEntityWorld().rand.nextInt(maxDropAmount)+1), 0.5F);
			}
		}
	}
}
