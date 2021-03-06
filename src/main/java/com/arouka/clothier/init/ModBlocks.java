package com.arouka.clothier.init;


import com.arouka.clothier.block.*;
import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockClothier soap = new BlockSoap();
    public static final BlockClothier flubber = new BlockFlubber();
    public static final BlockClothier toughLamp = new BlockToughLamp();
    public static final BlockClothier man = new BlockMan();

    public static void init()
    {
        GameRegistry.registerBlock(soap, Names.Blocks.SOAP);
        GameRegistry.registerBlock(flubber, Names.Blocks.FLUBBER);
        GameRegistry.registerBlock(toughLamp, Names.Blocks.TOUGH_LAMP);
        GameRegistry.registerBlock(man, Names.Blocks.MAN);
    }
}
