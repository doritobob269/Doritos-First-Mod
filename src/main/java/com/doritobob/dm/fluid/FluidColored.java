package com.doritobob.dm.fluid;

import com.doritobob.dm.ref.ModInfo;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class FluidColored extends Fluid{

	  public static ResourceLocation ICON_LiquidStill = new ResourceLocation(ModInfo.MODID + ":" + "textures/fluid/molten_metal.png");
	  public static ResourceLocation ICON_LiquidFlowing = new ResourceLocation(ModInfo.MODID + ":" + "textures/fluid/molten_metal_flow.png");
	
	  public final int color;

	  public FluidColored(String fluidName, int color) {
	    this(fluidName, color, ICON_LiquidStill, ICON_LiquidFlowing);
	  }

	  public FluidColored(String fluidName, int color, ResourceLocation still, ResourceLocation flowing) {
	    super(fluidName, still, flowing);

	    // make opaque if no alpha is set
	    if(((color >> 24) & 0xFF) == 0) {
	      color |= 0xFF << 24;
	    }
	    this.color = color;
	  }


	  @Override
	  public int getColor() {
	    return color;
	  }

	  @Override
	  public String getLocalizedName(FluidStack stack) {
	    String s = this.getUnlocalizedName();
	    return s == null ? "" : I18n.translateToLocal(s + ".name");
	  }
}