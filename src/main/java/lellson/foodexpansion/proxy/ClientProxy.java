package lellson.foodexpansion.proxy;

import lellson.foodexpansion.FoodItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		FoodItems.renderRegistry();
	}

}
