package com.flynamic.svtfoe.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

class ModRenderer {
    static void registerItemRender(String namespace, Item item) {
        // TODO: register all other variants, to be specified by the items class
        // ...
        ModelResourceLocation resourceLocation = new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, resourceLocation);
    }
}
