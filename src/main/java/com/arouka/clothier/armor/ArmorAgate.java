package com.arouka.clothier.armor;

import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.Reference;
import com.arouka.clothier.utility.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

import java.util.List;

public class ArmorAgate extends ArmorClothier
{
    public ArmorAgate(ArmorType armorType)
    {
        super(Names.Armor.AGATE_ARMOR, ArmorMaterialAgate, armorType);
    }

    //Removed until I figure out how ISpecialArmor works
    /*
    @Override
    public ISpecialArmor.ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        return null;
    }


    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
    {
        stack.damageItem(damage * 2, entity);
    }
    */

    @Override
    public String getArmorTexture(ItemStack armorStack, Entity entity, int armorSlot, String type)
    {
        if(armorStack.getItem() instanceof ArmorClothier)
        {
            if(armorSlot == ArmorType.HELMET.ordinal() || armorSlot == ArmorType.CHEST.ordinal() || armorSlot == ArmorType.BOOTS.ordinal())
            {
                return Reference.MOD_ID.toLowerCase() + ":" + "textures/models/armor/agatearmor_layer1.png";
            }
            else if (armorSlot == ArmorType.LEGS.ordinal())
            {
                return Reference.MOD_ID.toLowerCase() + ":" + "textures/models/armor/agatearmor_layer2.png";
            }
        }
        return null;
    }
}