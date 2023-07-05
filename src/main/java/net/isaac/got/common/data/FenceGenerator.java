package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FenceGenerator {
    public static void generateBlockJson(String blockName) {
        JsonObject blockStatesJson = new JsonObject();
        JsonArray multipartArray = new JsonArray();
        JsonObject firstElement = new JsonObject();
        JsonObject applyModel = new JsonObject();
        applyModel.addProperty("model", "got:block/" + blockName + "_fence_post");
        firstElement.add("apply", applyModel);
        multipartArray.add(firstElement);
        String[] directions = {"north", "east", "south", "west"};
        int[] rotations = {0, 90, 180, 270};
        for (int i = 0; i < directions.length; i++) {
            JsonObject element = new JsonObject();
            JsonObject applyModelWithRotation = new JsonObject();
            applyModelWithRotation.addProperty("model", "got:block/" + blockName + "_fence_side");
            applyModelWithRotation.addProperty("uvlock", true);
            if(rotations[i] != 0) {
                applyModelWithRotation.addProperty("y", rotations[i]);
            }
            element.add("apply", applyModelWithRotation);

            JsonObject whenCondition = new JsonObject();
            whenCondition.addProperty(directions[i], "true");
            element.add("when", whenCondition);

            multipartArray.add(element);
        }
        blockStatesJson.add("multipart", multipartArray);
        File blockStatesFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + "_fence.json");
        writeJsonToFile(blockName, blockStatesJson, blockStatesFile);

        JsonObject blockPostJson = new JsonObject();
        JsonObject texturesPostJson = new JsonObject();
        blockPostJson.addProperty("parent", "minecraft:block/fence_post");
        texturesPostJson.addProperty("texture", "got:block/" + blockName);
        blockPostJson.add("textures", texturesPostJson);
        File blockPostFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_fence_post.json");
        writeJsonToFile(blockName, blockPostJson, blockPostFile);

        JsonObject blockSideJson = new JsonObject();
        JsonObject texturesSideJson = new JsonObject();
        blockSideJson.addProperty("parent", "minecraft:block/fence_side");
        texturesSideJson.addProperty("texture", "got:block/" + blockName);
        blockSideJson.add("textures", texturesSideJson);
        File blockSideFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_fence_side.json");
        writeJsonToFile(blockName, blockSideJson, blockSideFile);

        JsonObject blockInvJson = new JsonObject();
        JsonObject texturesInvJson = new JsonObject();
        blockInvJson.addProperty("parent", "minecraft:block/fence_inventory");
        texturesInvJson.addProperty("texture", "got:block/" + blockName);
        blockInvJson.add("textures", texturesSideJson);
        File blockInvFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_fence_inventory.json");
        writeJsonToFile(blockName, blockInvJson, blockInvFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName + "_fence_inventory");
        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + "_fence.json");
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
}
