package net.isaac.got.common.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.isaac.got.common.data.GOTLootTableGenerator;
import net.isaac.got.common.data.GOTModelProvider;
import net.isaac.got.common.data.GOTRecipeGenerator;
import net.isaac.got.common.world.GOTConfiguredFeatures;
import net.isaac.got.common.world.GOTPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class GOTDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(GOTLootTableGenerator::new);
        pack.addProvider(GOTRecipeGenerator::new);
        pack.addProvider(GOTModelProvider::new);
        pack.addProvider(GOTWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, GOTConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, GOTPlacedFeatures::bootstrap);
    }
}
