package com.doritobob.dm;

import com.doritobob.dm.ref.ModInfo;

import java.util.List;

import com.doritobob.dm.block.dmBlock;
import com.doritobob.dm.item.dmItem;
import com.doritobob.dm.item.spawneggs.dmItemSpawnEggs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class dmCreativeTabs extends CreativeTabs{

		public static List list;
		
		public dmCreativeTabs() {
    		super(ModInfo.MODID);
    		this.setBackgroundImageName("dm.png");
			this.setNoTitle();
        }
		
    	@Override
        public Item getTabIconItem() {
            return dmItem.item_test;
        }

        @Override
        public String getTabLabel() {
            return ModInfo.MODID + ":general";
        }
        
        @Override
    	public boolean hasSearchBar() {
    		return true;
    	}
        
        //@Override
        public void displayAllRelevantItems(List list) {
    		this.list = list;
    		addItem(dmItem.item_test);
    		//addItem(dmItemSpawnEggs.item_spawnegg_entity_test);
    		addBlock(dmBlock.block_test);
        }
        
        private void addItem(Item item) {
    		item.getSubItems(item, this, list);
    	}

    	private void addBlock(Block block) {
    		ItemStack stack = new ItemStack(block);
    		block.getSubBlocks(stack.getItem(), this, list);
    	}
	  
}

