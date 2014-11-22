package com.arouka.clothier.init;


import com.arouka.clothier.item.*;
import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemClothier clothSpool = new ItemSpool();
    public static final ItemClothier clothRoll = new ItemCloth();
    public static final ItemClothier clubClub = new ItemClub();
    public static final ItemClothier soapBar = new ItemSoap();
    public static final ItemClothier pattern = new ItemPattern();

    public static void init()
    {
        GameRegistry.registerItem(clothSpool, Names.Items.SPOOL);
        GameRegistry.registerItem(clothRoll, Names.Items.CLOTH);
        GameRegistry.registerItem(clubClub, Names.Items.CLUB);
        GameRegistry.registerItem(soapBar, Names.Items.SOAPBAR);
        GameRegistry.registerItem(pattern, Names.Items.PATTERN);
    }
}
