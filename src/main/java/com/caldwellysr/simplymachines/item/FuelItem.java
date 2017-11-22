package com.caldwellysr.simplymachines.item;

import net.minecraft.item.ItemStack;

public class FuelItem extends ItemBase {
	
	private int burnTime;

	public FuelItem(String name, int burnTime) {
		super(name);
		this.burnTime = burnTime;
	}
	
	@Override
    public int getItemBurnTime(ItemStack itemStack)
    {
        return this.burnTime;
    }

}
