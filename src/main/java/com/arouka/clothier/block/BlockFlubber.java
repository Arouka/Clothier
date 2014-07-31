package com.arouka.clothier.block;


import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockFlubber extends BlockClothier {

    public BlockFlubber() {

        super();
        this.setBlockName("flubber");
        this.setBlockTextureName("");
        this.setStepSound(soundTypeSnow);
        this.setHardness(0.8F);
        this.opaque = false;
    }

    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {

        entity.motionY += 2.25;
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
