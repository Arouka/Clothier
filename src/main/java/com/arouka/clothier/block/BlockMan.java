package com.arouka.clothier.block;


import com.arouka.clothier.reference.Names;
import com.arouka.clothier.reference.RenderIds;
import com.arouka.clothier.tileentity.TileEntityMan;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMan extends BlockClothier implements ITileEntityProvider
{
    public BlockMan()
    {
        super(Material.wood);
        this.setHardness(2.0f);
        this.setBlockName(Names.Blocks.MAN);
    }

    public int getRenderType()
    {
        return RenderIds.man;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metaData)
    {
        return new TileEntityMan();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

}
