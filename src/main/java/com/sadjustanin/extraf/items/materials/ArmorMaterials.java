package com.sadjustanin.extraf.items.materials;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials {
    public static final ItemArmor.ArmorMaterial MY_EMERALD_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("extraf:emerald", 40, new int[]{6,10,8,4},  30);
    public static final ItemArmor.ArmorMaterial MY_EMERALD_ENHANCED_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("extraf:enhanced_emerald", 50, new int[]{7,11,9,5},  35);
    public static final ItemArmor.ArmorMaterial MY_RUBY_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("extraf:ruby", 55, new int[]{7,11,9,5}, 35);
}
