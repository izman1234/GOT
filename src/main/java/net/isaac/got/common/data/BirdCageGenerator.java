package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BirdCageGenerator {
    private static final String[] textureTypes = {"_side", "_base", "_top"};

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
        blockJson.addProperty("parent", "block/cube_all");

        JsonObject textureJson = new JsonObject();
        textureJson.addProperty("particle", "got:block/" + blockName + textureTypes[0]);
        textureJson.addProperty("up", "got:block/" + blockName + textureTypes[2]);
        textureJson.addProperty("down", "got:block/" + blockName + textureTypes[1]);
        textureJson.addProperty("north", "got:block/" + blockName + textureTypes[0]);
        textureJson.addProperty("south", "got:block/" + blockName + textureTypes[0]);
        textureJson.addProperty("west", "got:block/" + blockName + textureTypes[0]);
        textureJson.addProperty("east", "got:block/" + blockName + textureTypes[0]);

        blockJson.add("textures", textureJson);

        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + ".json");

        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName);

        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + ".json");

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
