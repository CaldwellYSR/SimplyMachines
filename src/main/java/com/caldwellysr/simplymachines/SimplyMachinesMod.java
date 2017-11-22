package com.caldwellysr.simplymachines;

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

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {

  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {

  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {

  }

  @Mod.EventBusSubscriber
  public static class RegistrationHandler {

	  @SubscribeEvent
	  public static void registerItems(RegistryEvent.Register<Item> event) {
		 ModItems.register(event.getRegistry());
	  }

	  @SubscribeEvent
	  public static void registerItems(ModelRegistryEvent event) {
		 ModItems.registerModels();
	  }

  }

}
