package com.arouka.clothier.item.baubles;


import baubles.api.BaubleType;
import com.arouka.clothier.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import java.util.List;

public class ItemPanicBauble extends ItemBauble
{
    public ItemPanicBauble()
    {
        super(BaubleType.AMULET);
        this.setUnlocalizedName(Names.Items.BAUBLE_PANIC);
    }

   /*public void onPlayerDamage(LivingHurtEvent event)
    {
        if(event.entityLiving instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) event.entityLiving;
        }
        if()
        {
                EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 4, false));
        }
    }

    @SideOnly(Side.CLIENT)
    public void addInfo(ItemStack par1ItemStack, EntityPlayer player, List par3List, boolean par4)
    {
        par3List.add("\247" + "7" + "+ Speed boost on damage taken");
        par3List.add("\247" + "d" + "'Get outta' Dodge");
    }
    */
}
