package com.arouka.clothier.item.baubles;


import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import com.arouka.clothier.item.ItemClothier;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBauble extends ItemClothier implements IBauble
{
    private static BaubleType type;
    public ItemBauble(BaubleType type)
    {
        super();
        setMaxStackSize(1);
        this.type = type;
    }

    public BaubleType getBaubleType(ItemStack itemstack)
    {
        return this.type;
    }


    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(par3EntityPlayer);
            for (int i = 0; i < baubles.getSizeInventory(); i++)
                if (baubles.getStackInSlot(i) == null && baubles.isItemValidForSlot(i, par1ItemStack))
                {
                    baubles.setInventorySlotContents(i, par1ItemStack.copy());
                    if (!par3EntityPlayer.capabilities.isCreativeMode)
                    {
                        par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.currentItem, null);
                    }
                    onEquipped(par1ItemStack, par3EntityPlayer);
                    break;
                }
        }
        return par1ItemStack;
    }

    public void onWornTick(ItemStack itemstack, EntityLivingBase player)
    {

    }

    public void onEquipped(ItemStack itemstack, EntityLivingBase player)
    {

    }

    public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
    {

    }

    public boolean canEquip(ItemStack itemstack, EntityLivingBase player)
    {
       return true;
    }

    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player)
    {
        return true;
    }
}
