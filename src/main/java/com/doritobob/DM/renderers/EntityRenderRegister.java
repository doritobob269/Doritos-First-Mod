package com.doritobob.dm.renderers;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.entity.EntityEntityTest;
import com.doritobob.dm.entity.dmEntity;
import com.doritobob.dm.render.RenderEntityTest;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityRenderRegister {
	
	public static void registerEntityRenderer(){
		RenderingRegistry.registerEntityRenderingHandler(EntityEntityTest.class, new RenderEntityTest(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0));
		createEgg(dmEntity.entity_test.getClass(), "entity_test", 200, 0x0000ff,0x00ff00);
	}
	
	private static void createEgg(Class<? extends Entity> Class, String name, int ID, int primaryColor, int secondaryColor) {
		EntityList.addMapping(Class, name, ID, primaryColor, secondaryColor);
	}

}
