package com.doritobob.dm.client.renderer.entity;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.entity.EntityEntityTest;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityTest extends RenderLiving{
	
	protected ResourceLocation entityTestTextures;
	
	public RenderEntityTest(RenderManager renderManagerIn, ModelBiped modelBipedIn, float shadowSize) {
		super(renderManagerIn, modelBipedIn, shadowSize);
		setEntityTexture();
	}
 
    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        preRenderCallbackSerpent((EntityEntityTest) entity, f);

    }
  
    protected void preRenderCallbackSerpent(EntityEntityTest entity, float f)

    {

        // some people do some G11 transformations or blends here, like you can do

        // GL11.glScalef(2F, 2F, 2F); to scale up the entity

        // which is used for Slime entities.  I suggest having the entity cast to

        // your custom type to make it easier to access fields from your 

        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor, 

        // entity.scaleFactor); 

    }
    
    protected void setEntityTexture()
    {
    	entityTestTextures = new ResourceLocation("textures/entity/entity_test/entity_test.png");

    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    private ResourceLocation getEntityTexture(EntityEntityTest entity)
    {
        return entityTestTextures;
    }
    
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}
    
}