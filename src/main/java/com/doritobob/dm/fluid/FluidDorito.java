package com.doritobob.dm.fluid;

import java.util.List;
import java.util.Locale;

import com.doritobob.dm.block.BlockMolten;
import com.doritobob.dm.block.BlockdmFluid;
import com.doritobob.dm.block.dmBlock;
import com.doritobob.dm.ref.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;


public class FluidDorito {
	// The fluids. Note that just because they exist doesn't mean that they're registered!
	  
	  public static FluidMolten dorito;
	  
	  public static void init(){
	    setupFluids();
	    
	  }

	  public static void setupFluids() {

	    FluidRegistry.enableUniversalBucket();

	    dorito = fluidMetal("dorito", 0xFF9500);
	    FluidRegistry.addBucketForFluid(dorito);
	    registerClassicBlock(dorito);
	    
	  }

	  private static FluidMolten fluidMetal(String name, int color) {
		  FluidMolten fluid = new FluidMolten(name, color);
		  return fluid;
	  }

	  private static FluidMolten fluidLiquid(String name, int color) {
		  FluidMolten fluid = new FluidMolten(name, color, FluidMolten.ICON_LiquidStill, FluidMolten.ICON_LiquidFlowing);
		  return fluid;
	  }
	  
	  public static BlockFluidBase registerClassicBlock(Fluid fluid) {
		    BlockFluidBase block = new BlockdmFluid(fluid, net.minecraft.block.material.Material.water);
		    return registerBlock(block, fluid.getName());
	  }
	  
	  public static BlockMolten registerMoltenBlock(Fluid fluid) {
		    BlockMolten block = new BlockMolten(fluid);
		    return registerBlock(block, "molten_" + fluid.getName()); // molten_foobar prefix
	  }
	  
	  protected static <T extends Item> T registerItem(T item, String name) {
		    if(!name.equals(name.toLowerCase(Locale.US))) {
		      throw new IllegalArgumentException(String.format("Unlocalized names need to be all lowercase! Item: %s", name));
	  }

		    item.setUnlocalizedName(ModInfo.MODID + ":" + name);
		    item.setRegistryName(name);
		    GameRegistry.register(item);
		    return item;
	  }

	  protected static <T extends Block> T registerBlock(T block, String name) {
		    GameRegistry.registerBlock(block, name);
		    return block;
	  }

	  protected static <T extends Block> T registerBlock(ItemBlock itemBlock, String name) {
		    Block block = itemBlock.getBlock();
		    return (T)registerBlock(block, itemBlock, name);
	  }

	  protected static <T extends Block> T registerBlock(T block, ItemBlock itemBlock, String name) {
		    if(!name.equals(name.toLowerCase(Locale.US))) {
		      throw new IllegalArgumentException(String.format("Unlocalized names need to be all lowercase! Block: %s", name));
		    }

		    String prefixedName = ModInfo.MODID + ":" + name;
		    block.setUnlocalizedName(prefixedName);
		    itemBlock.setUnlocalizedName(prefixedName);

		    register(block, name);
		    register(itemBlock, name);
		    return block;
	  }

	  protected static <T extends IForgeRegistryEntry<?>> T register(T thing, String name) {
		    thing.setRegistryName(new ResourceLocation(ModInfo.MODID + ":" + name));
		    GameRegistry.register(thing);
		    return thing;
	  }

	  protected static void registerTE(Class<? extends TileEntity> teClazz, String name) {
		    if(!name.equals(name.toLowerCase(Locale.US))) {
		      throw new IllegalArgumentException(String.format("Unlocalized names need to be all lowercase! TE: %s", name));
		    }

		    GameRegistry.registerTileEntity(teClazz, ModInfo.MODID + ":" + name);
	  }
	  
}
