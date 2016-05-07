package com.doritobob.dm.block;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.BlockBlockDorito;

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
	public static BlockBlockDorito block_dorito;
	
	public static void init() {
		//Define Blocks
		block_dorito = new BlockBlockDorito(Material.ground, "block_dorito");
		
		//Register Blocks
		GameRegistry.registerBlock(block_dorito);
	}
}
