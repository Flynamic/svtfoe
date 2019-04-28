package com.flynamic.svtfoe.client;

import com.flynamic.svtfoe.IProxy;
import com.flynamic.svtfoe.common.ModItems;
import net.minecraft.item.Item;

public class ClientProxy implements IProxy {
    @Override
    public void registerBlockRenderers() {

    }

    @Override
    public void registerItemRenderers() {
        registerItemRenderer(ModItems.MagicWand);
    }

    private void registerItemRenderer(Item item) {
        ModRenderer.registerItemRender("svtfoe", item);
    }
}
