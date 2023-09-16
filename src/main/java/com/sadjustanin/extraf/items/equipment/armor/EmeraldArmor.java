package com.sadjustanin.extraf.items.equipment.armor;

import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ArmorMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class EmeraldArmor extends ItemArmor {
    public EmeraldArmor(String elementName, int armorType) {
        super(ArmorMaterials.MY_EMERALD_ARMOR_MATERIAL, 0, armorType);
        setUnlocalizedName("EMERALD_" + elementName.toUpperCase());
        setTextureName(Main.MODID + ":emerald_" + elementName);
        setCreativeTab(CreativeTabs.tabCombat);
    }
    /**
     * Формирует путь к текстуре брони
     *
     * @param stack  Стэк элемента брони который в данный момент надет на сущность
     * @param entity Сущность на которой надета броня
     * @param slot   Слот в котором находится броня
     * @param type   Подтип текстуры, может быть null или "overlay". Используется для наложения маски цвета для кожаной брони.
     * @return возвращает путь до текстуры брони
     */
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return String.format("%s:textures/models/armor/emerald_%d.png", Main.MODID, slot == 2 ? 2 : 1);
    }
}
