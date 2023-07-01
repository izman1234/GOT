package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlateBlockGenerator {

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
        blockJson.addProperty("parent", "block/cube_bottom_top");
        JsonObject texturesJson = new JsonObject();
        texturesJson.addProperty("bottom", "got:block/" + blockName + "_base");
        texturesJson.addProperty("top", "got:block/" + blockName + "_top");
        texturesJson.addProperty("side", "got:block/" + blockName + "_base");
        blockJson.add("textures", texturesJson);
        JsonArray elementsArray = new JsonArray();
        JsonObject element = new JsonObject();
        element.add("from", createIntArray(2, 0, 2));
        element.add("to", createIntArray(14, 1, 14));
        JsonObject facesJson = new JsonObject();

        JsonObject downJson = new JsonObject();
        downJson.addProperty("texture", "#bottom");
        downJson.addProperty("cullface", "down");
        facesJson.add("down", downJson);

        JsonObject upJson = new JsonObject();
        upJson.addProperty("texture", "#top");
        upJson.addProperty("cullface", "up");
        facesJson.add("up", upJson);

        JsonObject northJson = new JsonObject();
        northJson.addProperty("texture", "#side");
        northJson.addProperty("cullface", "north");
        facesJson.add("north", northJson);

        JsonObject southJson = new JsonObject();
        southJson.addProperty("texture", "#side");
        southJson.addProperty("cullface", "south");
        facesJson.add("south", southJson);

        JsonObject westJson = new JsonObject();
        westJson.addProperty("texture", "#side");
        westJson.addProperty("cullface", "west");
        facesJson.add("west", westJson);

        JsonObject eastJson = new JsonObject();
        eastJson.addProperty("texture", "#side");
        eastJson.addProperty("cullface", "east");
        facesJson.add("east", eastJson);
        element.add("faces", facesJson);
        elementsArray.add(element);
        blockJson.add("elements", elementsArray);
        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + ".json");
        writeJsonToFile(blockName, blockJson, blockFile);




        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "minecraft:item/generated");
        JsonObject textureItemJson = new JsonObject();
        textureItemJson.addProperty("layer0", "got:item/" + blockName);
        itemJson.add("textures", textureItemJson);
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
