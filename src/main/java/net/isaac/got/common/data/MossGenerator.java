package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MossGenerator {

    public static void generateBlockJson(String blockName) {
        JsonObject blockstatesJson = new JsonObject();
        JsonObject variantsJson = new JsonObject();
        JsonObject blankJson = new JsonObject();
        blankJson.addProperty("model", "got:block/" + blockName);
        variantsJson.add("", blankJson);
        blockstatesJson.add("variants", variantsJson);
        File blockstatesFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");
        writeJsonToFile(blockName, blockstatesJson, blockstatesFile);

        JsonObject blockJson = new JsonObject();
        blockJson.addProperty("parent", "block/cube_all");
        JsonObject texturesJson = new JsonObject();
        texturesJson.addProperty("all", "got:block/" + blockName);
        blockJson.add("textures", texturesJson);
        JsonArray elementsArray = new JsonArray();
        JsonObject element = new JsonObject();
        element.add("from", createIntArray(0, 0, 0));
        element.add("to", createIntArray(16, 1, 16));
        JsonObject facesJson = new JsonObject();

        JsonObject downJson = new JsonObject();
        downJson.addProperty("texture", "#all");
        facesJson.add("down", downJson);

        JsonObject upJson = new JsonObject();
        upJson.addProperty("texture", "#all");
        facesJson.add("up", upJson);

        JsonObject northJson = new JsonObject();
        northJson.addProperty("texture", "#all");
        facesJson.add("north", northJson);

        JsonObject southJson = new JsonObject();
        southJson.addProperty("texture", "#all");
        facesJson.add("south", southJson);

        JsonObject westJson = new JsonObject();
        westJson.addProperty("texture", "#all");
        facesJson.add("west", westJson);

        JsonObject eastJson = new JsonObject();
        eastJson.addProperty("texture", "#all");
        facesJson.add("east", eastJson);
        element.add("faces", facesJson);
        elementsArray.add(element);
        blockJson.add("elements", elementsArray);
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

    private static JsonArray createIntArray(int... values) {
        JsonArray jsonArray = new JsonArray();
        for (int value : values) {
            jsonArray.add(value);
        }
        return jsonArray;
    }
}
