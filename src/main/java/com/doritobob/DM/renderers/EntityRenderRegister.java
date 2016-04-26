package com.doritobob.dm.renderers;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.client.renderer.entity.RenderDoritoPet;
import com.doritobob.dm.client.renderer.entity.RenderEntityTest;
import com.doritobob.dm.entity.EntityDoritoPet;
import com.doritobob.dm.entity.EntityEntityTest;
import com.doritobob.dm.entity.dmEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityRenderRegister{

	public static void registerEntityRenderer(){
		registerEntityTest(EntityEntityTest.class);
		registerDoritoPet(EntityDoritoPet.class);
	}
	
	private static void registerEntityTest(Class<? extends EntityEntityTest> mob){
		RenderingRegistry.registerEntityRenderingHandler(mob, new IRenderFactory<EntityEntityTest>() {
			@Override
			public Render<? super EntityEntityTest> createRenderFor(RenderManager manager) {
				return new RenderEntityTest(manager);
			}
		});
	}
	
	private static void registerDoritoPet(Class<? extends EntityDoritoPet> mob){
		RenderingRegistry.registerEntityRenderingHandler(mob, new IRenderFactory<EntityDoritoPet>() {
			@Override
			public Render<? super EntityDoritoPet> createRenderFor(RenderManager manager) {
				return new RenderDoritoPet(manager);
			}
		});
	}


}
