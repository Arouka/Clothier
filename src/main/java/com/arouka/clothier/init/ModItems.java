package com.arouka.clothier.init;


import com.arouka.clothier.item.ItemCloth;
import com.arouka.clothier.item.ItemClothier;
import com.arouka.clothier.item.ItemSpool;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemClothier clothSpool = new ItemSpool();
    public static final ItemClothier clothRoll = new ItemCloth();

    public static void init() {

        GameRegistry.registerItem(clothSpool, "clothSpool");
        GameRegistry.registerItem(clothRoll, "clothRoll");
    }
}
