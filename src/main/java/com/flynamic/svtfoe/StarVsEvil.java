package com.flynamic.svtfoe;

import com.flynamic.svtfoe.common.ModItems;
import com.flynamic.svtfoe.common.item.ItemMagicWand;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = "svtfoe", useMetadata = true)
@Mod.EventBusSubscriber()
public class StarVsEvil {
    private static Logger logger;

    @SidedProxy(clientSide = "com.flynamic.svtfoe.client.ClientProxy", serverSide = "com.flynamic.svtfoe.common.CommonProxy")
    public static IProxy proxy;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.MagicWand);
    }

    @SubscribeEvent
    public static void registerRenderers(ModelRegistryEvent event) {
        proxy.registerBlockRenderers();
        proxy.registerItemRenderers();
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
