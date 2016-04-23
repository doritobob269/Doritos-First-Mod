package com.doritobob.dm.block;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.BlockBlockTest;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.EnumBlockRenderType;;

public class dmBlock{
	//Define Variables
	public static BlockBlockTest block_test;
	
	public static void init() {
		//Define Blocks
		block_test = new BlockBlockTest(Material.ground, "block_test");
		
		//Register Blocks
		GameRegistry.registerBlock(block_test);
		
	}
	
	/*
	public static void registerRenders() {
		registerRender(block_test);
	}
	private static void registerRender(Block block) {
	    // This is currently necessary in order to make your block render properly when it is an item (i.e. in the inventory
	    //   or in your hand or thrown on the ground).
	    // Minecraft knows to look for the item model based on the GameRegistry.registerBlock.  However the registration of
	    //  the model for each item is normally done by RenderItem.registerItems(), and this is not currently aware
	    //   of any extra items you have created.  Hence you have to do it manually.
	    // It must be done on client only, and must be done after the block has been created in Common.preinit().
	    Item itemBlockSimple = GameRegistry.findItem(ModInfo.MODID, "block_test");
	    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(ModInfo.MODID + ":" + "block_test", "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    ModelLoader.setCustomModelResourceLocation(itemBlockSimple, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}
	@SideOnly(Side.CLIENT)
	public EnumBlockRenderType getBlockLayer()
	{
	    return EnumBlockRenderType.MODEL;
	}
	public int getRenderType() {
	  return 3;
	}*/
	
}
