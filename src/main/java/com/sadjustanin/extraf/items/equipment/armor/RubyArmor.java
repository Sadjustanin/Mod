package com.sadjustanin.extraf.items.equipment.armor;

import com.sadjustanin.extraf.Main;
import com.sadjustanin.extraf.items.Items;
import com.sadjustanin.extraf.items.materials.ArmorMaterials;
import com.sadjustanin.extraf.items.materials.ToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class RubyArmor extends ItemArmor implements ISpecialArmor {
    public RubyArmor(String elementName, int armorType) {
        super(ArmorMaterials.MY_RUBY_ARMOR_MATERIAL, 0, armorType);
        setUnlocalizedName("RUBY_" + elementName.toUpperCase());
        setTextureName(Main.MODID + ":ruby_" + elementName);
        setCreativeTab(CreativeTabs.tabCombat);
    }
    /**
     * Извлекает модификаторы, которые будут использоваться при расчете урона по броне.
     * <p>
     * Броня с более высоким приоритетом будет получать урон, наносимый ей перед броней с более низким приоритетом.
     * Если есть несколько единиц брони с одинаковым приоритетом,
     * урон будет распределен между ними на основе коэффициента поглощения.
     *
     * @param player Сущность на которой надета броня.
     * @param armor  Стэк элемента брони который в данный момент надет на сущность.
     * @param source Источник урона, который может быть использован для изменения свойств брони в зависимости от типа или наносящего урон(сущность или игрок).
     * @param damage Общий урон, применяемый к сущности
     * @param slot   Слот в котором находится броня.
     * @return Экземпляр ArmorProperties, содержащий информацию о том, как броне наносится урон.
     */
    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
        if (slot == 1) {
            // Вернём для нагрудника свойство к двукратному поглощению
            return new ArmorProperties(1, 2.0, 1_000);
        }
        // Вернёт стандартные значения свойства брони
        return new ArmorProperties(0, damageReduceAmount / 25D, armor.getMaxDamage() + 1 - armor.getItemDamage());
    }

    /**
     * Получает отображаемое кол-во брони.
     *
     * @param player Сущность на которой надета броня.
     * @param armor  Стэк элемента брони который в данный момент надет на сущность.
     * @param slot   Слот в котором находится броня.
     * @return Количество очков брони для отображения, 2 на щит.
     */
    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        if (slot == 1) {
            return 6;// Отобразим 3 щита для слота нагрудника
        }
        return damageReduceAmount;// Кол-во брони будет отображаться в зависимости от коэффициента поглощения
    }

    /**
     * Наносит урон стэку брони. Метод отвечает за уменьшение долговечности предмета и размера стэка.
     * Если стэк исчерпан, он будет удалён автоматически из инвентаря.
     *
     * @param entity Сущность на которой надета броня.
     * @param stack  Стэк элемента брони который в данный момент надет на сущность.
     * @param source Источник урона, который может быть использован для изменения свойств брони в зависимости от типа или наносящего урон(сущность или игрок).
     * @param damage Общий урон, применяемый к броне
     * @param slot   Слот в котором находится броня.
     */
    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
//        // Если урон исходит от кактуса, то мы не будем ломать стэк нашей брони
//        if (source == DamageSource.cactus) {
//            return;
//        }
//        stack.damageItem(damage, entity);// Урон стэку будет нанесён как для обычной брони
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        return String.format("%s:textures/models/armor/ruby_%d.png", Main.MODID, slot == 2 ? 2 : 1);
    }
}
