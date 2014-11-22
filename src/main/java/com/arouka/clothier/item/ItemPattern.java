package com.arouka.clothier.item;

import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;


public class ItemPattern extends ItemClothier
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;


    public ItemPattern()
    {
        super();
        this.setMaxStackSize(1);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Names.Items.PATTERN);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", Names.Items.PATTERN);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s.%s", Reference.MOD_ID.toLowerCase() + ":", Names.Items.PATTERN, Names.Items.PATTERN_SUBTYPES[MathHelper.clamp_int(itemStack.getItemDamage(), 0, Names.Items.PATTERN_SUBTYPES.length - 1)]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTab, List list)
    {
        for (int meta = 0; meta < Names.Items.PATTERN_SUBTYPES.length; ++meta)
        {
            list.add(new ItemStack(this, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta)
    {
        return icons[MathHelper.clamp_int(meta, 0, Names.Items.PATTERN_SUBTYPES.length - 1)];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        icons = new IIcon[Names.Items.PATTERN_SUBTYPES.length];

        for (int i = 0; i < Names.Items.PATTERN_SUBTYPES.length; i++)
        {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + Names.Items.PATTERN + "." + Names.Items.PATTERN_SUBTYPES[i]);
        }
    }
}
