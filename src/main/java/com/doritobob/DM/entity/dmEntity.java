package com.doritobob.dm.entity;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.dm;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class dmEntity {
	
	public static EntityEntityTest entity_test;
	public static EntityDoritoPet dorito_pet;
	
	public static void init(){

		int id = 0;

		EntityRegistry.registerModEntity(EntityEntityTest.class, "entity_test", id++, dm.instance, 64, 1, true, 0x0000ff, 0x0099FF);
		EntityRegistry.registerModEntity(EntityDoritoPet.class, "dorito_pet", id++, dm.instance, 64, 1, true, 0x1D9CE0, 0xFF9500);
	
	}
}
