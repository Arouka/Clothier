package com.arouka.clothier.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * smashBox.tcn - TechneToTabulaImporter
 * Created using Tabula 4.0.2
 */
public class ModelSmashBox extends ModelBase {
    public ModelRenderer barrelBase;
    public ModelRenderer barrelArm1;
    public ModelRenderer barrelArm2;
    public ModelRenderer barrelArm3;
    public ModelRenderer barrelArm4;
    public ModelRenderer barrelArm5;
    public ModelRenderer barrelArm6;
    public ModelRenderer barrelArm7;
    public ModelRenderer barrelArm8;
    public ModelRenderer topCrossBeam1;
    public ModelRenderer topCrossBeam2;
    public ModelRenderer topCrossBeam3;
    public ModelRenderer topCrossBeam4;
    public ModelRenderer botCrossBeam1;
    public ModelRenderer botCrossBeam2;
    public ModelRenderer botCrossBeam3;
    public ModelRenderer botCrossBeam4;
    public ModelRenderer cornerBeam1;
    public ModelRenderer cornerBeam2;
    public ModelRenderer cornerBeam3;
    public ModelRenderer cornerBeam4;

    public ModelSmashBox() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.cornerBeam3 = new ModelRenderer(this, 42, 53);
        this.cornerBeam3.setRotationPoint(5.0F, 14.5F, 5.400000095367432F);
        this.cornerBeam3.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(cornerBeam3, -0.1919862180948257F, 0.7853981852531433F, 0.0F);
        this.cornerBeam2 = new ModelRenderer(this, 52, 50);
        this.cornerBeam2.setRotationPoint(-5.0F, 14.5F, 5.400000095367432F);
        this.cornerBeam2.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(cornerBeam2, -0.1919862180948257F, -0.7853981852531433F, 0.0F);
        this.barrelBase = new ModelRenderer(this, 0, 0);
        this.barrelBase.setRotationPoint(0.0F, 23.0F, -3.0F);
        this.barrelBase.addBox(-6.0F, -1.0F, -3.0F, 12, 2, 12);
        this.barrelArm1 = new ModelRenderer(this, 0, 15);
        this.barrelArm1.setRotationPoint(-3.0F, 15.5F, -6.199999809265137F);
        this.barrelArm1.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm1, 0.19198621809482574F, -0.0F, 0.0F);
        this.barrelArm2 = new ModelRenderer(this, 12, 15);
        this.barrelArm2.setRotationPoint(-6.199999809265137F, 15.5F, -3.0F);
        this.barrelArm2.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm2, 2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.botCrossBeam2 = new ModelRenderer(this, 10, 53);
        this.botCrossBeam2.setRotationPoint(-5.5F, 19.0F, 0.0F);
        this.botCrossBeam2.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(botCrossBeam2, 2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.topCrossBeam1 = new ModelRenderer(this, 0, 50);
        this.topCrossBeam1.setRotationPoint(0.0F, 14.5F, -6.400000095367432F);
        this.topCrossBeam1.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(topCrossBeam1, 0.19198621809482574F, -0.0F, 0.0F);
        this.barrelArm8 = new ModelRenderer(this, 24, 32);
        this.barrelArm8.setRotationPoint(3.0F, 15.5F, -6.199999809265137F);
        this.barrelArm8.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm8, 0.19198621809482574F, -0.0F, 0.0F);
        this.cornerBeam1 = new ModelRenderer(this, 42, 50);
        this.cornerBeam1.setRotationPoint(-5.0F, 14.5F, -5.400000095367432F);
        this.cornerBeam1.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(cornerBeam1, 0.1919862180948257F, 0.7853981852531433F, 0.0F);
        this.cornerBeam4 = new ModelRenderer(this, 52, 53);
        this.cornerBeam4.setRotationPoint(5.0F, 14.5F, -5.400000095367432F);
        this.cornerBeam4.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(cornerBeam4, 0.1919862180948257F, -0.7853981852531433F, 0.0F);
        this.topCrossBeam2 = new ModelRenderer(this, 10, 50);
        this.topCrossBeam2.setRotationPoint(-6.5F, 14.5F, 0.0F);
        this.topCrossBeam2.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(topCrossBeam2, 2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.barrelArm3 = new ModelRenderer(this, 24, 15);
        this.barrelArm3.setRotationPoint(-6.199999809265137F, 15.5F, 3.0F);
        this.barrelArm3.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm3, 2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.barrelArm6 = new ModelRenderer(this, 0, 32);
        this.barrelArm6.setRotationPoint(6.199999809265137F, 15.5F, 3.0F);
        this.barrelArm6.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm6, -2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.topCrossBeam4 = new ModelRenderer(this, 30, 50);
        this.topCrossBeam4.setRotationPoint(6.5F, 14.5F, 0.0F);
        this.topCrossBeam4.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(topCrossBeam4, -2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.botCrossBeam4 = new ModelRenderer(this, 30, 53);
        this.botCrossBeam4.setRotationPoint(5.5F, 19.0F, 0.0F);
        this.botCrossBeam4.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(botCrossBeam4, -2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.topCrossBeam3 = new ModelRenderer(this, 20, 50);
        this.topCrossBeam3.setRotationPoint(0.0F, 14.5F, 6.400000095367432F);
        this.topCrossBeam3.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(topCrossBeam3, -0.19198621809482574F, -0.0F, 0.0F);
        this.barrelArm7 = new ModelRenderer(this, 12, 32);
        this.barrelArm7.setRotationPoint(6.199999809265137F, 15.5F, -3.0F);
        this.barrelArm7.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm7, -2.9496064354949674F, -1.570796282091413F, 3.141592653589793F);
        this.barrelArm5 = new ModelRenderer(this, 48, 15);
        this.barrelArm5.setRotationPoint(3.0F, 15.5F, 6.199999809265137F);
        this.barrelArm5.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm5, -0.19198621809482574F, -0.0F, 0.0F);
        this.botCrossBeam1 = new ModelRenderer(this, 0, 53);
        this.botCrossBeam1.setRotationPoint(0.0F, 19.0F, -5.400000095367432F);
        this.botCrossBeam1.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(botCrossBeam1, 0.19198621809482574F, -0.0F, 0.0F);
        this.barrelArm4 = new ModelRenderer(this, 36, 15);
        this.barrelArm4.setRotationPoint(-3.0F, 15.5F, 6.199999809265137F);
        this.barrelArm4.addBox(-2.0F, -6.5F, -1.0F, 4, 15, 2);
        this.setRotateAngle(barrelArm4, -0.19198621809482574F, -0.0F, 0.0F);
        this.botCrossBeam3 = new ModelRenderer(this, 20, 53);
        this.botCrossBeam3.setRotationPoint(0.0F, 19.0F, 5.400000095367432F);
        this.botCrossBeam3.addBox(-2.0F, -1.0F, -0.5F, 4, 2, 1);
        this.setRotateAngle(botCrossBeam3, -0.19198621809482574F, -0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.cornerBeam3.render(f5);
        this.cornerBeam2.render(f5);
        this.barrelBase.render(f5);
        this.barrelArm1.render(f5);
        this.barrelArm2.render(f5);
        this.botCrossBeam2.render(f5);
        this.topCrossBeam1.render(f5);
        this.barrelArm8.render(f5);
        this.cornerBeam1.render(f5);
        this.cornerBeam4.render(f5);
        this.topCrossBeam2.render(f5);
        this.barrelArm3.render(f5);
        this.barrelArm6.render(f5);
        this.topCrossBeam4.render(f5);
        this.botCrossBeam4.render(f5);
        this.topCrossBeam3.render(f5);
        this.barrelArm7.render(f5);
        this.barrelArm5.render(f5);
        this.botCrossBeam1.render(f5);
        this.barrelArm4.render(f5);
        this.botCrossBeam3.render(f5);
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
