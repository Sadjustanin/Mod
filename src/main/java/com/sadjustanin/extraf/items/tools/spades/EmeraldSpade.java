package com.sadjustanin.extraf.items.tools.spades;

import com.google.common.collect.Sets;
import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ToolMaterials;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;

import java.util.Set;

public class EmeraldSpade extends ItemSpade {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});

    public EmeraldSpade(){
        super(ToolMaterials.MY_EMERALD_ITEM_MATERIAL);
        setUnlocalizedName("EMERALD_SPADE");
        setTextureName(Main.MODID + ":emerald_spade");
        setCreativeTab(CreativeTabs.tabTools);
    }
}
