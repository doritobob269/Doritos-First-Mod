package com.doritobob.dm.entity;

import com.doritobob.dm.dm;
import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.render.RenderEntityTest;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class dmEntity {
	
	public static EntityEntityTest entity_test;
	
	public static void init(World worldIn){
		entity_test = new EntityEntityTest(worldIn);
		
		//RenderingRegistry.registerEntityRenderingHandler(entity_test.getClass(), new RenderEntityTest(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0));
		
		int id = 0;
		
        EntityRegistry.registerModEntity(entity_test.getClass(), "entity_test", id++, dm.instance, 64, 20, true);
	}

}
