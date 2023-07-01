package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.VariantsBlockStateSupplier;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FarmlandGenerator {
    public static void generateBlockJson(String blockName, String block) {
        JsonObject blockStateJson = new JsonObject();
        JsonObject variantsJson = new JsonObject();
        JsonObject modelJson = new JsonObject();
        JsonObject model2Json = new JsonObject();
        modelJson.addProperty("model", "got:block/" + blockName);
        model2Json.addProperty("model", "got:block/" + blockName + "_moist");
        variantsJson.add("moisture=0", modelJson);
        variantsJson.add("moisture=1", modelJson);
        variantsJson.add("moisture=2", modelJson);
        variantsJson.add("moisture=3", modelJson);
        variantsJson.add("moisture=4", modelJson);
        variantsJson.add("moisture=5", modelJson);
        variantsJson.add("moisture=6", modelJson);
        variantsJson.add("moisture=7", model2Json);
        blockStateJson.add("variants", variantsJson);
        File blockstateFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");
        writeJsonToFile(blockName, blockStateJson, blockstateFile);

        JsonObject blockJson = new JsonObject();
        blockJson.addProperty("parent", "minecraft:block/template_farmland");
        JsonObject textureJson = new JsonObject();
        textureJson.addProperty("dirt", "got:block/" + block);
        textureJson.addProperty("top", "got:block/" + blockName);
        blockJson.add("textures", textureJson);
        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + ".json");
        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject block2Json = new JsonObject();
        block2Json.addProperty("parent", "minecraft:block/template_farmland");
        JsonObject texture2Json = new JsonObject();
        texture2Json.addProperty("dirt", "got:block/" + block);
        texture2Json.addProperty("top", "got:block/" + blockName);
        block2Json.add("textures", textureJson);
        File block2File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_moist.json");
        writeJsonToFile(blockName, block2Json, block2File);

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
