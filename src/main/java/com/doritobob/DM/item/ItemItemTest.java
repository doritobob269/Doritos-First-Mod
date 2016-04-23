package com.doritobob.dm.item;

import com.doritobob.dm.ref.ModInfo;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemItemTest extends Item{
	
	public ItemItemTest(String name){
		
		super();
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
	}
}
