package com.sadjustanin.extraf.items.equipment.swords;

import com.sadjustanin.extraf.Main;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class EmeraldSword extends ItemSword {
    public EmeraldSword(){
        super(EnumHelper.addToolMaterial("extraf:emerald", 3, 1561,
                14, 6, 24));
        setUnlocalizedName("EMERALD_SWORD");
        setTextureName(Main.MODID + ":emerald_sword");
//        setMaxStackSize(1);
    }
}
