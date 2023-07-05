package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SandStoneGenerator {
    public static void generateBlockJson(String blockName) {
        JsonObject blockStateJson = new JsonObject();
        JsonObject blankJson = new JsonObject();
        JsonObject modelJson = new JsonObject();
        modelJson.addProperty("model", "got:block/" + blockName);
        blankJson.add("", modelJson);
        blockStateJson.add("variants", blankJson);
        File blockstateFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");
        writeJsonToFile(blockName, blockStateJson, blockstateFile);

        JsonObject blockJson = new JsonObject();
        blockJson.addProperty("parent", "minecraft:block/cube_bottom_top");
        JsonObject textureJson = new JsonObject();
        textureJson.addProperty("bottom", "got:block/" + blockName + "_bottom");
        textureJson.addProperty("side", "got:block/" + blockName);
        textureJson.addProperty("top", "got:block/" + blockName + "_top");
        blockJson.add("textures", textureJson);
        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + ".json");
        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName);
        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + ".json");
        writeJsonToFile(blockName, itemJson, itemFile);
    }
    public static void generateSlabJson(String blockName) {
        JsonObject blockStateJson = new JsonObject();
        JsonObject typeJson = new JsonObject();
        JsonObject modelJson1 = new JsonObject();
        JsonObject modelJson2 = new JsonObject();
        JsonObject modelJson3 = new JsonObject();
        modelJson1.addProperty("model", "got:block/" + blockName + "_slab");
        modelJson2.addProperty("model", "got:block/" + blockName);
        modelJson3.addProperty("model", "got:block/" + blockName + "_slab_top");
        typeJson.add("type=bottom", modelJson1);
        typeJson.add("type=double", modelJson2);
        typeJson.add("type=top", modelJson3);
        blockStateJson.add("variants", typeJson);
        File blockstateFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + "_slab.json");
        writeJsonToFile(blockName, blockStateJson, blockstateFile);

        JsonObject blockJson = new JsonObject();
        blockJson.addProperty("parent", "block/slab");
        JsonObject textureJson = new JsonObject();
        textureJson.addProperty("particle", "got:block/" + blockName);
        textureJson.addProperty("bottom", "got:block/" + blockName + "_bottom");
        textureJson.addProperty("side", "got:block/" + blockName);
        textureJson.addProperty("top", "got:block/" + blockName + "_top");
        blockJson.add("textures", textureJson);
        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_slab.json");
        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject blockTopJson = new JsonObject();
        blockTopJson.addProperty("parent", "block/slab_top");
        JsonObject textureTopJson = new JsonObject();
        textureTopJson.addProperty("particle", "got:block/" + blockName);
        textureTopJson.addProperty("bottom", "got:block/" + blockName + "_bottom");
        textureTopJson.addProperty("side", "got:block/" + blockName);
        textureTopJson.addProperty("top", "got:block/" + blockName + "_top");
        blockTopJson.add("textures", textureTopJson);
        File blockTopFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_slab_top.json");
        writeJsonToFile(blockName, blockTopJson, blockTopFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName + "_slab");
        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + "_slab.json");
        writeJsonToFile(blockName, itemJson, itemFile);
    }

    public static void generateStairsJson(String blockName) {
        JsonObject variants = new JsonObject();

        variants.add("facing=east,half=bottom,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 270, "y"));
        variants.add("facing=east,half=bottom,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner"));
        variants.add("facing=east,half=bottom,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 270, "y"));
        variants.add("facing=east,half=bottom,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer"));
        variants.add("facing=east,half=bottom,shape=straight", createVariant("got:block/" + blockName + "_stairs"));

        variants.add("facing=east,half=top,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, "x"));
        variants.add("facing=east,half=top,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, 90));
        variants.add("facing=east,half=top,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, "x"));
        variants.add("facing=east,half=top,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, 90));
        variants.add("facing=east,half=top,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 180, "x"));

        variants.add("facing=north,half=bottom,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, "y"));
        variants.add("facing=north,half=bottom,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 270, "y"));
        variants.add("facing=north,half=bottom,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, "y"));
        variants.add("facing=north,half=bottom,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 270, "y"));
        variants.add("facing=north,half=bottom,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 270, "y"));

        variants.add("facing=north,half=top,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, 270));
        variants.add("facing=north,half=top,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, "x"));
        variants.add("facing=north,half=top,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, 270));
        variants.add("facing=north,half=top,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, "x"));
        variants.add("facing=north,half=top,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 180, 270));

        variants.add("facing=south,half=bottom,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner"));
        variants.add("facing=south,half=bottom,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 90, "y"));
        variants.add("facing=south,half=bottom,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer"));
        variants.add("facing=south,half=bottom,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 90, "y"));
        variants.add("facing=south,half=bottom,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 90, "y"));

        variants.add("facing=south,half=top,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, 90));
        variants.add("facing=south,half=top,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, 180));
        variants.add("facing=south,half=top,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, 90));
        variants.add("facing=south,half=top,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, 180));
        variants.add("facing=south,half=top,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 180, 90));

        variants.add("facing=west,half=bottom,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 90, "y"));
        variants.add("facing=west,half=bottom,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, "y"));
        variants.add("facing=west,half=bottom,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 90, "y"));
        variants.add("facing=west,half=bottom,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, "y"));
        variants.add("facing=west,half=bottom,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 180, "y"));

        variants.add("facing=west,half=top,shape=inner_left", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, 180));
        variants.add("facing=west,half=top,shape=inner_right", createVariant("got:block/" + blockName + "_stairs_inner", true, 180, 270));
        variants.add("facing=west,half=top,shape=outer_left", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, 180));
        variants.add("facing=west,half=top,shape=outer_right", createVariant("got:block/" + blockName + "_stairs_outer", true, 180, 270));
        variants.add("facing=west,half=top,shape=straight", createVariant("got:block/" + blockName + "_stairs", true, 180, 180));

        JsonObject json = new JsonObject();
        json.add("variants", variants);
        String filePath = "C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/";
        String fileName = blockName + "_stairs.json";
        File blockStatesFile = new File(filePath + fileName);
        writeJsonToFile(fileName, json, blockStatesFile);

        JsonObject blockJson = new JsonObject();
        blockJson.addProperty("parent", "block/stairs");
        JsonObject textureJson = new JsonObject();
        textureJson.addProperty("bottom", "got:block/" + blockName + "_bottom");
        textureJson.addProperty("side", "got:block/" + blockName);
        textureJson.addProperty("top", "got:block/" + blockName + "_top");
        blockJson.add("textures", textureJson);
        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_stairs.json");
        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject blockInnerJson = new JsonObject();
        blockInnerJson.addProperty("parent", "block/inner_stairs");
        JsonObject textureInnerJson = new JsonObject();
        textureInnerJson.addProperty("bottom", "got:block/" + blockName + "_bottom");
        textureInnerJson.addProperty("side", "got:block/" + blockName);
        textureInnerJson.addProperty("top", "got:block/" + blockName + "_top");
        blockInnerJson.add("textures", textureInnerJson);
        File blockInnerFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_stairs_inner.json");
        writeJsonToFile(blockName, blockInnerJson, blockInnerFile);

        JsonObject blockOuterJson = new JsonObject();
        blockOuterJson.addProperty("parent", "block/outer_stairs");
        JsonObject textureOuterJson = new JsonObject();
        textureOuterJson.addProperty("bottom", "got:block/" + blockName + "_bottom");
        textureOuterJson.addProperty("side", "got:block/" + blockName);
        textureOuterJson.addProperty("top", "got:block/" + blockName + "_top");
        blockOuterJson.add("textures", textureOuterJson);
        File blockOuterFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_stairs_outer.json");
        writeJsonToFile(blockName, blockOuterJson, blockOuterFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName + "_stairs");
        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + "_stairs.json");
        writeJsonToFile(blockName, itemJson, itemFile);

    }
    private static void writeJsonToFile(String fileName, JsonObject json, File file) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String jsonStr = gson.toJson(json);


        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JsonObject createVariant(String model, boolean uvLock, int rotation, String coord) {
        JsonObject variant = new JsonObject();
        variant.addProperty("model", model);
        variant.addProperty("uvlock", uvLock);
        if(coord == "x") {
            variant.addProperty("x", rotation);
        }
        else {
            variant.addProperty("y", rotation);
        }
        return variant;
    }

    private static JsonObject createVariant(String model) {
        JsonObject variant = new JsonObject();
        variant.addProperty("model", model);
        return variant;
    }

    private static JsonObject createVariant(String model, boolean uvlock, int x, int y) {
        JsonObject variant = new JsonObject();
        variant.addProperty("model", model);
        variant.addProperty("uvlock", uvlock);
        variant.addProperty("x", x);
        variant.addProperty("y", y);
        return variant;
    }
}
