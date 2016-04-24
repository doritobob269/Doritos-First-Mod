package com.doritobob.dm.entity;

import com.doritobob.dm.ref.ModInfo;

import net.minecraft.world.World;

public class dmEntity {
	
	public static EntityEntityTest entity_test;
	
	public dmEntity(World worldIn){
		entity_test = new EntityEntityTest(worldIn);
	}

}
