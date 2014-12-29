package com.arouka.clothier.client.renderer.item;


import com.arouka.clothier.client.model.ModelMan;
import com.arouka.clothier.utility.ResourceLocationHelper;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRendererMan implements IItemRenderer
{
    private final ModelMan modelMan;

    public ItemRendererMan()
    {
        modelMan = new ModelMan();
    }

    @Override
    public boolean handleRenderType(ItemStack itemStack, ItemRenderType itemRenderType)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType itemRenderType, ItemStack itemStack, ItemRendererHelper itemRendererHelper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack, Object... data)
    {
        switch(itemRenderType)
        {
            case ENTITY:
            {
                renderMan(0.0F, 0.0F, 0.0F);
                return;
            }
            case EQUIPPED:
            {
                renderMan(0F, 0F, 0F);
                return;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                renderMan(0F, 0F, 0F);
                return;
            }
            case INVENTORY:
            {
                renderMan(-1.3F, -1.3F, -1.3F);
                return;
            }
            default:
        }
    }

    private void renderMan(float x, float y, float z)
    {
        GL11.glPushMatrix();

        GL11.glScalef(0.7F, 0.7F, 0.7F);
        GL11.glTranslatef(x, y, z);
        GL11.glTranslatef(x + 0.5F, y + 1.5F, z + 0.5F);
        GL11.glRotatef(180, 180F, 0F, 1F);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(ResourceLocationHelper.getResourceLocation("textures/models/man.png"));
        GL11.glPushMatrix();
        modelMan.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}

