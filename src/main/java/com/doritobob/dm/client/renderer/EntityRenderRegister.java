package com.doritobob.dm.client.renderer;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.client.renderer.entity.RenderDoritoPet;
import com.doritobob.dm.client.renderer.entity.RenderDoritobob;
import com.doritobob.dm.entity.EntityDoritoPet;
import com.doritobob.dm.entity.EntityDoritobob;
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
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EntityRenderRegister{

	public static void registerEntityRenderer(){
		registerEntityTest(EntityDoritobob.class);
		registerDoritoPet(EntityDoritoPet.class);
	}
	
	private static void registerEntityTest(Class<? extends EntityDoritobob> mob){
		RenderingRegistry.registerEntityRenderingHandler(mob, new IRenderFactory<EntityDoritobob>() {
			@Override
			public Render<? super EntityDoritobob> createRenderFor(RenderManager manager) {
				return new RenderDoritobob(manager);
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

