package com.doritobob.DM;

import com.doritobob.DM.ref.ModInfo;

import com.doritobob.DM.block.DMBlock;
import com.doritobob.DM.client.ClientProxy;
import com.doritobob.DM.item.DMItem;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.RenderItem;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME) 
public class DM {
	
	public static final DMBlock blocks = new DMBlock();
    public static final DMItem items = new DMItem();
    
	@Instance
	public static DM instance;
	
	@SidedProxy(serverSide = ModInfo.SOURCEPATH + ".CommonProxy", clientSide = ModInfo.SOURCEPATH + ".client.ClientProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event) {
		DMItem.init();
		DMBlock.init();
		proxy.init(event);;
		
	}
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
    }
}
