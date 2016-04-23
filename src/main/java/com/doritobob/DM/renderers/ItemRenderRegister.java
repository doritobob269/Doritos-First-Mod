package com.doritobob.dm.renderers;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.item.dmItem;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
        registerRenderer(dmItem.item_test);
        //registerRenderer(dmItem.item_block_test);
    }

	private static void registerRenderer(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
    }

}
