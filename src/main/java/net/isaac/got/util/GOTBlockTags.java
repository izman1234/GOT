package net.isaac.got.util;

import net.isaac.got.GOT;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class GOTBlockTags { //TODO LOOK INTO COMMON TAGS
    private static TagKey<Block> of(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(GOT.MOD_ID, name));
    }
    public static final TagKey<Block> Banana_Wood = of("wood2_banana");
    public static final TagKey<Block> Date_Palm_Wood = of("wood3_date_palm");

    private GOTBlockTags() {
    }
}
