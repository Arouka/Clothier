package com.arouka.clothier.init;


import com.arouka.clothier.reference.Names;
import com.arouka.clothier.tileentity.TileEntityMan;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityMan.class, Names.Blocks.MAN);
    }
}
