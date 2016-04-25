package com.doritobob.dm.item;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.BlockBlockTest;
import com.doritobob.dm.entity.EntityEntityTest;
import com.doritobob.dm.item.ItemItemTest;
import com.doritobob.dm.item.spawneggs.RegisterEgg;
import com.doritobob.dm.item.spawneggs.dmItemSpawnEggs;
import com.doritobob.dm.item.spawneggs.RegisterEgg;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class dmItem{
	//Define Variables
    public static ItemItemTest item_test;
    public static RegisterEgg spawn_entity_test;

	public static void init() {
		//Define Items
		item_test = new ItemItemTest("item_test");
		//spawn_entity_test = new registerEgg(EntityEntityTest.class, "entity_test", 0x0000ff, 0x00ff00);
		
		//Register Items
		GameRegistry.registerItem(item_test);
		
		//Define and Register Entity Eggs
		//dmItemSpawnEggs.init();
	}
}