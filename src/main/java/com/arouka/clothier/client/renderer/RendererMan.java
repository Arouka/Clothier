package com.arouka.clothier.client.renderer;


import com.arouka.clothier.client.model.ModelMan;
import com.arouka.clothier.tileentity.TileEntityMan;
import com.arouka.clothier.utility.ResourceLocationHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

public class RendererMan extends TileEntitySpecialRenderer
{
    private final ModelMan modelMan = new ModelMan();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float renderTick)
    {
        if (tileEntity instanceof TileEntityMan)
        {
            TileEntityMan tileEntityModelMan = (TileEntityMan) tileEntity;
            ForgeDirection direction = tileEntityModelMan.getOrientation();

            GL11.glPushMatrix();
            //scaleTranslateRotate(x, y, z, direction);
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glRotatef(180, 0F, 0F, 1F);
            this.bindTexture(ResourceLocationHelper.getResourceLocation("textures/models/man.png"));
            GL11.glPushMatrix();
            modelMan.render(0.0625F);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
        }
    }

    private void scaleTranslateRotate(double x, double y, double z, ForgeDirection orientation)
    {
        if (orientation == ForgeDirection.NORTH)
        {
            GL11.glTranslated(x + 0.4d, y + 0.42d, z + 0.5d);
            GL11.glScalef(0.25F, 0.27F, 0.25F);
            GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);
        }
        else if (orientation == ForgeDirection.EAST)
        {
            GL11.glTranslated(x + 0.5d, y + 0.42d, z + 0.4d);
            GL11.glScalef(0.25F, 0.27F, 0.25F);
            GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);
        }
        else if (orientation == ForgeDirection.SOUTH)
        {
            GL11.glTranslated(x + 0.6d, y + 0.42d, z + 0.5d);
            GL11.glScalef(0.25F, 0.27F, 0.25F);
            GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
        }
        else if (orientation == ForgeDirection.WEST)
        {
            GL11.glTranslated(x + 0.5d, y + 0.42d, z + 0.6d);
            GL11.glScalef(0.25F, 0.27F, 0.25F);
            GL11.glRotatef(-90, 0.0F, 1.0F, 0.0F);
        }
    }
}
