package com.sadjustanin.extraf.items.materials;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial.EMERALD;

public class ToolMaterials {
    public static final Item.ToolMaterial MY_EMERALD_ITEM_MATERIAL = EnumHelper.addToolMaterial("extraf:emerald",
            EMERALD.getHarvestLevel() + 1, EMERALD.getMaxUses() * 2, EMERALD.getEfficiencyOnProperMaterial() + 6,
            EMERALD.getDamageVsEntity() + 1, EMERALD.getEnchantability() + 14
    );
}
