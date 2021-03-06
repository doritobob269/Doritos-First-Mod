package com.doritobob.dm.client;

import com.doritobob.dm.CommonProxy;
import com.doritobob.dm.client.renderer.EntityRenderRegister;
import com.doritobob.dm.client.renderer.FluidRenderRegister;
import com.doritobob.dm.client.renderer.ItemRenderRegister;
import com.doritobob.dm.item.dmItem;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        EntityRenderRegister.registerEntityRenderer();
        
    }
    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);
        ItemRenderRegister.registerItemRenderer();
        FluidRenderRegister.registerFluidRender();
        
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
