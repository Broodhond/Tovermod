package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemFilledUrn extends Item {
    public ItemFilledUrn() {
        setRegistryName(Reference.ToverModItems.FILLEDURN.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.FILLEDURN.getUnlocalizedName());
//        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
