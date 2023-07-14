package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GrassBlockGenerator {
    public static void generateBlockJson(String blockName, String block) {
        JsonObject rootJson = new JsonObject();
        JsonObject variantsJson = new JsonObject();
        JsonArray snowyFalseJson = new JsonArray();

        JsonObject variant1 = new JsonObject();
        variant1.addProperty("model", "got:block/" + blockName);
        snowyFalseJson.add(variant1);

        JsonObject variant2 = new JsonObject();
        variant2.addProperty("model", "got:block/" + blockName);
        variant2.addProperty("y", 90);
        snowyFalseJson.add(variant2);

        JsonObject variant3 = new JsonObject();
        variant3.addProperty("model", "got:block/" + blockName);
        variant3.addProperty("y", 180);
        snowyFalseJson.add(variant3);

        JsonObject variant4 = new JsonObject();
        variant4.addProperty("model", "got:block/" + blockName);
        variant4.addProperty("y", 270);
        snowyFalseJson.add(variant4);

        variantsJson.add("snowy=false", snowyFalseJson);

        JsonArray snowyTrueJson = new JsonArray();
        snowyTrueJson.add(variant1);
        snowyTrueJson.add(variant2);
        snowyTrueJson.add(variant3);
        snowyTrueJson.add(variant4);
        variantsJson.add("snowy=true", snowyTrueJson);

        rootJson.add("variants", variantsJson);
        File blockstatesFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");
        writeJsonToFile(blockName, rootJson, blockstatesFile);


        JsonObject blockJson = new JsonObject();

        blockJson.addProperty("parent", "block/block");

        JsonObject texturesJson = new JsonObject();
        texturesJson.addProperty("particle", "got:block/" + block);
        texturesJson.addProperty("bottom", "got:block/" + block);
        texturesJson.addProperty("top", "got:block/" + blockName + "_top");
        texturesJson.addProperty("side", "got:block/" + blockName + "_side");
        texturesJson.addProperty("overlay", "block/grass_block_side_overlay");

        blockJson.add("textures", texturesJson);

        JsonArray elementsJson = new JsonArray();

        JsonObject element1 = new JsonObject();
        element1.add("from", createIntArray(0, 0, 0));
        element1.add("to", createIntArray(16, 16, 16));

        JsonObject face = new JsonObject();

        JsonObject faces1 = new JsonObject();
        faces1.add("uv", createIntArray(0, 0, 16, 16));
        faces1.addProperty("texture", "#bottom");
        faces1.addProperty("cullface", "down");
        face.add("down", faces1);

        JsonObject faces2 = new JsonObject();
        faces2.add("uv", createIntArray(0, 0, 16, 16));
        faces2.addProperty("texture", "#top");
        faces2.addProperty("cullface", "up");
        faces2.addProperty("tintindex", 0);
        face.add("up", faces2);

        JsonObject faces3 = new JsonObject();
        faces3.add("uv", createIntArray(0, 0, 16, 16));
        faces3.addProperty("texture", "#side");
        faces3.addProperty("cullface", "north");
        face.add("north", faces3);

        JsonObject faces4 = new JsonObject();
        faces4.add("uv", createIntArray(0, 0, 16, 16));
        faces4.addProperty("texture", "#side");
        faces4.addProperty("cullface", "south");
        face.add("south", faces4);

        JsonObject faces5 = new JsonObject();
        faces5.add("uv", createIntArray(0, 0, 16, 16));
        faces5.addProperty("texture", "#side");
        faces5.addProperty("cullface", "west");
        face.add("west", faces5);

        JsonObject faces6 = new JsonObject();
        faces6.add("uv", createIntArray(0, 0, 16, 16));
        faces6.addProperty("texture", "#side");
        faces6.addProperty("cullface", "east");
        face.add("east", faces6);
        element1.add("faces", face);

        elementsJson.add(element1);

        /*JsonObject element2 = new JsonObject();
        element2.add("from", createIntArray(0, 0, 0));
        element2.add("to", createIntArray(16, 16, 16));
        JsonObject faceface = new JsonObject();

        JsonObject faces7 = new JsonObject();
        faces7.add("uv", createIntArray(0, 0, 16, 16));
        faces7.addProperty("texture", "#overlay");
        faces7.addProperty("tintindex", 0);
        faces7.addProperty("cullface", "north");
        faceface.add("north", faces7);

        JsonObject faces8 = new JsonObject();
        faces8.add("uv", createIntArray(0, 0, 16, 16));
        faces8.addProperty("texture", "#overlay");
        faces8.addProperty("tintindex", 0);
        faces8.addProperty("cullface", "south");
        faceface.add("south", faces8);

        JsonObject faces9 = new JsonObject();
        faces9.add("uv", createIntArray(0, 0, 16, 16));
        faces9.addProperty("texture", "#overlay");
        faces9.addProperty("tintindex", 0);
        faces9.addProperty("cullface", "west");
        faceface.add("west", faces9);

        JsonObject faces10 = new JsonObject();
        faces10.add("uv", createIntArray(0, 0, 16, 16));
        faces10.addProperty("texture", "#overlay");
        faces10.addProperty("tintindex", 0);
        faces10.addProperty("cullface", "east");
        faceface.add("east", faces10);
        element2.add("faces", faceface);

        elementsJson.add(element2);*/

        blockJson.add("elements", elementsJson);
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
