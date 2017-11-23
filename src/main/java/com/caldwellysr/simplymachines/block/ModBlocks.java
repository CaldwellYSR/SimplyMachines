package com.caldwellysr.simplymachines.block;

import com.caldwellysr.simplymachines.SimplyMachinesMod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
  
  public static BlockOre oreHellCoal = new BlockOre("ore_hell_coal", "OreHellCoal");

	public static void register(IForgeRegistry<Block> registry) {
	  registry.registerAll(oreHellCoal);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
	  registry.registerAll(
      oreHellCoal.createItemBlock()
	  );
	}

	public static void registerItemModels() {
	  oreHellCoal.registerItemModel(Item.getItemFromBlock(oreHellCoal));
	}

}
