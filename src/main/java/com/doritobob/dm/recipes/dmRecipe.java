package com.doritobob.dm.recipes;

import com.doritobob.dm.ref.ModInfo;
import com.doritobob.dm.block.dmBlock;
import com.doritobob.dm.item.dmItem;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class dmRecipe {
	
	public static void init(){
		addShapedRecipe(new ItemStack(dmBlock.block_dorito), new Object[] {"###", "###", "###", '#', dmItem.item_dorito});
		
		addShapelessRecipe(new ItemStack(dmItem.item_dorito, 9), new ItemStack(dmBlock.block_dorito));

	}
	
	public static void addShapedRecipe(ItemStack result, Object... recipe){
		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, recipe));
		
	}
	
	public static void addShapelessRecipe(ItemStack result, Object... recipe){
		
		GameRegistry.addShapelessRecipe(result, recipe);
		
	}
	public static void oredict(Item item, String... name) {
	    oredict(item, OreDictionary.WILDCARD_VALUE, name);
	  }

	  public static void oredict(Block block, String... name) {
	    oredict(block, OreDictionary.WILDCARD_VALUE, name);
	  }

	  public static void oredict(Item item, int meta, String... name) {
	    oredict(new ItemStack(item, 1, meta), name);
	  }

	  public static void oredict(Block block, int meta, String... name) {
	    oredict(new ItemStack(block, 1, meta), name);
	  }

	  public static void oredict(ItemStack stack, String... names) {
	    if(stack != null && stack.getItem() != null) {
	      for(String name : names) {
	        OreDictionary.registerOre(name, stack);
	      }
	    }
	  }
}
