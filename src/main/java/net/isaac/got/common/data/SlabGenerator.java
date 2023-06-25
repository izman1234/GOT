package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SlabGenerator {

    public static void generateBlockJson(String blockName) {
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
        textureJson.addProperty("bottom", "got:block/" + blockName);
        textureJson.addProperty("side", "got:block/" + blockName);
        textureJson.addProperty("top", "got:block/" + blockName);

        blockJson.add("textures", textureJson);

        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_slab.json");

        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject blockTopJson = new JsonObject();
        blockTopJson.addProperty("parent", "block/slab_top");

        JsonObject textureTopJson = new JsonObject();
        textureTopJson.addProperty("particle", "got:block/" + blockName);
        textureTopJson.addProperty("bottom", "got:block/" + blockName);
        textureTopJson.addProperty("side", "got:block/" + blockName);
        textureTopJson.addProperty("top", "got:block/" + blockName);

        blockTopJson.add("textures", textureTopJson);

        File blockTopFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_slab_top.json");

        writeJsonToFile(blockName, blockTopJson, blockTopFile);


        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName + "_slab");

        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + "_slab.json");

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
