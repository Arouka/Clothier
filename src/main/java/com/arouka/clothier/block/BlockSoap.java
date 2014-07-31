package com.arouka.clothier.block;



public class BlockSoap extends BlockClothier {

    public BlockSoap() {

        super();
        this.setBlockName("soap");
        this.setBlockTextureName("");
        this.setStepSound(soundTypeSnow);
        this.setHardness(0.8F);
        this.slipperiness = 1.2F;
        this.opaque = false;
    }

    @Override
    public boolean isOpaqueCube() {

        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {

        return false;
    }

    @Override
    public int getRenderBlockPass() {

        return 1;
    }
}