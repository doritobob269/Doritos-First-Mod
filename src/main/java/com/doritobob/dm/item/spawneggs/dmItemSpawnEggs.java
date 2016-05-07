package com.doritobob.dm.item.spawneggs;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.dm;
import com.doritobob.dm.dmCreativeTabs;
import com.doritobob.dm.entity.EntityDoritobob;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class dmItemSpawnEggs{
	
	public static SpawnEggEntityTest item_spawnegg_entity_test;

    public static void init() {
		//Define Items
		item_spawnegg_entity_test = new SpawnEggEntityTest(EntityDoritobob.class, "entity_test", 0x0000ff, 0x00ff00);
		
		//Register Items
		GameRegistry.registerItem(item_spawnegg_entity_test);
	}
}