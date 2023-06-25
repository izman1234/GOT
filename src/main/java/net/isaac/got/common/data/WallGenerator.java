package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WallGenerator {

    public static void generateBlockJson(String blockName) {

        JsonObject blockStatesJson = new JsonObject();
        JsonArray multipartArray = new JsonArray();

        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_post", createWhen("up", "true")));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side", createWhen("north", "low"), true));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side", createWhen("east", "low"), true, 90));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side", createWhen("south", "low"), true, 180));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side", createWhen("west", "low"), true, 270));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side_tall", createWhen("north", "tall"), true));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side_tall", createWhen("east", "tall"), true, 90));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side_tall", createWhen("south", "tall"), true, 180));
        multipartArray.add(createMultipart("got:block/" + blockName + "_wall_side_tall", createWhen("west", "tall"), true, 270));

        blockStatesJson.add("multipart", multipartArray);

        File blockStatesFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + "_wall.json");

        writeJsonToFile(blockName, blockStatesJson, blockStatesFile);

        JsonObject blockInvJson = new JsonObject();
        blockInvJson.addProperty("parent", "block/wall_inventory");

        JsonObject textureInvJson = new JsonObject();
        textureInvJson.addProperty("wall", "got:block/" + blockName);

        blockInvJson.add("textures", textureInvJson);

        File blockInvFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_wall_inventory.json");

        writeJsonToFile(blockName, blockInvJson, blockInvFile);

        JsonObject blockPostJson = new JsonObject();
        blockPostJson.addProperty("parent", "block/template_wall_post");

        JsonObject texturePostJson = new JsonObject();
        texturePostJson.addProperty("wall", "got:block/" + blockName);

        blockPostJson.add("textures", texturePostJson);

        File blockPostFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_wall_post.json");

        writeJsonToFile(blockName, blockPostJson, blockPostFile);

        JsonObject blockSideJson = new JsonObject();
        blockSideJson.addProperty("parent", "block/template_wall_side");

        JsonObject textureSideJson = new JsonObject();
        textureSideJson.addProperty("wall", "got:block/" + blockName);

        blockSideJson.add("textures", textureSideJson);

        File blockSideFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_wall_side.json");

        writeJsonToFile(blockName, blockSideJson, blockSideFile);

        JsonObject blockSideTallJson = new JsonObject();
        blockSideJson.addProperty("parent", "block/template_wall_side_tall");

        JsonObject textureSideTallJson = new JsonObject();
        textureSideTallJson.addProperty("wall", "got:block/" + blockName);

        blockSideTallJson.add("textures", textureSideJson);

        File blockSideTallFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_wall_side_tall.json");

        writeJsonToFile(blockName, blockSideTallJson, blockSideTallFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName + "_wall_inventory");

        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + "_wall.json");

        writeJsonToFile(blockName, itemJson, itemFile);
    }

    private static JsonObject createMultipart(String model, JsonObject when) {
        return createMultipart(model, when, false, 0);
    }

    private static JsonObject createMultipart(String model, JsonObject when, boolean uvlock) {
        return createMultipart(model, when, uvlock, 0);
    }

    private static JsonObject createMultipart(String model, JsonObject when, boolean uvlock, int y) {
        JsonObject multipart = new JsonObject();
        JsonObject apply = new JsonObject();
        apply.addProperty("model", model);
        if (uvlock) {
            apply.addProperty("uvlock", true);
        }
        if (y != 0) {
            apply.addProperty("y", y);
        }
        multipart.add("apply", apply);
        multipart.add("when", when);
        return multipart;
    }

    private static JsonObject createWhen(String direction, String value) {
        JsonObject when = new JsonObject();
        when.addProperty(direction, value);
        return when;
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
