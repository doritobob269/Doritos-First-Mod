package com.doritobob.dm.item;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.BlockBlockTest;
import com.doritobob.dm.item.ItemItemTest;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.item.Item.getItemFromBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class dmItem{
	//Define Variables
    public static ItemItemTest item_test;

	public static void init() {
		//Define Items
		item_test = new ItemItemTest("item_test");
		
		//Register Items
		GameRegistry.registerItem(item_test);
	}
}