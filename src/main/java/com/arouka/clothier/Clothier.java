package com.arouka.clothier;

import com.arouka.clothier.handler.ConfigurationHandler;
import com.arouka.clothier.init.*;
import com.arouka.clothier.proxy.IProxy;
import com.arouka.clothier.reference.Reference;
import com.arouka.clothier.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID , name= Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Clothier
{
    @Mod.Instance("Clothier")
    public static Clothier instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        ModArmor.init();

        LogHelper.info("Materials Gathered!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        TileEntities.init();

        proxy.initRenderingAndTextures();

        Recipes.init();

        LogHelper.info("Machines Ready!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Outfit Complete!");
    }
}
