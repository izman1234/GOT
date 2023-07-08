package net.isaac.got.common.world.tree.foliage;

import net.isaac.got.GOT;
import net.isaac.got.mixin.FoliagePlacerTypeInvoker;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class GOTFoliage {
    public static final FoliagePlacerType<CatalpaFoliagePlacer> CATALPA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:catalpa_foliage_placer", CatalpaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<IbbiniaFoliagePlacer> IBBINIA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:ibbinia_foliage_placer", IbbiniaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<UlthosFoliagePlacer> ULTHOS_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:ulthos_foliage_placer", UlthosFoliagePlacer.CODEC);
    public static final FoliagePlacerType<RedUlthosFoliagePlacer> RED_ULTHOS_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:red_ulthos_foliage_placer", RedUlthosFoliagePlacer.CODEC);
    public static final FoliagePlacerType<AramantFoliagePlacer> ARAMANT_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:aramant_foliage_placer", AramantFoliagePlacer.CODEC);
    public static final FoliagePlacerType<BananaFoliagePlacer> BANANA_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:banana_foliage_placer", BananaFoliagePlacer.CODEC);
    public static final FoliagePlacerType<BeechFoliagePlacer> BEECH_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:beech_foliage_placer", BeechFoliagePlacer.CODEC);
    public static final FoliagePlacerType<HollyFoliagePlacer> HOLLY_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:holly_foliage_placer", HollyFoliagePlacer.CODEC);
    public static final FoliagePlacerType<DatePalmFoliagePlacer> DATE_PALM_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:date_palm_foliage_placer", DatePalmFoliagePlacer.CODEC);
    public static final FoliagePlacerType<LarchFoliagePlacer> LARCH_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:larch_foliage_placer", LarchFoliagePlacer.CODEC);

    //BAOBAB

    public static final FoliagePlacerType<CedarFoliagePlacer> CEDAR_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:cedar_foliage_placer", CedarFoliagePlacer.CODEC);
    public static final FoliagePlacerType<FirFoliagePlacer> FIR_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:fir_foliage_placer", FirFoliagePlacer.CODEC);
    public static final FoliagePlacerType<PineFoliagePlacer> PINE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:pine_foliage_placer", PineFoliagePlacer.CODEC);
    public static final FoliagePlacerType<CypressFoliagePlacer> CYPRESS_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:cypress_foliage_placer", CypressFoliagePlacer.CODEC);
    public static final FoliagePlacerType<MahoganyFoliagePlacer> MAHOGANY_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:mahogany_foliage_placer", MahoganyFoliagePlacer.CODEC);
    public static final FoliagePlacerType<OliveFoliagePlacer> OLIVE_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:olive_foliage_placer", OliveFoliagePlacer.CODEC);
    public static final FoliagePlacerType<WillowFoliagePlacer> WILLOW_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:willow_foliage_placer", WillowFoliagePlacer.CODEC);
    public static final FoliagePlacerType<AlmondFoliagePlacer> ALMOND_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("got:almond_foliage_placer", AlmondFoliagePlacer.CODEC);




    public static void register() {
        GOT.LOGGER.debug("Registering ModFoliage for " + GOT.MOD_ID);
    }
}
