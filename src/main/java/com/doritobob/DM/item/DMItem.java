package com.doritobob.DM.item;

import com.doritobob.DM.ref.ModInfo;
import com.doritobob.DM.item.ItemItemTest;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class DMItem{
	//Define Variables
    public static ItemItemTest item_test;
	
	public static void init() {
		//Define Items
		item_test = new ItemItemTest("item_test");
		
		//Register Items
		GameRegistry.registerItem(item_test);
	}
}