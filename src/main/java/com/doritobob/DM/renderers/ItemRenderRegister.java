package com.doritobob.DM.renderers;

import com.doritobob.DM.ref.ModInfo;
import com.doritobob.DM.item.DMItem;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
        registerRender(DMItem.item_test);
    }

	private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
