package com.doritobob.dm.block;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.dmBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockBlockTest extends Block{
	
	public BlockBlockTest(Material material, String name) {
	
		super(material);
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
	}
	
}
