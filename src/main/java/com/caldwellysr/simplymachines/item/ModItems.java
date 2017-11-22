package com.caldwellysr.simplymachines.item;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

  public static ItemBase hellCoal = new FuelItem("hell_coal", 3600).setCreativeTab(CreativeTabs.MISC);

    public static void register(IForgeRegistry<Item> registry) {
      registry.registerAll(
          hellCoal
          );
    }

  public static void registerModels() {
    hellCoal.registerItemModel();
  }

}
