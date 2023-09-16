package com.sadjustanin.extraf.items.equipment.rings;

import com.sadjustanin.extraf.Main;
import net.minecraft.item.Item;

public class SimpleRing extends Item {
    public SimpleRing() {
        setUnlocalizedName("SIMPLE_RING");
        setTextureName(Main.MODID + ":simple_ring");
        setMaxStackSize(1);
    }
}
