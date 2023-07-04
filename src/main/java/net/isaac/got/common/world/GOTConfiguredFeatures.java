package net.isaac.got.common.world;

import net.isaac.got.GOT;
import net.isaac.got.common.block.GOTBlocks;
import net.isaac.got.common.world.tree.decorator.BananaDecorator;
import net.isaac.got.common.world.tree.decorator.DatePalmDecorator;
import net.isaac.got.common.world.tree.foliage.*;
import net.isaac.got.common.world.tree.trunk.DatePalmTrunkPlacer;
import net.isaac.got.common.world.tree.trunk.UlthosTrunkPlacer;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Collections;

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
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_KEY = registerKey("olive_tree");
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
        register(context, CATALPA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Catalpa_Wood),
                new StraightTrunkPlacer(7, 8, 5),
                BlockStateProvider.of(GOTBlocks.Catalpa_Leaves),
                new CatalpaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, IBBINIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Ibbinia_Wood),
                new StraightTrunkPlacer(8, 6, 3),
                BlockStateProvider.of(GOTBlocks.Ibbinia_Leaves),
                new IbbiniaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(6)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

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
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BANANA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Banana_Wood),
                new StraightTrunkPlacer(4, 1, 2),
                BlockStateProvider.of(GOTBlocks.Banana_Leaves),
                new BananaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(Collections.singletonList(BananaDecorator.INSTANCE)).build());

        register(context, BEECH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Beech_Wood),
                new StraightTrunkPlacer(5, 5, 2),
                BlockStateProvider.of(GOTBlocks.Beech_Leaves),
                new BeechFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, HOLLY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Holly_Wood),
                new StraightTrunkPlacer(10, 4, 3),
                BlockStateProvider.of(GOTBlocks.Holly_Leaves),
                new HollyFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(8)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

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
                new StraightTrunkPlacer(10, 6, 3),
                BlockStateProvider.of(GOTBlocks.Larch_Leaves),
                new LarchFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), ConstantIntProvider.create(6)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, FIR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(GOTBlocks.Fir_Wood),
                new StraightTrunkPlacer(8, 6, 5),
                BlockStateProvider.of(GOTBlocks.Fir_Leaves),
                new FirFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), ConstantIntProvider.create(6)),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(GOT.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
