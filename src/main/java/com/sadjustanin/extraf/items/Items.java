package com.sadjustanin.extraf.items;

import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.equipment.armor.EmeraldArmor;
import com.sadjustanin.extraf.items.equipment.armor.RubyArmor;
import com.sadjustanin.extraf.items.food.Cherry;
import com.sadjustanin.extraf.items.equipment.rings.SimpleRing;
import com.sadjustanin.extraf.items.equipment.swords.EmeraldSword;
import com.sadjustanin.extraf.items.tools.axes.EmeraldAxe;
import com.sadjustanin.extraf.items.tools.hoes.EmeraldHoe;
import com.sadjustanin.extraf.items.tools.multi_tools.EmeraldMultiTool;
import com.sadjustanin.extraf.items.tools.pickaxes.EmeraldPickaxe;
import com.sadjustanin.extraf.items.tools.spades.EmeraldSpade;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
//    public static List<? super Item> items = new ArrayList<>();
    public static final SimpleRing SIMPLE_RING = new SimpleRing();
    public static final Cherry CHERRY = new Cherry();
    public static final EmeraldSword EMERALD_SWORD = new EmeraldSword();
    public static final EmeraldAxe EMERALD_AXE = new EmeraldAxe();
    public static final EmeraldSpade EMERALD_SPADE = new EmeraldSpade();
    public static final EmeraldPickaxe EMERALD_PICKAXE = new EmeraldPickaxe();
    public static final EmeraldHoe EMERALD_HOE = new EmeraldHoe();
    public static final EmeraldMultiTool EMERALD_MULTI_TOOL = new EmeraldMultiTool();
    public static final EmeraldArmor EMERALD_HELMET = new EmeraldArmor("helmet", 0);
    public static final EmeraldArmor EMERALD_PLATE = new EmeraldArmor("plate", 1);
    public static final EmeraldArmor EMERALD_LEGS = new EmeraldArmor("legs", 2);
    public static final EmeraldArmor EMERALD_BOOTS = new EmeraldArmor("boots", 3);
    public static final RubyArmor RUBY_HELMET = new RubyArmor("helmet", 0);
    public static final RubyArmor RUBY_PLATE = new RubyArmor("plate", 1);
    public static final RubyArmor RUBY_LEGS = new RubyArmor("legs", 2);
    public static final RubyArmor RUBY_BOOTS = new RubyArmor("boots", 3);
    public static void register() {
        GameRegistry.registerItem(EMERALD_SWORD, "EMERALD_SWORD");
        GameRegistry.registerItem(SIMPLE_RING, "SIMPLE_RING", Main.MODID);
        GameRegistry.registerItem(CHERRY, "CHERRY");
        GameRegistry.registerItem(EMERALD_AXE, "EMERALD_AXE");
        GameRegistry.registerItem(EMERALD_SPADE, "EMERALD_SPADE");
        GameRegistry.registerItem(EMERALD_PICKAXE, "EMERALD_PICKAXE");
        GameRegistry.registerItem(EMERALD_HOE, "EMERALD_HOE");
        GameRegistry.registerItem(EMERALD_MULTI_TOOL, "EMERALD_MULTI_TOOL");
        GameRegistry.registerItem(EMERALD_HELMET, "EMERALD_HELMET");
        GameRegistry.registerItem(EMERALD_PLATE, "EMERALD_PLATE");
        GameRegistry.registerItem(EMERALD_LEGS, "EMERALD_LEGS");
        GameRegistry.registerItem(EMERALD_BOOTS, "EMERALD_BOOTS");
        GameRegistry.registerItem(RUBY_HELMET, "RUBY_HELMET");
        GameRegistry.registerItem(RUBY_PLATE, "RUBY_PLATE");
        GameRegistry.registerItem(RUBY_LEGS, "RUBY_LEGS");
        GameRegistry.registerItem(RUBY_BOOTS, "RUBY_BOOTS");
    }
}
