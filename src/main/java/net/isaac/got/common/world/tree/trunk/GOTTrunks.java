package net.isaac.got.common.world.tree.trunk;

import net.isaac.got.GOT;
import net.isaac.got.mixin.TrunkPlacerTypeInvoker;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class GOTTrunks {
    public static final TrunkPlacerType<UlthosTrunkPlacer> ULTHOS_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:ulthos_trunk_placer", UlthosTrunkPlacer.CODEC);
    public static final TrunkPlacerType<DatePalmTrunkPlacer> DATE_PALM_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:date_palm_trunk_placer", DatePalmTrunkPlacer.CODEC);
    public static final TrunkPlacerType<BaobabTrunkPlacer> BAOBAB_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:baobab_trunk_placer", BaobabTrunkPlacer.CODEC);
    public static final TrunkPlacerType<CedarTrunkPlacer> CEDAR_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:cedar_trunk_placer", CedarTrunkPlacer.CODEC);
    public static final TrunkPlacerType<MahoganyTrunkPlacer> MAHOGANY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:mahogany_trunk_placer", MahoganyTrunkPlacer.CODEC);
    public static final TrunkPlacerType<WillowTrunkPlacer> WILLOW_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:willow_trunk_placer", WillowTrunkPlacer.CODEC);
    public static final TrunkPlacerType<RedwoodTrunkPlacer> REDWOOD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:redwood_trunk_placer", RedwoodTrunkPlacer.CODEC);
    public static final TrunkPlacerType<GiantRedwoodTrunkPlacer> GIANT_REDWOOD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:giant_redwood_trunk_placer", GiantRedwoodTrunkPlacer.CODEC);
    public static final TrunkPlacerType<KanukaTrunkPlacer> KANUKA_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:kanuka_trunk_placer", KanukaTrunkPlacer.CODEC);
    public static final TrunkPlacerType<GiantPartyTrunkPlacer> GIANT_PARTY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:giant_party_trunk_placer", GiantPartyTrunkPlacer.CODEC);
    public static final TrunkPlacerType<MassiveTrunkPlacer> MASSIVE_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:massive_trunk_placer", MassiveTrunkPlacer.CODEC);


    public static void register() {
        GOT.LOGGER.debug("Registering ModTrunk for " + GOT.MOD_ID);
    }
}
