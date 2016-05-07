package com.doritobob.dm.block;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class BlockMolten extends BlockdmFluid {

  public BlockMolten(Fluid fluid) {
    super(fluid, Material.sponge);
  }
}