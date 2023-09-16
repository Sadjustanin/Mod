package com.sadjustanin.extraf.items.food;

import com.sadjustanin.extraf.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import javax.swing.text.html.parser.Entity;
import java.util.Random;

public class Cherry extends ItemFood {

    private static Random random = new Random();

    public Cherry() {
        super(1, 1.5F, false);
        setUnlocalizedName("CHERRY");
        setTextureName(Main.MODID + ":cherry");
        setMaxStackSize(64);
        setPotionEffect(Potion.regeneration.id, 3, 2, 0.3F);
    }

}
