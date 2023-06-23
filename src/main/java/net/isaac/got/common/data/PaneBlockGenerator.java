package net.isaac.got.common.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.isaac.got.GOT;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PaneBlockGenerator {
    private static final String[] textureTypes = {"_cap", "_cap_alt", "_post", "_post_ends", "_side", "_side_alt"};
    public static void generateBlockJson(String blockName) {

        for (String textureType : textureTypes) {
            JsonObject blockJson = new JsonObject();
            blockJson.addProperty("ambientocclusion", false);

            JsonObject texturesJson = new JsonObject();
            texturesJson.addProperty("particle", "got:block/" + blockName);
            if (textureType != "_post_ends") {
                texturesJson.addProperty("bars", "got:block/" + blockName);
            }
            if(textureType != "_post") {
                texturesJson.addProperty("edge", "got:block/" + blockName);
            }
            blockJson.add("textures", texturesJson);

            JsonArray elementsArray = new JsonArray();
            if(textureType == "_cap") {
                JsonObject element1 = new JsonObject();
                element1.add("from", createIntArray(8, 0, 8));
                element1.add("to", createIntArray(8, 16, 9));

                JsonObject faces1 = new JsonObject();
                faces1.add("west", createFaceJson(createIntArray(8, 0, 7, 16), "#bars"));
                faces1.add("east", createFaceJson(createIntArray(7, 0, 8, 16), "#bars"));

                element1.add("faces", faces1);

                JsonObject element2 = new JsonObject();
                element2.add("from", createIntArray(7, 0, 9));
                element2.add("to", createIntArray(9, 16, 9));

                JsonObject faces2 = new JsonObject();
                faces2.add("north", createFaceJson(createIntArray(9, 0, 7, 16), "#bars"));
                faces2.add("south", createFaceJson(createIntArray(7, 0, 9, 16), "#bars"));

                element2.add("faces", faces2);


                elementsArray.add(element1);
                elementsArray.add(element2);

                blockJson.add("elements", elementsArray);

                File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + textureType + ".json");

                writeJsonToFile(blockName, blockJson, blockFile);
            }
            else if(textureType == "_cap_alt") {
                JsonObject element1 = new JsonObject();
                element1.add("from", createIntArray(8, 0, 7));
                element1.add("to", createIntArray(8, 16, 8));

                JsonObject faces1 = new JsonObject();
                faces1.add("west", createFaceJson(createIntArray(8, 0, 9, 16), "#bars"));
                faces1.add("east", createFaceJson(createIntArray(9, 0, 8, 16), "#bars"));

                element1.add("faces", faces1);

                JsonObject element2 = new JsonObject();
                element2.add("from", createIntArray(7, 0, 7));
                element2.add("to", createIntArray(9, 16, 7));

                JsonObject faces2 = new JsonObject();
                faces2.add("north", createFaceJson(createIntArray(7, 0, 9, 16), "#bars"));
                faces2.add("south", createFaceJson(createIntArray(9, 0, 7, 16), "#bars"));

                element2.add("faces", faces2);


                elementsArray.add(element1);
                elementsArray.add(element2);

                blockJson.add("elements", elementsArray);

                File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + textureType + ".json");

                writeJsonToFile(blockName, blockJson, blockFile);

            }
            else if(textureType == "_post") {
                JsonObject element1 = new JsonObject();
                element1.add("from", createIntArray(8, 0, 7));
                element1.add("to", createIntArray(8, 16, 9));

                JsonObject faces1 = new JsonObject();
                faces1.add("west", createFaceJson(createIntArray(7, 0, 9, 16), "#bars"));
                faces1.add("east", createFaceJson(createIntArray(9, 0, 7, 16), "#bars"));

                element1.add("faces", faces1);

                JsonObject element2 = new JsonObject();
                element2.add("from", createIntArray(7, 0, 8));
                element2.add("to", createIntArray(9, 16, 8));

                JsonObject faces2 = new JsonObject();
                faces2.add("north", createFaceJson(createIntArray(7, 0, 9, 16), "#bars"));
                faces2.add("south", createFaceJson(createIntArray(9, 0, 7, 16), "#bars"));

                element2.add("faces", faces2);


                elementsArray.add(element1);
                elementsArray.add(element2);

                blockJson.add("elements", elementsArray);

                File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + textureType + ".json");

                writeJsonToFile(blockName, blockJson, blockFile);

            }
            else if(textureType == "_post_ends") {
                JsonObject element1 = new JsonObject();
                element1.add("from", createDoubleArray(7, 0.001, 7));
                element1.add("to", createDoubleArray(9, 0.001, 9));

                JsonObject faces1 = new JsonObject();
                faces1.add("down", createFaceJson(createIntArray(7, 7, 9, 9), "#edge"));
                faces1.add("up", createFaceJson(createIntArray(7, 7, 9, 9), "#edge"));

                element1.add("faces", faces1);

                JsonObject element2 = new JsonObject();
                element2.add("from", createDoubleArray(7, 15.999, 7));
                element2.add("to", createDoubleArray(9, 15.999, 9));

                JsonObject faces2 = new JsonObject();
                faces2.add("down", createFaceJson(createIntArray(7, 7, 9, 9), "#edge"));
                faces2.add("up", createFaceJson(createIntArray(7, 7, 9, 9), "#edge"));

                element2.add("faces", faces2);

                elementsArray.add(element1);
                elementsArray.add(element2);

                blockJson.add("elements", elementsArray);

                File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + textureType + ".json");

                writeJsonToFile(blockName, blockJson, blockFile);

            }
            else if(textureType == "_side") {
                JsonObject element1 = new JsonObject();
                element1.add("from", createIntArray(8, 0, 0));
                element1.add("to", createIntArray(8, 16, 8));

                JsonObject faces1 = new JsonObject();
                faces1.add("west", createFaceJson(createIntArray(16, 0, 8, 16), "#bars"));
                faces1.add("east", createFaceJson(createIntArray(8, 0, 16, 16), "#bars"));

                element1.add("faces", faces1);

                elementsArray.add(element1);
                JsonObject element2 = new JsonObject();
                element2.add("from", createIntArray(7, 0, 0));
                element2.add("to", createIntArray(9, 16, 7));

                JsonObject faces2 = new JsonObject();
                JsonObject northFace = new JsonObject();
                northFace.add("uv", createIntArray(7, 0, 9, 16));
                northFace.addProperty("texture", "#edge");
                northFace.addProperty("cullface", "north");

                faces2.add("north", northFace);

                element2.add("faces", faces2);

                elementsArray.add(element2);

                elementsArray.add(element2);
                JsonObject element3 = new JsonObject();
                element3.add("from", createDoubleArray(7, 0.001, 0));
                element3.add("to", createDoubleArray(9, 0.001, 7));

                JsonObject faces3 = new JsonObject();
                faces3.add("down", createFaceJson(createIntArray(9, 0, 7, 7), "#edge"));
                faces3.add("up", createFaceJson(createIntArray(7, 0, 9, 7), "#edge"));

                element3.add("faces", faces3);

                elementsArray.add(element3);
                JsonObject element4 = new JsonObject();
                element4.add("from", createDoubleArray(7, 15.999, 0));
                element4.add("to", createDoubleArray(9, 15.999, 7));

                JsonObject faces4 = new JsonObject();
                faces4.add("down", createFaceJson(createIntArray(9, 0, 7, 7), "#edge"));
                faces4.add("up", createFaceJson(createIntArray(7, 0, 9, 7), "#edge"));

                element4.add("faces", faces4);

                elementsArray.add(element4);

                blockJson.add("elements", elementsArray);

                File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + textureType + ".json");

                writeJsonToFile(blockName, blockJson, blockFile);

            }
            else if(textureType == "_side_alt") {
                JsonObject element1 = new JsonObject();
                element1.add("from", createIntArray(8, 0, 8));
                element1.add("to", createIntArray(8, 16, 16));

                JsonObject faces1 = new JsonObject();
                faces1.add("west", createFaceJson(createIntArray(8, 0, 0, 16), "#bars"));
                faces1.add("east", createFaceJson(createIntArray(0, 0, 8, 16), "#bars"));

                element1.add("faces", faces1);

                JsonObject element2 = new JsonObject();
                element2.add("from", createIntArray(7, 0, 9));
                element2.add("to", createIntArray(9, 16, 16));

                JsonObject faces2 = new JsonObject();
                JsonObject southFace = new JsonObject();
                southFace.add("uv", createIntArray(7, 0, 9, 16));
                southFace.addProperty("texture", "#edge");
                southFace.addProperty("cullface", "south");

                faces2.add("south", southFace);
                faces1.add("down", createFaceJson(createIntArray(9, 9, 7, 16), "#edge"));
                faces1.add("up", createFaceJson(createIntArray(7, 9, 9, 16), "#edge"));

                element2.add("faces", faces2);

                JsonObject element3 = new JsonObject();
                element3.add("from", createDoubleArray(7, 0.001, 9));
                element3.add("to", createDoubleArray(9, 0.001, 16));

                JsonObject faces3 = new JsonObject();
                faces3.add("down", createFaceJson(createIntArray(9, 9, 7, 16), "#edge"));
                faces3.add("up", createFaceJson(createIntArray(7, 9, 9, 16), "#edge"));

                element3.add("faces", faces3);

                JsonObject element4 = new JsonObject();
                element4.add("from", createDoubleArray(7, 15.999, 9));
                element4.add("to", createDoubleArray(9, 15.999, 16));

                JsonObject faces4 = new JsonObject();
                faces4.add("down", createFaceJson(createIntArray(9, 9, 7, 16), "#edge"));
                faces4.add("up", createFaceJson(createIntArray(7, 9, 9, 16), "#edge"));

                element4.add("faces", faces4);

                elementsArray.add(element1);
                elementsArray.add(element2);
                elementsArray.add(element3);
                elementsArray.add(element4);

                blockJson.add("elements", elementsArray);

                File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/block/" + blockName + textureType + ".json");

                writeJsonToFile(blockName, blockJson, blockFile);

            }

        }

        JsonObject blockJson = new JsonObject();

        JsonArray multipartArray = new JsonArray();

        JsonObject part1 = new JsonObject();
        JsonObject apply1 = new JsonObject();
        apply1.addProperty("model", "got:block/asshai_bars_post_ends");
        part1.add("apply", apply1);
        multipartArray.add(part1);

        JsonObject part2 = new JsonObject();
        JsonObject apply2 = new JsonObject();
        apply2.addProperty("model", "got:block/asshai_bars_post");
        JsonObject when2 = new JsonObject();
        when2.addProperty("east", "false");
        when2.addProperty("north", "false");
        when2.addProperty("south", "false");
        when2.addProperty("west", "false");
        part2.add("apply", apply2);
        part2.add("when", when2);
        multipartArray.add(part2);

        JsonObject part3 = new JsonObject();
        JsonObject apply3 = new JsonObject();
        apply3.addProperty("model", "got:block/asshai_bars_cap");
        JsonObject when3 = new JsonObject();
        when3.addProperty("east", "false");
        when3.addProperty("north", "true");
        when3.addProperty("south", "false");
        when3.addProperty("west", "false");
        part3.add("apply", apply3);
        part3.add("when", when3);
        multipartArray.add(part3);

        JsonObject part4 = new JsonObject();
        JsonObject apply4 = new JsonObject();
        apply4.addProperty("model", "got:block/asshai_bars_cap");
        apply4.addProperty("y", 90);
        JsonObject when4 = new JsonObject();
        when4.addProperty("east", "true");
        when4.addProperty("north", "false");
        when4.addProperty("south", "false");
        when4.addProperty("west", "false");
        part4.add("apply", apply4);
        part4.add("when", when4);
        multipartArray.add(part4);

        JsonObject part5 = new JsonObject();
        JsonObject apply5 = new JsonObject();
        apply5.addProperty("model", "got:block/asshai_bars_cap_alt");
        JsonObject when5 = new JsonObject();
        when5.addProperty("east", "false");
        when5.addProperty("north", "false");
        when5.addProperty("south", "true");
        when5.addProperty("west", "false");
        part5.add("apply", apply5);
        part5.add("when", when5);
        multipartArray.add(part5);

        JsonObject part6 = new JsonObject();
        JsonObject apply6 = new JsonObject();
        apply6.addProperty("model", "got:block/asshai_bars_cap_alt");
        apply6.addProperty("y", 90);
        JsonObject when6 = new JsonObject();
        when6.addProperty("east", "false");
        when6.addProperty("north", "false");
        when6.addProperty("south", "false");
        when6.addProperty("west", "true");
        part6.add("apply", apply6);
        part6.add("when", when6);
        multipartArray.add(part6);

        JsonObject part7 = new JsonObject();
        JsonObject apply7 = new JsonObject();
        apply7.addProperty("model", "got:block/asshai_bars_side");
        JsonObject when7 = new JsonObject();
        when7.addProperty("north", "true");
        part7.add("apply", apply7);
        part7.add("when", when7);
        multipartArray.add(part7);

        JsonObject part8 = new JsonObject();
        JsonObject apply8 = new JsonObject();
        apply8.addProperty("model", "got:block/asshai_bars_side");
        apply8.addProperty("y", 90);
        JsonObject when8 = new JsonObject();
        when8.addProperty("east", "true");
        part8.add("apply", apply8);
        part8.add("when", when8);
        multipartArray.add(part8);

        JsonObject part9 = new JsonObject();
        JsonObject apply9 = new JsonObject();
        apply9.addProperty("model", "got:block/asshai_bars_side_alt");
        JsonObject when9 = new JsonObject();
        when9.addProperty("south", "true");
        part9.add("apply", apply9);
        part9.add("when", when9);
        multipartArray.add(part9);

        JsonObject part10 = new JsonObject();
        JsonObject apply10 = new JsonObject();
        apply10.addProperty("model", "got:block/asshai_bars_side_alt");
        apply10.addProperty("y", 90);
        JsonObject when10 = new JsonObject();
        when10.addProperty("west", "true");
        part10.add("apply", apply10);
        part10.add("when", when10);
        multipartArray.add(part10);

        blockJson.add("multipart", multipartArray);

        File blockFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/blockstates/" + blockName + ".json");

        writeJsonToFile(blockName, blockJson, blockFile);

        JsonObject itemJson = new JsonObject();
        itemJson.addProperty("parent", "minecraft:item/generated");
        JsonObject textures = new JsonObject();
        textures.addProperty("layer0", "got:block/asshai_bars");
        itemJson.add("textures", textures);

        File itemFile = new File("C:/MinecraftModding/FirstMod/src/main/resources/assets/got/models/item/" + blockName + ".json");

        writeJsonToFile(blockName, itemJson, itemFile);
    }

    private static JsonObject createFaceJson(JsonArray uv, String texture) {
        JsonObject faceJson = new JsonObject();
        faceJson.add("uv", uv);
        faceJson.addProperty("texture", texture);
        return faceJson;
    }

    private static JsonArray createIntArray(int... values) {
        JsonArray jsonArray = new JsonArray();
        for (int value : values) {
            jsonArray.add(value);
        }
        return jsonArray;
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

    private static JsonArray createDoubleArray(double... values) {
        JsonArray jsonArray = new JsonArray();
        for (double value : values) {
            jsonArray.add(value);
        }
        return jsonArray;
    }
}
