package com.flynamic.svtfoe.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMagicWand extends Item {
    public ItemMagicWand() {
        setRegistryName("magic_wand");
        setUnlocalizedName("magic_wand");
        setCreativeTab(CreativeTabs.TOOLS);
        setMaxStackSize(1);
    }
}
