package com.doritobob.DM.block;

import com.doritobob.DM.ref.ModInfo;
import com.doritobob.DM.block.DMBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockBlockTest extends Block{
	
	public BlockBlockTest(Material material, String name) {
	
		super(material);
		this.setUnlocalizedName(name);
		//this.setRegistryName("block_test");
	}
	
}
