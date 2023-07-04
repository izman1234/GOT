package net.isaac.got.common.world.tree.decorator;

import net.isaac.got.GOT;
import net.isaac.got.mixin.TreeDecoratorTypeInvoker;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class GOTDecorator {
    public static final TreeDecoratorType<BananaDecorator> BANANA_DECORATOR = TreeDecoratorTypeInvoker.callRegister("got:banana_decorator", BananaDecorator.CODEC);


    public static void register() {
        GOT.LOGGER.debug("Registering ModDecorator for " + GOT.MOD_ID);
    }
}
