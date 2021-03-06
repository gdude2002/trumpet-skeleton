package com.jamieswhiteshirt.trumpetskeleton.items;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.fml.RegistryObject;

public class SupplierSpawnEggItem extends SpawnEggItem {
    private final RegistryObject<?> supplier;

    public SupplierSpawnEggItem(RegistryObject<?> supplierIn, int primaryColorIn, int secondaryColorIn, Properties builder) {
        super(null, primaryColorIn, secondaryColorIn, builder);
        supplier = supplierIn;
    }

    @Override
    public EntityType<?> getType(CompoundNBT p_208076_1_) {
        return (EntityType<?>) supplier.get();
    }
}
