package com.doritobob.dm.client;

import com.doritobob.dm.CommonProxy;
import com.doritobob.dm.item.dmItem;
import com.doritobob.dm.renderers.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }
    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);
        ItemRenderRegister.registerItemRenderer();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
