package com.doritobob.dm.item.spawneggs;

import com.doritobob.dm.ref.ModInfo;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraftforge.fml.common.FMLLog;

public class RegisterEgg {
	
	public RegisterEgg(Class<? extends EntityAnimal> entityClass, String name, int primary, int secondary){
        if (EntityList.classToStringMapping.containsKey(entityClass))
        {
            //String name = EntityList.classToStringMapping.get(entityClass);
            EntityList.entityEggs.put(name, new EntityList.EntityEggInfo(name, primary, secondary));
            FMLLog.fine("Registering entity egg '%s' for %s", name, entityClass);
        }
        else
        {
            FMLLog.fine("Failed registering entity egg %s (No entity found)", entityClass.getName());
        }
    }
}
