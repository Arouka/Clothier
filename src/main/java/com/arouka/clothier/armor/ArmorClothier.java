package com.arouka.clothier.armor;

import com.arouka.clothier.creativetab.CreativeTabClothier;
import com.arouka.clothier.proxy.ClientProxy;
import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.Reference;
import com.arouka.clothier.utility.ArmorType;
import com.arouka.clothier.utility.NameHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

public abstract class ArmorClothier extends ItemArmor implements ISpecialArmor
{
    protected static ArmorMaterial ArmorMaterialAgate = EnumHelper.addArmorMaterial(Names.Armor.AGATE_ARMOR, 7, new int[]{2, 6, 3, 1}, 25);
    protected static ArmorMaterial ArmorMaterialGoldArmor = EnumHelper.addArmorMaterial(Names.Armor.GOLDARMOR_ARMOR, 28, new int[]{2, 6, 4, 2}, 20);

    public ArmorClothier(String armorName, ArmorMaterial armorMaterial, ArmorType armorType)
    {
        super(armorMaterial, 1, armorType.ordinal());
        this.setCreativeTab(CreativeTabClothier.CLOTHIER_TAB);
        this.setUnlocalizedName(armorName);
        this.setTextureName(String.format("%s%s_%s", Reference.MOD_ID.toLowerCase() + ":", armorName, getArmorTypeName(this.armorType)));
    }


    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s_%s", Reference.MOD_ID.toLowerCase() + ":", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this.armorType));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s_%s", Reference.MOD_ID.toLowerCase() + ":", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(itemStack)), getArmorTypeName(itemStack.getItem()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        super.registerIcons(iconRegister);
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        return this.getArmorMaterial().getDamageReductionAmount(slot);
    }


    protected String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {
            ItemArmor itemArmor = (ItemArmor) item;
            return getArmorTypeName(itemArmor.armorType);
        }

        return "";
    }

    protected String getArmorTypeName(int slot)
    {
        if (slot == 0)
        {
            return "helm";
        }
        else if (slot == 1)
        {
            return "chest";
        }
        else if (slot == 2)
        {
            return "legs";
        }
        else
        {
            return "boots";
        }
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack stack, int armorSlot)
    {
        return ClientProxy.armorModels.get(this);
    }*/
}