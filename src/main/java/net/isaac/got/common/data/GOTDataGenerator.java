package net.isaac.got.common.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.isaac.got.common.data.GOTLootTableGenerator;
import net.isaac.got.common.data.GOTModelProvider;
import net.isaac.got.common.data.GOTRecipeGenerator;

public class GOTDataGenerator implements DataGeneratorEntrypoint { /*DOESN'T WORK YET */
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(GOTLootTableGenerator::new);
        pack.addProvider(GOTRecipeGenerator::new);
        pack.addProvider(GOTModelProvider::new);
    }
}
