package net.isaac.got.common.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class GOTLootTableGenerator extends FabricBlockLootTableProvider { /*DOESN'T WORK YET */
    public GOTLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /*Example
        addDrop(ModBlocks.CITRINE_BLOCK);
        addDrop(ModBlocks.CITRINE_BLOCK, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAWCITRINE));
        look into oreDrops for more detailed json file creation
         */
    }
}
