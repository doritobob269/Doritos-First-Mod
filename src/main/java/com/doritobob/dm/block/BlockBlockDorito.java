package com.doritobob.dm.block;

import com.doritobob.dm.ref.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBlockDorito extends Block{
	
	public BlockBlockDorito(Material material, String name) {
	
		super(material);
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
	}
}
