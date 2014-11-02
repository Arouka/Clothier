package com.arouka.clothier.creativetab;


import com.arouka.clothier.init.ModItems;
import com.arouka.clothier.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabClothier
{

    public static final CreativeTabs CLOTHIER_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.clothSpool;
        }


    };
}
