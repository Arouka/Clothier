package com.arouka.clothier.init;


import com.arouka.clothier.block.BlockClothier;
import com.arouka.clothier.block.BlockFlubber;
import com.arouka.clothier.block.BlockSoap;
import com.arouka.clothier.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockClothier soap = new BlockSoap();
    public static final BlockClothier flubber = new BlockFlubber();

    public static void init() {

        GameRegistry.registerBlock(soap, "soap");
        GameRegistry.registerBlock(flubber, "flubber");

    }
}
