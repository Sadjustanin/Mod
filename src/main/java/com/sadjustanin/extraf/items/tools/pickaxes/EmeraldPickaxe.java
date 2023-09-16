package com.sadjustanin.extraf.items.tools.pickaxes;

import com.google.common.collect.Sets;
import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ToolMaterials;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;

import java.util.Set;

public class EmeraldPickaxe extends ItemPickaxe {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab,
            Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block,
            Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block,
            Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail}
    );

    public EmeraldPickaxe(){
        super(ToolMaterials.MY_EMERALD_ITEM_MATERIAL);
        setUnlocalizedName("EMERALD_PICKAXE");
        setTextureName(Main.MODID + ":emerald_pickaxe");
        setCreativeTab(CreativeTabs.tabTools);
    }
}
