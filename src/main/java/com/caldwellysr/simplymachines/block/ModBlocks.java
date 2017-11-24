package com.caldwellysr.simplymachines.block;

import com.caldwellysr.simplymachines.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
  
  public static BlockOre oreHellCoal = new BlockCustomDrop("ore_hell_coal", "OreHellCoal", ModItems.hellCoal, 6);

	public static void register(IForgeRegistry<Block> registry) {
	  registry.registerAll(oreHellCoal);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
	}

	public static void registerItemModels() {
	}

}
