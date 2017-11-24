package com.caldwellysr.simplymachines.block;

import com.caldwellysr.simplymachines.SimplyMachinesMod;
import com.caldwellysr.simplymachines.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements ItemModelProvider {
	
	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
    setCreativeTab(SimplyMachinesMod.creativeTab);
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		SimplyMachinesMod.proxy.registerItemRenderer(itemBlock, 0, this.name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}

}
