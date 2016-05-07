package com.doritobob.dm.block;

import com.doritobob.dm.dm;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class BlockdmFluid extends BlockFluidClassic {

  public BlockdmFluid(Fluid fluid, Material material) {
    super(fluid, material);
    this.setCreativeTab(dm.tabGeneral);
  }

  @Override
  public String getUnlocalizedName() {
    Fluid fluid = FluidRegistry.getFluid(fluidName);
    if(fluid != null) {
      return fluid.getUnlocalizedName();
    }
    return super.getUnlocalizedName();
  }
}