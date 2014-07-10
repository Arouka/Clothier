package com.arouka.clothier;

import com.arouka.clothier.proxy.IProxy;
import com.arouka.clothier.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID , name= Reference.MOD_NAME, version = Reference.VERSION)
public class Clothier {

    @Mod.Instance("Clothier")
    public static Clothier instance;

    @SidedProxy(clientSide = "com.arouka.clothier.proxy.ClientProxy", serverSide = "com.arouka.clothier.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
