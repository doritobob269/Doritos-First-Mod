package com.doritobob.dm.item.SpawnEggs;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.dmCreativeTabs;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class dmItemSpawnEggs{
	
	public static SpawnEggEntityTest item_spawnegg_entity_test;

    public static void init() {
		//Define Items
		item_spawnegg_entity_test = new SpawnEggEntityTest("entity_test");
		
		//Register Items
		GameRegistry.registerItem(item_spawnegg_entity_test);
	}
}