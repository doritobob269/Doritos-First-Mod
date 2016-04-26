package com.doritobob.dm.client.renderer.entity;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.renders.ModelEntityTest;
import com.doritobob.dm.entity.EntityEntityTest;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityTest extends RenderBiped {
	//RenderLiving<EntityEntityTest>{
	
	public static final ResourceLocation textureLocation = new ResourceLocation(ModInfo.MODID + ":textures/entity/entity_test/entity_test.png");
	
	public RenderEntityTest(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelBiped(), 0.5F);
	}

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity)
	{
		return textureLocation;
	}
    
}