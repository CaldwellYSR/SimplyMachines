package com.caldwellysr.simplymachines.block;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockCustomDrop extends BlockOre {
  
  protected Item dropItem;
  protected int maxDrop;

  public BlockCustomDrop(String name, String oreName, Item dropItem, int maxDrop) {
    super(name, oreName);
    this.dropItem = dropItem;
    this.maxDrop = maxDrop;
    this.expDrop = (int) Math.floor(maxDrop * 0.5f);
  }
  
  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return this.dropItem;
  }
  
  public int quantityDropped(Random random) {
    return 1 + random.nextInt(this.maxDrop);
  }

}
