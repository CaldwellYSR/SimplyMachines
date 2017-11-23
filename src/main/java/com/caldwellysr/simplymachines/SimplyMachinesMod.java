package com.caldwellysr.simplymachines;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.caldwellysr.simplymachines.proxy.CommonProxy;
import com.caldwellysr.simplymachines.block.ModBlocks;
import com.caldwellysr.simplymachines.client.SimplyMachinesTab;
import com.caldwellysr.simplymachines.item.ModItems;

@Mod(modid = SimplyMachinesMod.modId, name = SimplyMachinesMod.name, version = SimplyMachinesMod.version)
public class SimplyMachinesMod {

  public static final String modId = "simply-machines";
  public static final String name = "Simply Machines";
  public static final String version = "0.0.1";

  @Mod.Instance(modId)
  public static SimplyMachinesMod instance;

  @SidedProxy(serverSide = "com.caldwellysr.simplymachines.proxy.CommonProxy", clientSide = "com.caldwellysr.simplymachines.proxy.ClientProxy")
  public static CommonProxy proxy;
  
  public static SimplyMachinesTab creativeTab = new SimplyMachinesTab();

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {

  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
    ModItems.hellCoal.initOreDict();
    ModBlocks.oreHellCoal.initOreDict();
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {

  }

  @Mod.EventBusSubscriber
  public static class RegistrationHandler {
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
      ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
      ModItems.register(event.getRegistry());
      ModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
      ModItems.registerItemModels();
      ModBlocks.registerItemModels();
    }

  }

}
