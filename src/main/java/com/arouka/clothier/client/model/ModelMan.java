package com.arouka.clothier.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.model.IModelCustom;

/**
 * modelMan.tcn - TechneToTabulaImporter
 * Created using Tabula 4.0.2
 */
public class ModelMan extends ModelBase {
    public ModelRenderer baseLower;
    public ModelRenderer baseUpper;
    public ModelRenderer backSupport;
    public ModelRenderer headConnectLeft;
    public ModelRenderer headConnectRight;
    public ModelRenderer chestConnectLeft;
    public ModelRenderer backBoltLeft;
    public ModelRenderer chestConnectRight;
    public ModelRenderer backBoltRight;
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;

    private IModelCustom modelMan;

    public ModelMan() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.baseUpper = new ModelRenderer(this, 0, 47);
        this.baseUpper.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.baseUpper.addBox(-5.0F, -0.5F, -5.0F, 10, 1, 10);
        this.baseLower = new ModelRenderer(this, 0, 32);
        this.baseLower.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.baseLower.addBox(-7.0F, -0.5F, -7.0F, 14, 1, 14);
        this.headConnectLeft = new ModelRenderer(this, 41, 48);
        this.headConnectLeft.setRotationPoint(1.0F, -4.5F, 4.0F);
        this.headConnectLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1);
        this.backSupport = new ModelRenderer(this, 57, 17);
        this.backSupport.setRotationPoint(0.0F, 8.5F, 5.0F);
        this.backSupport.addBox(-1.0F, -14.5F, -1.0F, 2, 29, 1);
        this.backBoltLeft = new ModelRenderer(this, 41, 58);
        this.backBoltLeft.setRotationPoint(2.0F, 5.0F, 2.0F);
        this.backBoltLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.setRotationPoint(5.0F, 1.0F, 0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.setRotateAngle(leftarm, 0.2617993950843811F, -0.0F, 0.0F);
        this.backBoltRight = new ModelRenderer(this, 45, 58);
        this.backBoltRight.setRotationPoint(-2.0F, 5.0F, 2.0F);
        this.backBoltRight.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.setRotationPoint(-5.0F, 1.0F, 0.0F);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.setRotateAngle(rightarm, -0.2617993950843811F, -0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.setRotationPoint(-2.0F, 11.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.setRotateAngle(rightleg, 0.08726646006107329F, -0.0F, 0.0F);
        this.chestConnectRight = new ModelRenderer(this, 49, 52);
        this.chestConnectRight.setRotationPoint(-1.5F, 5.0F, 3.5F);
        this.chestConnectRight.addBox(-0.5F, -1.0F, -1.5F, 1, 2, 3);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.setRotationPoint(2.0F, 11.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.setRotateAngle(leftleg, -0.08726646006107329F, -0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.chestConnectLeft = new ModelRenderer(this, 41, 52);
        this.chestConnectLeft.setRotationPoint(1.5F, 5.0F, 3.5F);
        this.chestConnectLeft.addBox(-0.5F, -1.0F, -1.5F, 1, 2, 3);
        this.headConnectRight = new ModelRenderer(this, 45, 48);
        this.headConnectRight.setRotationPoint(-1.0F, -4.5F, 4.0F);
        this.headConnectRight.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1);
    }

    public void render(float f5) {
        this.baseUpper.render(f5);
        this.baseLower.render(f5);
        this.headConnectLeft.render(f5);
        this.backSupport.render(f5);
        this.backBoltLeft.render(f5);
        this.leftarm.render(f5);
        this.backBoltRight.render(f5);
        this.rightarm.render(f5);
        this.rightleg.render(f5);
        this.chestConnectRight.render(f5);
        this.head.render(f5);
        this.leftleg.render(f5);
        this.body.render(f5);
        this.chestConnectLeft.render(f5);
        this.headConnectRight.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
