package com.doritobob.dm.fluid;

import com.doritobob.dm.ref.ModInfo;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidMolten extends FluidColored{

  public static ResourceLocation ICON_MetalStill = new ResourceLocation(ModInfo.MODID + ":" + "textures/fluids/molten_metal.png");
  public static ResourceLocation ICON_MetalFlowing = new ResourceLocation(ModInfo.MODID + ":" + "textures/fluids/molten_metal_flow.png");

  public FluidMolten(String fluidName, int color) {
    this(fluidName, color, ICON_MetalStill, ICON_MetalFlowing);
  }

  public FluidMolten(String fluidName, int color, ResourceLocation still, ResourceLocation flow) {
    super(fluidName, color, still, flow);
    
    this.setDensity(2000); // thicker than a bowl of oatmeal
    this.setViscosity(10); // sloooow moving
    this.setTemperature(10); // not exactly lava, but still hot. Should depend on the material
    this.setLuminosity(10); // glowy by default!

    // rare by default
    setRarity(EnumRarity.UNCOMMON);
  }
}