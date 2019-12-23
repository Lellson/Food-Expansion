package lellson.foodexpansion.crafting;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import lellson.foodexpansion.FoodExpansionConfig;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class FactoryCarrotPie implements IConditionFactory {
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) {
		return (() -> !FoodExpansionConfig.disableRecipeCarrotPie);
	}
}