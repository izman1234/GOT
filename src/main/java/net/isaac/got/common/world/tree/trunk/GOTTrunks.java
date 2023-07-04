package net.isaac.got.common.world.tree.trunk;

import net.isaac.got.GOT;
import net.isaac.got.mixin.TrunkPlacerTypeInvoker;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class GOTTrunks {
    public static final TrunkPlacerType<UlthosTrunkPlacer> ULTHOS_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:ulthos_trunk_placer", UlthosTrunkPlacer.CODEC);
    public static final TrunkPlacerType<RedUlthosTrunkPlacer> RED_ULTHOS_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:red_ulthos_trunk_placer", RedUlthosTrunkPlacer.CODEC);
    public static final TrunkPlacerType<DatePalmTrunkPlacer> DATE_PALM_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("got:date_palm_trunk_placer", DatePalmTrunkPlacer.CODEC);


    public static void register() {
        GOT.LOGGER.debug("Registering ModTrunk for " + GOT.MOD_ID);
    }
}
