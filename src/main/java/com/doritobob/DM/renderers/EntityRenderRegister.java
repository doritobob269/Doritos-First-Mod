package com.doritobob.dm.renderers;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.entity.EntityEntityTest;
import com.doritobob.dm.entity.dmEntity;
import com.doritobob.dm.render.RenderEntityTest;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityRenderRegister{

	public static void registerEntityRenderer(){
		register(EntityEntityTest.class);
	}
	
	private static void register(Class<? extends EntityEntityTest> mob){
			RenderingRegistry.registerEntityRenderingHandler(mob, new IRenderFactory<EntityEntityTest>() {
				
				@Override
				public Render<? super EntityEntityTest> createRenderFor(RenderManager manager) {
					return new com.doritobob.dm.client.renderer.entity.RenderEntityTest(manager);
				}
			});
	}
	/*
	private static void createEgg(Class<? extends Entity> Class, String name, int ID, int primaryColor, int secondaryColor) {
		EntityList.addMapping(Class, name, ID, primaryColor, secondaryColor);
	}*/

}
