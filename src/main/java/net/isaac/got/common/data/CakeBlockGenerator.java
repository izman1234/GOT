package net.isaac.got.common.data;

import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.isaac.got.GOT;

public class CakeBlockGenerator {
    private static final String[] textureTypes = {"bottom", "inner", "side", "top"};

    public static void generateBlockJson(String blockName) {
        // Generate JSON file for the full cake block
        JsonObject blockJson = new JsonObject();
        blockJson.addProperty("parent", "minecraft:block/cake");

        JsonObject texturesJson = new JsonObject();
        texturesJson.addProperty("particle", GOT.MOD_ID + ":block/" + blockName + "_side");
        for (String textureType : textureTypes) {
            String texturePath = GOT.MOD_ID + ":block/" + blockName + "_" + textureType;
            texturesJson.addProperty(textureType, texturePath);
        }
        blockJson.add("textures", texturesJson);

        File file = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + ".json");

        writeJsonToFile(blockName, blockJson, file);

        // Generate JSON files for each cake slice
        for (int i = 1; i <= 6; i++) {
            String sliceName = blockName + "_slice_" + i;
            JsonObject sliceJson = new JsonObject();
            sliceJson.addProperty("parent", "minecraft:block/cake_slice" + i);

            JsonObject sliceTexturesJson = new JsonObject();
            String sliceTexturePath = GOT.MOD_ID + ":block/" + sliceName;
            sliceTexturesJson.addProperty("particle", GOT.MOD_ID + ":block/" + blockName + "_side");
            for (String textureType : textureTypes) {
                String texturePath = GOT.MOD_ID + ":block/" + blockName + "_" + textureType;
                sliceTexturesJson.addProperty(textureType, texturePath);
            }
            sliceJson.add("textures", sliceTexturesJson);
            File sliceFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + sliceName + ".json");


            writeJsonToFile(sliceName, sliceJson, sliceFile);
        }

        //Generate JSON file for item in hand
        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "minecraft:item/generated");

        JsonObject itemTexturesJson = new JsonObject();
        String itemTexturePath = GOT.MOD_ID + ":block/" + blockName;
        itemTexturesJson.addProperty("layer0", GOT.MOD_ID + ":item/" + blockName);
        itemJson.add("textures", itemTexturesJson);
        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + ".json");

        writeJsonToFile(blockName, itemJson, itemFile);


        //Generate JSON file for blockstates
        JsonObject statesJson = new JsonObject();
        JsonObject varientsJson = new JsonObject();
        JsonObject modelJson1 = new JsonObject();
        modelJson1.addProperty("model", "got:block/" + blockName);
        varientsJson.add("bites=0", modelJson1);
        for (int i = 1; i <= 6; i++) {
            JsonObject modelJson = new JsonObject();
            modelJson.addProperty("model", "got:block/" + blockName + "_slice_" + i );
            varientsJson.add("bites=" + i, modelJson);
        }
        statesJson.add("variants", varientsJson);
        File statesFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");

        writeJsonToFile(blockName, statesJson, statesFile);
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