package com.doritobob.dm.render;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.entity.EntityEntityTest;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityTest extends RenderLiving<EntityEntityTest>
{
	private static final ResourceLocation EntityTestTextures = new ResourceLocation("textures/entity/entity_test/entity_test.png");

    public RenderEntityTest(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
    {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityEntityTest entity)
    {
        return EntityTestTextures;
    }
}