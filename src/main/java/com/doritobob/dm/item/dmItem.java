package com.doritobob.dm.item;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.dm;
import com.doritobob.dm.block.BlockBlockDorito;
import com.doritobob.dm.entity.EntityDoritobob;
import com.doritobob.dm.item.ItemItemDorito;
import com.doritobob.dm.item.spawneggs.RegisterEgg;
import com.doritobob.dm.item.spawneggs.dmItemSpawnEggs;
import com.doritobob.dm.item.spawneggs.RegisterEgg;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class dmItem{
	//Define Variables
    public static ItemItemDorito item_dorito;
    public static RegisterEgg spawn_entity_test;

	public static void init() {
		//Define Items
		item_dorito = new ItemItemDorito("item_dorito");
		//spawn_entity_test = new registerEgg(EntityEntityTest.class, "entity_test", 0x0000ff, 0x00ff00);
		
		//Register Items
		GameRegistry.registerItem(item_dorito);
		
		//Define and Register Entity Eggs
		//dmItemSpawnEggs.init();
	}
}