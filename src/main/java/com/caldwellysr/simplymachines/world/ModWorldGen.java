package com.caldwellysr.simplymachines.world;

import java.util.Random;

import com.caldwellysr.simplymachines.block.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;

public class ModWorldGen implements IWorldGenerator {

  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    if (world.provider.getDimension() == -1) { // The Nether
      generateOre(ModBlocks.oreHellCoal.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 10 + random.nextInt(6), 200);
    }
  }
  
  private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
    int deltaY = maxY - minY;
    WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.NETHERRACK));
    BlockPos pos;

    for (int i = 0; i < chances; i++) {
      pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
  
      System.out.println(pos);
      generator.generate(world, random, pos);
    }
  }

}
