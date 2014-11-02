package com.arouka.clothier.block;


import com.arouka.clothier.reference.Names;

public class BlockToughLamp extends BlockClothier
{

    public BlockToughLamp()
    {
        super();
        this.setBlockName(Names.Blocks.TOUGH_LAMP);
        this.setBlockTextureName("");
        this.setStepSound(soundTypeGlass);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setLightLevel(1.0F);
    }
}
