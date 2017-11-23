package com.caldwellysr.simplymachines.item;

import java.util.List;

import com.caldwellysr.simplymachines.util.EnumColor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FuelItem extends ItemOre {
	
	private int burnTime;

	public FuelItem(String name, String oreName, int burnTime) {
		super(name, oreName);
		this.burnTime = burnTime;
	}

	@Override
  public int getItemBurnTime(ItemStack itemStack)
  {
      return this.burnTime;
  }

  @Override
  public FuelItem setCreativeTab(CreativeTabs tab) {
    super.setCreativeTab(tab);
    return this;
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> tooltip, boolean par4)
  {
    tooltip.add(EnumColor.DARK_BLUE + "Burn Time: " + EnumColor.GREY + this.burnTime);
  }
}
