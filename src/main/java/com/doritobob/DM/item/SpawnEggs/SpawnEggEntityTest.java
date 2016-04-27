package com.doritobob.dm.item.spawneggs;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.entity.EntityEntityTest;
import com.doritobob.dm.item.spawneggs.RegisterEgg;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SpawnEggEntityTest extends RegisterEgg{
	
	public SpawnEggEntityTest(Class<? extends EntityAnimal> entityClass, String name, int eggBackground, int eggSpots){
		
		super();
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
		//RegisterEgg.RegisterEgg(entityClass, name, eggBackground, eggSpots);
		
	}
	

}
