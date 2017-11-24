package com.caldwellysr.simplymachines.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase {
  
  private String oreName;
  protected int expDrop = 1;

	public BlockOre(String name, String oreName) {
		super(Material.ROCK, name);
		
		this.oreName = oreName;
		
		setHardness(3f);
		setResistance(5f);
	}

  public void initOreDict() {
    OreDictionary.registerOre(oreName, this);
  }

	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
	  return this.expDrop;
	}

}
