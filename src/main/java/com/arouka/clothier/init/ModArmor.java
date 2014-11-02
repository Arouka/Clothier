package com.arouka.clothier.init;

import com.arouka.clothier.armor.ArmorAgate;
import com.arouka.clothier.armor.ArmorClothier;
import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.Reference;
import com.arouka.clothier.utility.ArmorType;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModArmor
{
    public static final ArmorClothier agateHelmet = new ArmorAgate(ArmorType.HELMET);
    public static final ArmorClothier agateChestplate = new ArmorAgate(ArmorType.CHEST);
    public static final ArmorClothier agateLeggings = new ArmorAgate(ArmorType.LEGS);
    public static final ArmorClothier agateBoots = new ArmorAgate(ArmorType.BOOTS);

    public static void init()
    {
        GameRegistry.registerItem(agateHelmet, "item." + Names.Armor.AGATE_HELMET);
        GameRegistry.registerItem(agateChestplate, "item." + Names.Armor.AGATE_CHESTPLATE);
        GameRegistry.registerItem(agateLeggings, "item." + Names.Armor.AGATE_LEGGINGS);
        GameRegistry.registerItem(agateBoots, "item." + Names.Armor.AGATE_BOOTS);
    }
}