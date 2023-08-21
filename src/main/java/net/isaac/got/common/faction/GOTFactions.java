package net.isaac.got.common.faction;

import java.awt.*;

public class GOTFactions {

    public static String[][] WesterosFriends = {{""}, {""}, {"", ""}, {"", "", ""}, {""}, {"", "", ""}, {"", ""}, {"", ""}, {"", ""}, {""}, {"", ""}, {""}, {""}, {""}};
    public static String[][] WEssosFriends = {{"", "", ""}, {""}, {""}, {"", "", ""}, {"", "", ""}, {""}, {""}, {"", "", ""}, {""}, {"", "", ""}, {"", "", ""}, {""}, {""}};
    public static String[][] EEssosFriends = {{"", ""}, {""}, {""}, {"", ""}, {"", "", ""}};
    public static String[][] SouthFriends = { {""}, {"", "", ""}, {""}};

    public static String[][] WesterosEnemies;
    public static String[][] WEssosEnemies;
    public static String[][] EEssosEnemies;
    public static String[][] SouthEnemies;

    public static String[] WesterosfactionName = {"White Walkers", "Wildlings", "Night's Watch", "North", "Iron Islands",
            "Westerlands", "Riverlands", "Hill-Tribes", "Arryn Vale", "Dragonstone", "Crownlands", "Stormlands", "Reach", "Dorne"};
    public static float[] WesterosfactionRed = {141.0F, 116.0F, 42.0F, 212.0F, 75.0F, 124.0F, 20.0F, 87.0F, 45.0F, 106.0F, 219.0F, 1.0F, 97.0F, 245.0F};
    public static float[] WesterosfactionGreen = {218.0F, 153.0F, 42.0F, 207.0F, 72.0F, 10.0F, 111.0F, 60.0F, 50.0F, 106.0F, 171.0F, 70.0F, 118.0F, 120.0F};
    public static float[] WesterosfactionBlue = {248.0F, 135.0F, 42.0F, 183.0F, 58.0F, 2.0F, 105.0F, 47.0F, 87.0F, 106.0F, 37.0F, 52.0F,  70.0F, 32.0F};

    public static String[] WEssosfactionName = {"Braavos", "Volantis", "Pentos", "Norvos", "Lorath", "Myr", "Lys", "Qohor", "Tyrosh",
            "Ghiscar", "Qarth", "Lhazar", "Dothraki"};
    public static float[] WEssosfactionRed = {74.0F, 76.0F, 19.0F, 45.0F, 229.0F, 63.0F, 61.0F, 5.0F, 46.0F, 171.0F, 112.0F, 158.0F, 119.0F};
    public static float[] WEssosfactionGreen = {12.0F, 58.0F, 66.0F, 77.0F, 229.0F, 63.0F, 48.0F, 50.0F, 46.0F, 119.0F, 16.0F, 75.0F, 85.0F};
    public static float[] WEssosfactionBlue = {12.0F, 95.0F, 95.0F, 47.0F, 229.0F, 63.0F, 35.0F, 70.0F, 46.0F, 49.0F, 16.0F, 30.0F, 31.0F};

    public static String[] EEssosfactionName = {"Ibben", "Jogos Nhai", "Mossovy", "Yi Ti", "Asshai"};
    public static float[] EEssosfactionRed = {78.0F, 152.0F, 75.0F, 194.0F, 60.0F};
    public static float[] EEssosfactionGreen = {58.0F, 89.0F, 92.0F, 144.0F, 53.0F};
    public static float[] EEssosfactionBlue = {38.0F, 22.0F, 66.0F, 51.0F, 63.0F};

    public static String[] SouthfactionName = {"Sothoryos", "Summer Islands", "Ulthos"};
    public static float[] SouthfactionRed = {94.0F, 145.0F, 52.0F};
    public static float[] SouthfactionGreen = {106.0F, 26.0F, 58.0F};
    public static float[] SouthfactionBlue = {24.0F, 23.0F, 44.0F};

    public static void initFriends() {
        WesterosFriends[0][0] = "• No one";
        WesterosFriends[1][0] = "• Ibben";
        WesterosFriends[2][0] = "• North";
        WesterosFriends[2][1] = "• Dragonstone";
        WesterosFriends[3][0] = "• Night's Watch";
        WesterosFriends[3][1] = "• Riverlands";
        WesterosFriends[3][2] = "• Arryn Vale";
        WesterosFriends[4][0] = "• Westerlands";
        WesterosFriends[5][0] = "• Crownlands";
        WesterosFriends[5][1] = "• Iron Islands";
        WesterosFriends[5][2] = "• Hill-Tribes";
        WesterosFriends[6][0] = "• North";
        WesterosFriends[6][1] = "• Arryn Vale";
        WesterosFriends[7][0] = "• Westerlands";
        WesterosFriends[7][1] = "• Crownlands";
        WesterosFriends[8][0] = "• North";
        WesterosFriends[8][1] = "• Riverlands";
        WesterosFriends[9][0] = "• Night's Watch";
        WesterosFriends[10][0] = "• Westerlands";
        WesterosFriends[10][1] = "• Hill-Tribes";
        WesterosFriends[11][0] = "• Reach";
        WesterosFriends[12][0] = "• Stormlands";
        WesterosFriends[13][0] = "• Summer Islands";

        WEssosFriends[0][0] = "• Norvos";
        WEssosFriends[0][1] = "• Lorath";
        WEssosFriends[0][2] = "• Qohor";
        WEssosFriends[1][0] = "• Ghiscar";
        WEssosFriends[2][0] = "• Myr";
        WEssosFriends[3][0] = "• Braavos";
        WEssosFriends[3][1] = "• Lorath";
        WEssosFriends[3][2] = "• Qohor";
        WEssosFriends[4][0] = "• Braavos";
        WEssosFriends[4][1] = "• Norvos";
        WEssosFriends[4][2] = "• Qohor";
        WEssosFriends[5][0] = "• Pentos";
        WEssosFriends[6][0] = "• Summer Islands";
        WEssosFriends[7][0] = "• Braavos";
        WEssosFriends[7][1] = "• Norvos";
        WEssosFriends[7][2] = "• Lorath";
        WEssosFriends[8][0] = "• Summer Islands";
        WEssosFriends[9][0] = "• Volantis";
        WEssosFriends[9][1] = "• Qarth";
        WEssosFriends[9][2] = "• Lhazar";
        WEssosFriends[10][0] = "• Ghiscar";
        WEssosFriends[10][1] = "• Yi Ti";
        WEssosFriends[10][2] = "• Asshai";
        WEssosFriends[11][0] = "• Ghiscar";
        WEssosFriends[12][0] = "• Jogos Nhai";

        EEssosFriends[0][0] = "• Wildlings";
        WEssosFriends[0][1] = "• Mossovy";
        EEssosFriends[1][0] = "• Dothraki";
        EEssosFriends[2][0] = "• Ibben";
        EEssosFriends[3][0] = "• Qarth";
        EEssosFriends[3][1] = "• Asshai";
        EEssosFriends[4][0] = "• Qarth";
        EEssosFriends[4][1] = "• Yi Ti";
        EEssosFriends[4][2] = "• Ulthos";

        SouthFriends[0][0] = "• No one";
        SouthFriends[1][0] = "• Dorne";
        SouthFriends[1][1] = "• Lys";
        SouthFriends[1][2] = "• Tyrosh";
        SouthFriends[2][0] = "• Ulthos";

    }

}
