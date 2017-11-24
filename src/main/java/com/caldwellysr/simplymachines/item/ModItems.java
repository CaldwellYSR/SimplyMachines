package com.caldwellysr.simplymachines.item;

import net.minecraft.item.Item;

import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

  public static ItemOre hellCoal = new FuelItem("hell_coal", "IngotHellCoal", 3600);

  public static void register(IForgeRegistry<Item> registry) {
    registry.registerAll(hellCoal);
  }

  public static void registerItemModels() {
    hellCoal.registerItemModel(hellCoal);
  }

}
