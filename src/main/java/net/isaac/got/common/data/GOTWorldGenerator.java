package net.isaac.got.common.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.isaac.got.GOT;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class GOTWorldGenerator extends FabricDynamicRegistryProvider { /*DOESN'T WORK YET */
    public GOTWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        //HERE GOES FUTURE WORLD GEN!
    }

    @Override
    public String getName() {
        return GOT.MOD_ID;
    }
}
