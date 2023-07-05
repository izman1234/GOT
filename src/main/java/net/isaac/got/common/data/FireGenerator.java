package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FireGenerator {
    public static void generateBlockJson(String blockName) {
        JsonObject blockStateJson = new JsonObject();
        JsonArray multipartArray = new JsonArray();
        JsonObject firstElement = new JsonObject();
        JsonArray applyArray = new JsonArray();
        applyArray.add(createModelObject("got:block/" + blockName + "_floor0"));
        applyArray.add(createModelObject("got:block/" + blockName + "_floor1"));
        firstElement.add("apply", applyArray);
        firstElement.add("when", createDirectionalWhenObject("false"));
        multipartArray.add(firstElement);

        JsonObject element1 = new JsonObject();
        JsonArray applyArrayWithRotation1 = new JsonArray();
        applyArrayWithRotation1.add(createModelObject("got:block/" + blockName + "_side0"));
        applyArrayWithRotation1.add(createModelObject("got:block/" + blockName + "_side1"));
        applyArrayWithRotation1.add(createModelObject("got:block/" + blockName + "_side_alt0"));
        applyArrayWithRotation1.add(createModelObject("got:block/" + blockName + "_side_alt1"));
        element1.add("apply", applyArrayWithRotation1);
        JsonObject whenJson1 = new JsonObject();
        JsonArray orJson1 = new JsonArray();
        JsonObject partNorth = new JsonObject();
        partNorth.addProperty("north", "true");
        orJson1.add(partNorth);
        JsonObject dirCondition1 = new JsonObject();
        dirCondition1.addProperty("east", "false");
        dirCondition1.addProperty("north", "false");
        dirCondition1.addProperty("south", "false");
        dirCondition1.addProperty("up", "false");
        dirCondition1.addProperty("west", "false");
        orJson1.add(dirCondition1);
        whenJson1.add("OR", orJson1);
        element1.add("when", whenJson1);
        multipartArray.add(element1);

        JsonObject element2 = new JsonObject();
        JsonArray applyArrayWithRotation2 = new JsonArray();
        applyArrayWithRotation2.add(createModelObject("got:block/" + blockName + "_side0"));
        addRotationToModels(applyArrayWithRotation2, 90);
        applyArrayWithRotation2.add(createModelObject("got:block/" + blockName + "_side1"));
        addRotationToModels(applyArrayWithRotation2, 90);
        applyArrayWithRotation2.add(createModelObject("got:block/" + blockName + "_side_alt0"));
        addRotationToModels(applyArrayWithRotation2, 90);
        applyArrayWithRotation2.add(createModelObject("got:block/" + blockName + "_side_alt1"));
        addRotationToModels(applyArrayWithRotation2, 90);
        element2.add("apply", applyArrayWithRotation2);
        JsonObject whenJson2 = new JsonObject();
        JsonArray orJson2 = new JsonArray();
        JsonObject partEast = new JsonObject();
        partEast.addProperty("east", "true");
        orJson2.add(partEast);
        JsonObject dirCondition2 = new JsonObject();
        dirCondition2.addProperty("east", "false");
        dirCondition2.addProperty("north", "false");
        dirCondition2.addProperty("south", "false");
        dirCondition2.addProperty("up", "false");
        dirCondition2.addProperty("west", "false");
        orJson2.add(dirCondition2);
        whenJson2.add("OR", orJson2);
        element2.add("when", whenJson2);
        multipartArray.add(element2);

        JsonObject element3 = new JsonObject();
        JsonArray applyArrayWithRotation3 = new JsonArray();
        applyArrayWithRotation3.add(createModelObject("got:block/" + blockName + "_side0"));
        addRotationToModels(applyArrayWithRotation3, 180);
        applyArrayWithRotation3.add(createModelObject("got:block/" + blockName + "_side1"));
        addRotationToModels(applyArrayWithRotation3, 180);
        applyArrayWithRotation3.add(createModelObject("got:block/" + blockName + "_side_alt0"));
        addRotationToModels(applyArrayWithRotation3, 180);
        applyArrayWithRotation3.add(createModelObject("got:block/" + blockName + "_side_alt1"));
        addRotationToModels(applyArrayWithRotation3, 180);
        element3.add("apply", applyArrayWithRotation3);
        JsonObject whenJson3 = new JsonObject();
        JsonArray orJson3 = new JsonArray();
        JsonObject partSouth = new JsonObject();
        partSouth.addProperty("south", "true");
        orJson3.add(partSouth);
        JsonObject dirCondition3 = new JsonObject();
        dirCondition3.addProperty("east", "false");
        dirCondition3.addProperty("north", "false");
        dirCondition3.addProperty("south", "false");
        dirCondition3.addProperty("up", "false");
        dirCondition3.addProperty("west", "false");
        orJson3.add(dirCondition3);
        whenJson3.add("OR", orJson3);
        element3.add("when", whenJson3);
        multipartArray.add(element3);

        JsonObject element4 = new JsonObject();
        JsonArray applyArrayWithRotation4 = new JsonArray();
        applyArrayWithRotation4.add(createModelObject("got:block/" + blockName + "_side0"));
        addRotationToModels(applyArrayWithRotation4, 270);
        applyArrayWithRotation4.add(createModelObject("got:block/" + blockName + "_side1"));
        addRotationToModels(applyArrayWithRotation4, 270);
        applyArrayWithRotation4.add(createModelObject("got:block/" + blockName + "_side_alt0"));
        addRotationToModels(applyArrayWithRotation4, 270);
        applyArrayWithRotation4.add(createModelObject("got:block/" + blockName + "_side_alt1"));
        addRotationToModels(applyArrayWithRotation4, 270);
        element4.add("apply", applyArrayWithRotation4);
        JsonObject whenJson4 = new JsonObject();
        JsonArray orJson4 = new JsonArray();
        JsonObject partWest = new JsonObject();
        partWest.addProperty("west", "true");
        orJson4.add(partWest);
        JsonObject dirCondition4 = new JsonObject();
        dirCondition4.addProperty("east", "false");
        dirCondition4.addProperty("north", "false");
        dirCondition4.addProperty("south", "false");
        dirCondition4.addProperty("up", "false");
        dirCondition4.addProperty("west", "false");
        orJson4.add(dirCondition4);
        whenJson4.add("OR", orJson4);
        element4.add("when", whenJson4);
        multipartArray.add(element4);

        JsonObject element5 = new JsonObject();
        JsonArray applyArrayWithRotation5 = new JsonArray();
        applyArrayWithRotation5.add(createModelObject("got:block/" + blockName + "_up0"));
        applyArrayWithRotation5.add(createModelObject("got:block/" + blockName + "_up1"));
        applyArrayWithRotation5.add(createModelObject("got:block/" + blockName + "_up_alt0"));
        applyArrayWithRotation5.add(createModelObject("got:block/" + blockName + "_up_alt1"));
        element5.add("apply", applyArrayWithRotation5);
        JsonObject when = new JsonObject();
        when.addProperty("up", "true");
        element5.add("when", when);
        multipartArray.add(element5);

        blockStateJson.add("multipart", multipartArray);
        File blockstateFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");
        writeJsonToFile(blockName, blockStateJson, blockstateFile);

        JsonObject floor0Json = new JsonObject();
        JsonObject floor0TexturesJson = new JsonObject();
        floor0Json.addProperty("parent", "minecraft:block/template_fire_floor");
        floor0TexturesJson.addProperty("fire", "got:block/" + blockName + "_0");
        floor0Json.add("textures", floor0TexturesJson);
        File floor0File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_floor0.json");
        writeJsonToFile(blockName, floor0Json, floor0File);

        JsonObject floor1Json = new JsonObject();
        JsonObject floor1TexturesJson = new JsonObject();
        floor1Json.addProperty("parent", "minecraft:block/template_fire_floor");
        floor1TexturesJson.addProperty("fire", "got:block/" + blockName + "_1");
        floor1Json.add("textures", floor1TexturesJson);
        File floor1File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_floor1.json");
        writeJsonToFile(blockName, floor1Json, floor1File);

        JsonObject sideAlt0Json = new JsonObject();
        JsonObject sideAlt0TexturesJson = new JsonObject();
        sideAlt0Json.addProperty("parent", "minecraft:block/template_fire_side_alt");
        sideAlt0TexturesJson.addProperty("fire", "got:block/" + blockName + "_0");
        sideAlt0Json.add("textures", sideAlt0TexturesJson);
        File sideAlt0File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_side_alt0.json");
        writeJsonToFile(blockName, sideAlt0Json, sideAlt0File);

        JsonObject sideAlt1Json = new JsonObject();
        JsonObject sideAlt1TexturesJson = new JsonObject();
        sideAlt1Json.addProperty("parent", "minecraft:block/template_fire_side_alt");
        sideAlt1TexturesJson.addProperty("fire", "got:block/" + blockName + "_1");
        sideAlt1Json.add("textures", sideAlt1TexturesJson);
        File sideAlt1File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_side_alt1.json");
        writeJsonToFile(blockName, sideAlt1Json, sideAlt1File);

        JsonObject side0Json = new JsonObject();
        JsonObject side0TexturesJson = new JsonObject();
        side0Json.addProperty("parent", "minecraft:block/template_fire_side");
        side0TexturesJson.addProperty("fire", "got:block/" + blockName + "_0");
        side0Json.add("textures", side0TexturesJson);
        File side0File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_side0.json");
        writeJsonToFile(blockName, side0Json, side0File);

        JsonObject side1Json = new JsonObject();
        JsonObject side1TexturesJson = new JsonObject();
        side1Json.addProperty("parent", "minecraft:block/template_fire_side");
        side1TexturesJson.addProperty("fire", "got:block/" + blockName + "_1");
        side1Json.add("textures", side1TexturesJson);
        File side1File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_side1.json");
        writeJsonToFile(blockName, side1Json, side1File);

        JsonObject upAlt0Json = new JsonObject();
        JsonObject upAlt0TexturesJson = new JsonObject();
        upAlt0Json.addProperty("parent", "minecraft:block/template_fire_alt");
        upAlt0TexturesJson.addProperty("fire", "got:block/" + blockName + "_0");
        upAlt0Json.add("textures", upAlt0TexturesJson);
        File upAlt0File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_up_alt0.json");
        writeJsonToFile(blockName, upAlt0Json, upAlt0File);

        JsonObject upAlt1Json = new JsonObject();
        JsonObject upAlt1TexturesJson = new JsonObject();
        upAlt1Json.addProperty("parent", "minecraft:block/template_fire_alt");
        upAlt1TexturesJson.addProperty("fire", "got:block/" + blockName + "_1");
        upAlt1Json.add("textures", upAlt1TexturesJson);
        File upAlt1File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_up_alt1.json");
        writeJsonToFile(blockName, upAlt1Json, upAlt1File);

        JsonObject up0Json = new JsonObject();
        JsonObject up0TexturesJson = new JsonObject();
        up0Json.addProperty("parent", "minecraft:block/template_fire_up");
        up0TexturesJson.addProperty("fire", "got:block/" + blockName + "_0");
        up0Json.add("textures", up0TexturesJson);
        File up0File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_up0.json");
        writeJsonToFile(blockName, up0Json, up0File);

        JsonObject up1Json = new JsonObject();
        JsonObject up1TexturesJson = new JsonObject();
        up1Json.addProperty("parent", "minecraft:block/template_fire_up");
        up1TexturesJson.addProperty("fire", "got:block/" + blockName + "_1");
        up1Json.add("textures", up1TexturesJson);
        File up1File = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + "_up1.json");
        writeJsonToFile(blockName, up1Json, up1File);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "got:block/" + blockName + "floor1");
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

    private static JsonObject createModelObject(String modelName) {
        JsonObject modelObject = new JsonObject();
        modelObject.addProperty("model", modelName);
        return modelObject;
    }

    private static void addRotationToModels(JsonArray applyArray, int rotation) {
        for (int i = 0; i < applyArray.size(); i++) {
            JsonObject modelObject = applyArray.get(i).getAsJsonObject();
            modelObject.addProperty("y", rotation);
        }
    }

    private static JsonObject createDirectionalWhenObject(String value) {
        JsonObject whenObject = new JsonObject();
        whenObject.addProperty("east", value);
        whenObject.addProperty("north", value);
        whenObject.addProperty("south", value);
        whenObject.addProperty("up", value);
        whenObject.addProperty("west", value);
        return whenObject;
    }
}
