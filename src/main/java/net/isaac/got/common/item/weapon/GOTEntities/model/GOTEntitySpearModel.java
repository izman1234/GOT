package net.isaac.got.common.item.weapon.GOTEntities.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class GOTEntitySpearModel extends Model {
    private final ModelPart bb_main;
    public GOTEntitySpearModel(ModelPart root) {
        super(RenderLayer::getEntitySolid);
        this.bb_main = root.getChild("bb_main");
    }

    public static TexturedModelData getAsshaiSpearTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).mirrored().cuboid(-14.0F, 1.0F, -14.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
                .uv(0, 4).cuboid(-12.0F, 1.0F, -13.0F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-13.0F, 1.0F, -11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-11.0F, 1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 10).cuboid(-10.0F, 1.0F, -12.0F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(9, 0).cuboid(-8.0F, 1.0F, -11.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 16).cuboid(-7.0F, 1.0F, -8.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-6.0F, 1.0F, -9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-7.0F, 1.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-6.0F, 1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-9.0F, 1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-10.0F, 1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(-6.0F, 1.0F, -6.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(-5.0F, 1.0F, -5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(-4.0F, 1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(-3.0F, 1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(-2.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(-1.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(0.0F, 1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(2.0F, 1.0F, 2.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(3.0F, 1.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(4.0F, 1.0F, 4.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(5.0F, 1.0F, 5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(6.0F, 1.0F, 6.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(7.0F, 1.0F, 7.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(8.0F, 1.0F, 8.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(9.0F, 1.0F, 9.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(10.0F, 1.0F, 10.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(11.0F, 1.0F, 11.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(17, 0).cuboid(12.0F, 1.0F, 12.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 12).cuboid(13.0F, 1.0F, 13.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.rotation(4.71239F, 0.0F, 0.785398F)); //-90 0 45
        return TexturedModelData.of(modelData, 32, 32);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild("pole", ModelPartBuilder.create().uv(0, 6).cuboid(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("base", ModelPartBuilder.create().uv(4, 0).cuboid(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("left_spike", ModelPartBuilder.create().uv(4, 3).cuboid(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("middle_spike", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("right_spike", ModelPartBuilder.create().uv(4, 3).mirrored().cuboid(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 32, 32);
    }

    public static TexturedModelData getAtlanTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild("pole", ModelPartBuilder.create().uv(0, 6).cuboid(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("base", ModelPartBuilder.create().uv(4, 0).cuboid(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("left_spike", ModelPartBuilder.create().uv(4, 3).cuboid(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("middle_spike", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("right_spike", ModelPartBuilder.create().uv(4, 3).mirrored().cuboid(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("top_ornament", ModelPartBuilder.create().uv(4, 0).mirrored().cuboid(-1.5F, 3.0F, -0.5F, 3.0F, 1.0F, 1.0F), ModelTransform.NONE);
        modelPartData2.addChild("bottom_ornament", ModelPartBuilder.create().uv(4, 0).mirrored().cuboid(-1.5F, 24.0F, -0.5F, 3.0F, 2.0F, 1.0F), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 32, 32);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.bb_main.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
