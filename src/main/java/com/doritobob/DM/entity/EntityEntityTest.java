package com.doritobob.dm.entity;

import com.doritobob.dm.item.dmItem;
import com.doritobob.dm.ref.ModInfo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;

public class EntityEntityTest extends EntityAnimal{
	
	public EntityEntityTest(World world){
        super(world);
        setSize(1, 2);
        preventEntitySpawning = true;
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
        this.tasks.addTask(2, new EntityAITempt(this, 0.7D, dmItem.item_test, false));
        this.tasks.addTask(3, new EntityAIFollowParent(this, 1.0D));
    }

    public EntityEntityTest(World world, double x, double y, double z){
        this(world);
        setPosition(x, y, z);
    }

    public boolean isAIEnabled(){
        return true;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return null;
        //new EntitySmash(worldObj);
    }
}