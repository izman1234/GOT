package net.isaac.got.common.world;

import net.isaac.got.GOT;
import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.world.tree.decorator.BananaDecorator;
import net.isaac.got.common.world.tree.decorator.DatePalmDecorator;
import net.isaac.got.common.world.tree.foliage.*;
import net.isaac.got.common.world.tree.trunk.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.root.AboveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class GOTConfiguredFeatures { //for how the tree looks
    public static final RegistryKey<ConfiguredFeature<?, ?>> CATALPA_KEY = registerKey("catalpa_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IBBINIA_KEY = registerKey("ibbinia_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ULTHOS_KEY = registerKey("ulthos_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ULTHOS_KEY = registerKey("red_ulthos_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ARAMANT_KEY = registerKey("aramant_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BANANA_KEY = registerKey("banana_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_KEY = registerKey("beech_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLY_KEY = registerKey("holly_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_HOLLY_KEY = registerKey("giant_holly_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DATE_PALM_KEY = registerKey("date_palm_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_KEY = registerKey("larch_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANGROVE_KEY = registerKey("mangrove_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB_KEY = registerKey("baobab_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_KEY = registerKey("cedar_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_KEY = registerKey("chestnut_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIR_KEY = registerKey("fir_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON_KEY = registerKey("lemon_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_KEY = registerKey("lime_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_KEY = registerKey("orange_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("pine_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYPRESS_KEY = registerKey("cypress_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_CYPRESS_KEY = registerKey("giant_cypress_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_KEY = registerKey("olive_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GIANT_OLIVE_KEY = registerKey("giant_olive_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALMOND_KEY = registerKey("almond_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ASPEN_KEY = registerKey("aspen_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOTINIA_KEY = registerKey("fotinia_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_OAK_KEY = registerKey("green_oak_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_KEY = registerKey("plum_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POMEGRANATE_KEY = registerKey("pomegranate_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRAGON_KEY = registerKey("dragon_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KANUKA_KEY = registerKey("kanuka_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WEIRWOOD_KEY = registerKey("weirwood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRUIT_APPLE_KEY = registerKey("fruit_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRUIT_CHERRY_KEY = registerKey("fruit_cherry_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRUIT_MANGO_KEY = registerKey("fruit_mango_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRUIT_PEAR_KEY = registerKey("fruit_pear_tree");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RegistryEntryLookup<Block> registryEntryLookup = context.getRegistryLookup(RegistryKeys.BLOCK);

        register(context, CATALPA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Catalpa_Wood),
                new StraightTrunkPlacer(7, 8, 5),
                BlockStateProvider.of(GOTBlocks.Catalpa_Leaves),
                new CatalpaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, IBBINIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Ibbinia_Wood),
                new StraightTrunkPlacer(8, 6, 3),
                BlockStateProvider.of(GOTBlocks.Ibbinia_Leaves),
                new IbbiniaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(6)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, ULTHOS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Ulthos_Wood),
                new UlthosTrunkPlacer(6, 5, 3),
                BlockStateProvider.of(GOTBlocks.Ulthos_Leaves),
                new UlthosFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(2), ConstantIntProvider.create(3)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, RED_ULTHOS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Ulthos_Wood),
                new UlthosTrunkPlacer(6, 5, 3),
                BlockStateProvider.of(GOTBlocks.Ulthos_Red_Leaves),
                new UlthosFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(2), ConstantIntProvider.create(3)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ARAMANT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Aramant_Wood),
                new StraightTrunkPlacer(7, 5, 3),
                BlockStateProvider.of(GOTBlocks.Aramant_Leaves),
                new AramantFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, BANANA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Banana_Wood),
                new StraightTrunkPlacer(4, 1, 2),
                BlockStateProvider.of(GOTBlocks.Banana_Leaves),
                new BananaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(Collections.singletonList(BananaDecorator.INSTANCE)).build());

        register(context, BEECH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Beech_Wood),
                new StraightTrunkPlacer(5, 5, 2),
                BlockStateProvider.of(GOTBlocks.Beech_Leaves),
                new BeechFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //TODO: ADD BIG TREE VARIANT

        register(context, HOLLY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Holly_Wood),
                new StraightTrunkPlacer(10, 4, 3),
                BlockStateProvider.of(GOTBlocks.Holly_Leaves),
                new HollyFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(8)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GIANT_HOLLY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Holly_Wood),
                new GiantTrunkPlacer(20, 8, 8),
                BlockStateProvider.of(GOTBlocks.Holly_Leaves),
                new HollyFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(8)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, DATE_PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Date_Palm_Wood),
                new DatePalmTrunkPlacer(6, 3, 3),
                BlockStateProvider.of(GOTBlocks.Date_Palm_Leaves),
                new DatePalmFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), ConstantIntProvider.create(2)),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(Collections.singletonList(DatePalmDecorator.INSTANCE)).build());

        register(context, LARCH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Larch_Wood),
                new StraightTrunkPlacer(6, 6, 6),
                BlockStateProvider.of(GOTBlocks.Larch_Leaves),
                new LarchFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), ConstantIntProvider.create(6)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, MANGROVE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Mangrove_Wood),
                new UpwardsBranchingTrunkPlacer(2, 1, 4, UniformIntProvider.create(1, 4), 0.5f, UniformIntProvider.create(0, 1), registryEntryLookup.getOrThrow(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                BlockStateProvider.of(GOTBlocks.Mangrove_Leaves),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 70),
                Optional.of(new MangroveRootPlacer(UniformIntProvider.create(1, 3), BlockStateProvider.of(Blocks.MANGROVE_ROOTS), Optional.of(new AboveRootPlacement(BlockStateProvider.of(Blocks.MOSS_CARPET), 0.5f)), new MangroveRootPlacement(registryEntryLookup.getOrThrow(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH), RegistryEntryList.of(Block::getRegistryEntry, Blocks.MUD, Blocks.MUDDY_MANGROVE_ROOTS), BlockStateProvider.of(Blocks.MUDDY_MANGROVE_ROOTS), 8, 15, 0.2f))),
                new TwoLayersFeatureSize(2, 0, 2)).decorators(List.of(new LeavesVineTreeDecorator(0.125f))).build());

        register(context, MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Maple_Wood),
                new StraightTrunkPlacer(5, 3, 3),
                BlockStateProvider.of(GOTBlocks.Maple_Leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        //TODO: BAOBAB

        register(context, CEDAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Cedar_Wood),
                new CedarTrunkPlacer(8, 4, 4),
                BlockStateProvider.of(GOTBlocks.Cedar_Leaves),
                new CedarFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, CHESTNUT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Chestnut_Wood),
                new StraightTrunkPlacer(5, 2, 2),
                BlockStateProvider.of(GOTBlocks.Chestnut_Leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, FIR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Fir_Wood),
                new StraightTrunkPlacer(8, 6, 5),
                BlockStateProvider.of(GOTBlocks.Fir_Leaves),
                new FirFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), ConstantIntProvider.create(6)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, LEMON_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Lemon_Wood),
                new StraightTrunkPlacer(5, 3, 3),
                BlockStateProvider.of(GOTBlocks.Lemon_Leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, LIME_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Lime_Wood),
                new StraightTrunkPlacer(5, 3, 3),
                BlockStateProvider.of(GOTBlocks.Lime_Leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, ORANGE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Orange_Wood),
                new StraightTrunkPlacer(5, 3, 3),
                BlockStateProvider.of(GOTBlocks.Orange_Leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Pine_Wood),
                new StraightTrunkPlacer(12, 10, 5),
                BlockStateProvider.of(GOTBlocks.Pine_Leaves),
                new PineFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(8)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, CYPRESS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Cypress_Wood),
                new StraightTrunkPlacer(10, 3, 3),
                BlockStateProvider.of(GOTBlocks.Cypress_Leaves),
                new CypressFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), ConstantIntProvider.create(8)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GIANT_CYPRESS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Cypress_Wood),
                new GiantTrunkPlacer(13, 4, 4),
                BlockStateProvider.of(GOTBlocks.Cypress_Leaves),
                new CypressFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), ConstantIntProvider.create(10)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, MAHOGANY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Mahogany_Wood),
                new MahoganyTrunkPlacer(8, 4, 4),
                BlockStateProvider.of(GOTBlocks.Mahogany_Leaves),
                new MahoganyFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, OLIVE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Olive_Wood),
                new StraightTrunkPlacer(4, 1, 1),
                BlockStateProvider.of(GOTBlocks.Olive_Leaves),
                new OliveFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GIANT_OLIVE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Olive_Wood),
                new DarkOakTrunkPlacer(6, 2, 2),
                BlockStateProvider.of(GOTBlocks.Olive_Leaves),
                new OliveFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, WILLOW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Willow_Wood),
                new WillowTrunkPlacer(8, 3, 2),
                BlockStateProvider.of(GOTBlocks.Willow_Leaves),
                new WillowFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new LeavesVineTreeDecorator(0.25f))).build()); //TODO: WILLOW VINES AFTER FIXED TEXTURES

        register(context, ALMOND_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Almond_Wood),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(GOTBlocks.Almond_Leaves),
                new AlmondFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(3)),
                new TwoLayersFeatureSize(1, 0, 1)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(GOT.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}