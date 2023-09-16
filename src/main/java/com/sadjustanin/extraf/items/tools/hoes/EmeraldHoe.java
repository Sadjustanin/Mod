package com.sadjustanin.extraf.items.tools.hoes;

import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe {
    public EmeraldHoe(){
        super(ToolMaterials.MY_EMERALD_ITEM_MATERIAL);
        setUnlocalizedName("EMERALD_HOE");
        setTextureName(Main.MODID + ":emerald_hoe");
        setCreativeTab(CreativeTabs.tabTools);
    }
}
