package com.sadjustanin.extraf.items.tools.multi_tools;

import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ToolMaterials;
import com.sadjustanin.extraf.items.tools.axes.EmeraldAxe;
import com.sadjustanin.extraf.items.tools.pickaxes.EmeraldPickaxe;
import com.sadjustanin.extraf.items.tools.spades.EmeraldSpade;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import java.util.HashSet;
import java.util.Set;

public class EmeraldMultiTool extends ItemTool {
    public static final Set<Block> HARVEST_BLOCKS = new HashSet<>();
    private static final Item.ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("emerald", ToolMaterials.MY_EMERALD_ITEM_MATERIAL.getHarvestLevel(),
            ToolMaterials.MY_EMERALD_ITEM_MATERIAL.getMaxUses() + 1500, ToolMaterials.MY_EMERALD_ITEM_MATERIAL.getEfficiencyOnProperMaterial() * 1.2F,
            ToolMaterials.MY_EMERALD_ITEM_MATERIAL.getDamageVsEntity(), ToolMaterials.MY_EMERALD_ITEM_MATERIAL.getEnchantability() + 6);
    public EmeraldMultiTool(){
        super(9f, TOOL_MATERIAL, HARVEST_BLOCKS);
        setUnlocalizedName("EMERALD_MULTI_TOOL");
        setTextureName(Main.MODID + ":emerald_multi_tool");
        setCreativeTab(CreativeTabs.tabTools);

        final int harvestLvl = ToolMaterials.MY_EMERALD_ITEM_MATERIAL.getHarvestLevel();
        setHarvestLevel("axe", harvestLvl);
        setHarvestLevel("pickaxe", harvestLvl);
        setHarvestLevel("shovel", harvestLvl);
    }
    @Override
    public boolean onItemUse(ItemStack heldStack, EntityPlayer player, World world, int posX, int posY, int posZ, int side, float hitX, float hitY, float hitZ) {
        if (player.canPlayerEdit(posX, posY, posZ, side, heldStack)) {
            final UseHoeEvent event = new UseHoeEvent(player, heldStack, world, posX, posY, posZ);
            if (MinecraftForge.EVENT_BUS.post(event)) {
                return false;
            }

            if (event.getResult() == Event.Result.ALLOW) {
                heldStack.damageItem(1, player);
                return true;
            }

            final Block blockAtPos = world.getBlock(posX, posY, posZ);

            if (side != 0 && world.getBlock(posX, posY + 1, posZ).isAir(world, posX, posY + 1, posZ) && (blockAtPos == Blocks.grass || blockAtPos == Blocks.dirt)) {
                final Block farmland = Blocks.farmland;
                world.playSoundEffect((float) posX + 0.5F, (float) posY + 0.5F, (float) posZ + 0.5F, farmland.stepSound.getStepResourcePath(), (farmland.stepSound.getVolume() + 1.0F) / 2.0F, farmland.stepSound.getPitch() * 0.8F);

                if (!world.isRemote) {
                    world.setBlock(posX, posY, posZ, farmland);
                    heldStack.damageItem(1, player);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean func_150897_b(Block block) {
        return true;
    }

    static {
        HARVEST_BLOCKS.add(Blocks.obsidian);
        HARVEST_BLOCKS.add(Blocks.emerald_ore);
        HARVEST_BLOCKS.add(Blocks.emerald_block);

        HARVEST_BLOCKS.addAll(EmeraldAxe.HARVEST_BLOCKS);
        HARVEST_BLOCKS.addAll(EmeraldPickaxe.HARVEST_BLOCKS);
        HARVEST_BLOCKS.addAll(EmeraldSpade.HARVEST_BLOCKS);
    }
}
