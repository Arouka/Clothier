package com.arouka.clothier.proxy;

import com.arouka.clothier.client.renderer.RendererMan;
import com.arouka.clothier.client.renderer.item.ItemRendererMan;
import com.arouka.clothier.init.ModBlocks;
import com.arouka.clothier.reference.RenderIds;
import com.arouka.clothier.tileentity.TileEntityMan;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import java.util.HashMap;
import java.util.Map;

public class ClientProxy extends CommonProxy
{
    public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

    @Override
    public ClientProxy getClientProxy()
    {
        return this;
    }

    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

    //@Override
    public void initRenderingAndTextures()
    {
        RenderIds.man = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.woman = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.smashBox = RenderingRegistry.getNextAvailableRenderId();

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.man), new ItemRendererMan());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMan.class, new RendererMan());
    }

}