package com.doritobob.DM;

import com.doritobob.DM.block.DMBlock;
import com.doritobob.DM.item.DMItem;

public class CommonProxy {
	public void registerRenderers () {
		DMItem.registerRenders();
		DMBlock.registerRenders();
    }


}
