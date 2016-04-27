package com.doritobob.dm.models;

import com.doritobob.dm.entity.EntityEntityTest;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelDoritoPet extends ModelQuadruped
{
    public ModelRenderer head;

    public ModelRenderer body;

    //Front Left
    public ModelRenderer leg1;

    //Front Right
    public ModelRenderer leg2;
    
    //Back Left
    public ModelRenderer leg3;

    //Back Right
    public ModelRenderer leg4;
    
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public ModelDoritoPet(){
    	
        this(3);
    }

    public ModelDoritoPet(int height){
    	
        this(height, 0.0F);
    }

    public ModelDoritoPet(int height, float scale){
    	
    	super(height, scale);
    	this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, scale);
        this.head.setRotationPoint(0.0F, (float)(18 - height), -6.0F);
        
        this.body = new ModelRenderer(this, 24, 8);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, scale);
        this.body.setRotationPoint(0.0F, (float)(17 - height), 2.0F);
        
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg1.setRotationPoint(3.0F, (float)(24 - height), -5.0F);
        
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg2.setRotationPoint(3.0F, (float)(24 - height), 5.0F);
        
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg3.setRotationPoint(-3.0F, (float)(24 - height), -5.0F);

        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
        this.leg4.setRotationPoint(-3.0F, (float)(24 - height), 5.0F);
        
        
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entity, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
    {
        this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, entity);
        this.head.render(p_78088_7_);
        this.body.render(p_78088_7_);
        this.leg1.render(p_78088_7_);
        this.leg2.render(p_78088_7_);
        this.leg3.render(p_78088_7_);
        this.leg4.render(p_78088_7_);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    private float func_78172_a(float p_78172_1_, float p_78172_2_)
    {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
    }
}