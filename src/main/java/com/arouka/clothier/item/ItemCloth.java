package com.arouka.clothier.item;


import com.arouka.clothier.reference.Names;

public class ItemCloth extends ItemClothier
{
    public ItemCloth()
    {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName(Names.Items.CLOTH);
    }
}
