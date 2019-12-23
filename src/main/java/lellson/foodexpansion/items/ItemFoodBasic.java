package lellson.foodexpansion.items;

import lellson.foodexpansion.FoodExpansion;
import lellson.foodexpansion.FoodItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemFoodBasic extends ItemFood {
	
	private PotionEffect[] effects;
	private int probability;
	private ItemStack returnItem;
	private int maxUseDuration;
	
	public ItemFoodBasic(String name, int foodAmount, float saturation, boolean wolfFav, PotionEffect[] effects, int probability, ItemStack returnItem, int useDuration) {
		super(foodAmount, saturation, wolfFav);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		
		if (effects.length != 0 && !name.equals("ItemBatWing") && !name.equals("ItemCookedBatWing"))
			this.setAlwaysEdible();
		
		if (returnItem != null)
			this.setMaxStackSize(1);
		
		this.effects = effects;
		this.probability = probability;
		this.returnItem = returnItem;
		this.maxUseDuration = useDuration;
		this.setCreativeTab(FoodExpansion.tabFoodExpansion);
		
		FoodItems.ITEM_LIST.add(this);
	}

	public ItemFoodBasic(String name, int foodAmount, float saturation, boolean wolfFav, PotionEffect[] effects, ItemStack returnItem, int useDuration) {
		this(name, foodAmount, saturation, wolfFav, effects, 1, returnItem, useDuration);
	}
	
	public ItemFoodBasic(String name, int foodAmount, float saturation, boolean wolfFav, int useDuration) {
		this(name, foodAmount, saturation, wolfFav, new PotionEffect[]{}, null, useDuration);
	}
	
	public ItemFoodBasic(String name, int foodAmount, float saturation, boolean wolfFav, ItemStack returnItem) {
		this(name, foodAmount, saturation, wolfFav, new PotionEffect[]{}, returnItem, 32);
	}
	
	public ItemFoodBasic(String name, int foodAmount, float saturation, boolean wolfFav) {
		this(name, foodAmount, saturation, wolfFav, 32);
	}
	
	public ItemFoodBasic(String name, int foodAmount, float saturation) {
		this(name, foodAmount, saturation, false);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity) {
		
		if (entity instanceof EntityPlayer) 
		{
			EntityPlayer player = (EntityPlayer) entity;
	        
	        world.playSound(player, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
	        player.getFoodStats().addStats(this, stack);
	        this.onFoodEaten(stack, world, player);
	        player.addStat(StatList.getObjectUseStats(this));
	        
	        if (player instanceof EntityPlayerMP)
	            CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)player, stack);
		}
        
        for (PotionEffect effect : effects) 
        {
        	if (world.rand.nextInt(probability) == 0) 
        	{
        		entity.addPotionEffect(new PotionEffect(effect));
        	}
        }

        stack.shrink(1);
        return returnItem != null ? returnItem : stack;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {

		return maxUseDuration;
	}
}
