package net.isaac.got.common.world.dimension;

import net.isaac.got.GOT;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class GOTDimensions {
    public static final RegistryKey<World> GOTDIM_DIMENSION = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(GOT.MOD_ID, "gotdim"));
    public static final RegistryKey<DimensionType> GOTDIM_TYPE_KEY = RegistryKey.of
            (RegistryKeys.DIMENSION_TYPE, GOTDIM_DIMENSION.getValue());

    public static void register() {
        GOT.LOGGER.debug("Registering ModDimensions for " + GOT.MOD_ID);
    }
}
