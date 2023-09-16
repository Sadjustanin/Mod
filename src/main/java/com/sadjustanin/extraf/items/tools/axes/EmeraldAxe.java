package com.sadjustanin.extraf.items.tools.axes;

import com.google.common.collect.Sets;
import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ToolMaterials;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class EmeraldAxe extends ItemTool {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(
            Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin
    );

    public EmeraldAxe(){
        super(3, ToolMaterials.MY_EMERALD_ITEM_MATERIAL, HARVEST_BLOCKS);
        setUnlocalizedName("EMERALD_AXE");
        setTextureName(Main.MODID + ":emerald_axe");
        setCreativeTab(CreativeTabs.tabTools);
//        Items.items.add(this);
    }
    @Override
    public float func_150893_a(ItemStack toolStack, Block block) {
        if (block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine)
            return super.func_150893_a(toolStack, block);
        return efficiencyOnProperMaterial;
    }
}