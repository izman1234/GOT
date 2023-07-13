package net.isaac.got.common.world.tree.foliage;

import net.isaac.got.GOT;
import net.isaac.got.mixin.FoliagePlacerTypeInvoker;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class GOTFoliage {
    public static final FoliagePlacerType<CatalpaFoliagePlacer> CATALPA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:catalpa_foliage_placer", CatalpaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<IbbiniaFoliagePlacer> IBBINIA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:ibbinia_foliage_placer", IbbiniaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<UlthosFoliagePlacer> ULTHOS_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:ulthos_foliage_placer", UlthosFoliagePlacer.CODEC);
    public static final FoliagePlacerType<AramantFoliagePlacer> ARAMANT_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:aramant_foliage_placer", AramantFoliagePlacer.CODEC);
    public static final FoliagePlacerType<BananaFoliagePlacer> BANANA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:banana_foliage_placer", BananaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<BeechFoliagePlacer> BEECH_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:beech_foliage_placer", BeechFoliagePlacer.CODEC);
    public static final FoliagePlacerType<HollyFoliagePlacer> HOLLY_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:holly_foliage_placer", HollyFoliagePlacer.CODEC);
    public static final FoliagePlacerType<DatePalmFoliagePlacer> DATE_PALM_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:date_palm_foliage_placer", DatePalmFoliagePlacer.CODEC);
    public static final FoliagePlacerType<LarchFoliagePlacer> LARCH_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:larch_foliage_placer", LarchFoliagePlacer.CODEC);
    public static final FoliagePlacerType<BaobabFoliagePlacer> BAOBAB_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:baobab_foliage_placer", BaobabFoliagePlacer.CODEC);
    public static final FoliagePlacerType<CedarFoliagePlacer> CEDAR_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:cedar_foliage_placer", CedarFoliagePlacer.CODEC);
    public static final FoliagePlacerType<FirFoliagePlacer> FIR_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:fir_foliage_placer", FirFoliagePlacer.CODEC);
    public static final FoliagePlacerType<PineFoliagePlacer> PINE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:pine_foliage_placer", PineFoliagePlacer.CODEC);
    public static final FoliagePlacerType<CypressFoliagePlacer> CYPRESS_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:cypress_foliage_placer", CypressFoliagePlacer.CODEC);
    public static final FoliagePlacerType<MahoganyFoliagePlacer> MAHOGANY_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:mahogany_foliage_placer", MahoganyFoliagePlacer.CODEC);
    public static final FoliagePlacerType<OliveFoliagePlacer> OLIVE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:olive_foliage_placer", OliveFoliagePlacer.CODEC);
    public static final FoliagePlacerType<WillowFoliagePlacer> WILLOW_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:willow_foliage_placer", WillowFoliagePlacer.CODEC);
    public static final FoliagePlacerType<AlmondFoliagePlacer> ALMOND_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:almond_foliage_placer", AlmondFoliagePlacer.CODEC);
    public static final FoliagePlacerType<AspenFoliagePlacer> ASPEN_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:aspen_foliage_placer", AspenFoliagePlacer.CODEC);
    public static final FoliagePlacerType<RedwoodFoliagePlacer> REDWOOD_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:redwood_foliage_placer", RedwoodFoliagePlacer.CODEC);
    public static final FoliagePlacerType<KanukaFoliagePlacer> KANUKA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:kanuka_foliage_placer", KanukaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<GiantPartyFoliagePlacer> GIANT_PARTY_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:giant_party_foliage_placer", GiantPartyFoliagePlacer.CODEC);
    public static final FoliagePlacerType<MassiveFoliagePlacer> MASSIVE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:massive_foliage_placer", MassiveFoliagePlacer.CODEC);





    public static void register() {
        GOT.LOGGER.debug("Registering ModFoliage for " + GOT.MOD_ID);
    }
}
