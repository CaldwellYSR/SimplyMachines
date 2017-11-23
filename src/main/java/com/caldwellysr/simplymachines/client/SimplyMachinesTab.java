package com.caldwellysr.simplymachines.client;

import com.caldwellysr.simplymachines.SimplyMachinesMod;
import com.caldwellysr.simplymachines.block.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SimplyMachinesTab extends CreativeTabs {
  
  public SimplyMachinesTab() {
    super(SimplyMachinesMod.modId);
  }

  @Override
  public ItemStack getTabIconItem() {
    return new ItemStack(ModBlocks.oreHellCoal);
  }
  
  @Override
  public boolean hasSearchBar() {
    return true;
  }

}
