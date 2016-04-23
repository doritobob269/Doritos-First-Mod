package com.doritobob.dm;

import com.doritobob.dm.ref.ModInfo;

import com.doritobob.dm.block.dmBlock;
import com.doritobob.dm.client.ClientProxy;
import com.doritobob.dm.item.dmItem;
import com.doritobob.dm.dmCreativeTabs;

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
public class dm {
	
	public static final dmBlock blocks = new dmBlock();
    public static final dmItem items = new dmItem();
    public static final dmCreativeTabs tabGeneral = new dmCreativeTabs();
    
	@Instance
	public static dm instance;
	
	@SidedProxy(serverSide = ModInfo.SOURCEPATH + ".CommonProxy", clientSide = ModInfo.SOURCEPATH + ".client.ClientProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event) {
		dmItem.init();
		dmBlock.init();
		
		proxy.init(event);;
		
	}
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
    }
}
