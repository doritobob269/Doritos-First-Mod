package com.doritobob.dm.client.renderer;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.dmBlock;
import com.doritobob.dm.item.dmItem;
import com.doritobob.dm.item.spawneggs.dmItemSpawnEggs;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
        registerRendererItem(dmItem.item_dorito);
        //registerRendererItem(dmItemSpawnEggs.item_spawnegg_entity_test);
        registerRendererBlock(dmBlock.block_dorito);
    }

	private static void registerRendererItem(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	private static void registerRendererBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
