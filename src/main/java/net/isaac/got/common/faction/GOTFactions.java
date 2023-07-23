package net.isaac.got.common.faction;

import java.awt.*;

public class GOTFactions {

    public static float WesterosfactionRed[] = {141.0F, 116.0F, 42.0F, 212.0F, 75.0F, 124.0F, 20.0F, 87.0F, 45.0F, 106.0F, 219.0F, 1.0F, 97.0F, 245.0F};
    public static float WesterosfactionGreen[] = {218.0F, 153.0F, 42.0F, 207.0F, 72.0F, 10.0F, 111.0F, 60.0F, 50.0F, 106.0F, 171.0F, 70.0F, 118.0F, 120.0F};
    public static float WesterosfactionBlue[] = {248.0F, 135.0F, 42.0F, 183.0F, 58.0F, 2.0F, 105.0F, 47.0F, 87.0F, 106.0F, 37.0F, 52.0F,  70.0F, 32.0F};

    public static float WEssosfactionRed[] = {74.0F, 76.0F, 19.0F, 45.0F, 229.0F, 63.0F, 61.0F, 5.0F, 46.0F, 171.0F, 112.0F, 158.0F, 119.0F};
    public static float WEssosfactionGreen[] = {12.0F, 58.0F, 66.0F, 77.0F, 229.0F, 63.0F, 48.0F, 50.0F, 46.0F, 119.0F, 16.0F, 75.0F, 85.0F};
    public static float WEssosfactionBlue[] = {12.0F, 95.0F, 95.0F, 47.0F, 229.0F, 63.0F, 35.0F, 70.0F, 46.0F, 49.0F, 16.0F, 30.0F, 31.0F};

    public static float EEssosfactionRed[] = {78.0F, 152.0F, 75.0F, 194.0F, 60.0F};
    public static float EEssosfactionGreen[] = {58.0F, 89.0F, 92.0F, 144.0F, 53.0F};
    public static float EEssosfactionBlue[] = {38.0F, 22.0F, 66.0F, 51.0F, 63.0F};

    public static float SouthfactionRed[] = {94.0F, 145.0F, 52.0F};
    public static float SouthfactionGreen[] = {106.0F, 26.0F, 58.0F};
    public static float SouthfactionBlue[] = {24.0F, 23.0F, 44.0F};

    /*
    WHITE_WALKER(0x8ddaf8, DimensionRegion.WESTEROS, new GOTMapRegion(550, 550, 500)),
    WILDLING(0x749987, DimensionRegion.WESTEROS, new GOTMapRegion(615, 520, 200)),
    NIGHT_WATCH(0x2A2A2A, DimensionRegion.WESTEROS, new GOTMapRegion(750, 670, 150)),
    NORTH(0xD4CFB7, DimensionRegion.WESTEROS, new GOTMapRegion(670, 930, 400)),
    IRONBORN(0x4b483a, DimensionRegion.WESTEROS, new GOTMapRegion(349, 1323, 129)),
    WESTERLANDS(0x7c0a02, DimensionRegion.WESTEROS, new GOTMapRegion(485, 1540, 200)),
    RIVERLANDS(0x146f69, DimensionRegion.WESTEROS, new GOTMapRegion(675, 1437, 215)),
    HILL_TRIBES(0x573C2F, DimensionRegion.WESTEROS, new GOTMapRegion(842, 1329, 176)),
    ARRYN(0x2D3257, DimensionRegion.WESTEROS, new GOTMapRegion(842, 1329, 176)),
    DRAGONSTONE(0x6A6A6A, DimensionRegion.WESTEROS, new GOTMapRegion(923, 1549, 40)),
    CROWNLANDS(0xDBAB25, DimensionRegion.WESTEROS, new GOTMapRegion(876, 1566, 168)),
    STORMLANDS(0x014634, DimensionRegion.WESTEROS, new GOTMapRegion(820, 1865, 218)),
    REACH(0x617646, DimensionRegion.WESTEROS, new GOTMapRegion(500, 1820, 293)),
    DORNE(0xF57820, DimensionRegion.WESTEROS, new GOTMapRegion(717, 2011, 300)),

    BRAAVOS(0x4A0C0C, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1221, 1351, 137)),
    VOLANTIS(0x4C3A5F, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1553, 1928, 210)),
    PENTOS(0x13425F, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1234, 1566, 172)),
    NORVOS(0x2D4D2F, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1437, 1468, 201)),
    LORATH(0xE5E5E5, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1379, 1354, 119)),
    MYR(0x3F3F3F, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1325, 1797, 223)),
    LYS(0x3D3023, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1204, 2053, 65)),
    QOHOR(0x053246, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1590, 1594, 214)),
    TYROSH(0x2E2E2E, DimensionRegion.WEST_ESSOS, new GOTMapRegion(1110, 1876, 52)),
    GHISCAR(0xAB7731, DimensionRegion.WEST_ESSOS, new GOTMapRegion(2115, 2180, 347)),
    QARTH(0x701010, DimensionRegion.WEST_ESSOS, new GOTMapRegion(2750, 2277, 221)),
    LHAZAR(0x9E4B1E, DimensionRegion.WEST_ESSOS, new GOTMapRegion(2510, 1910, 175)),
    DOTHRAKI(0x77551F, DimensionRegion.WEST_ESSOS, new GOTMapRegion(2270, 1670, 600)),

    IBBEN(0x4E3A26, DimensionRegion.EAST_ESSOS, new GOTMapRegion(2761, 1052, 252)),
    JOGOS(0x985916, DimensionRegion.EAST_ESSOS, new GOTMapRegion(3369, 1651, 460)),
    MOSSOVY(0x4B5C42, DimensionRegion.EAST_ESSOS, new GOTMapRegion(4056, 1480, 400)),
    YI_TI(0xC29033, DimensionRegion.EAST_ESSOS, new GOTMapRegion(3350, 2200, 350)),
    ASSHAI(0x3C353F, DimensionRegion.EAST_ESSOS, new GOTMapRegion(4098, 2331, 644)),

    SOTHORYOS(0x5E6A18, DimensionRegion.OTHER, new GOTMapRegion(2375, 3540, 1084)),
    SUMMER_ISLANDS(0x911A17, DimensionRegion.OTHER, new GOTMapRegion(1228, 2716, 310)),
    ULTHOS(0x343A2C, DimensionRegion.OTHER, new GOTMapRegion(4100, 3517, 1109)),
    */

    public Color factionColor;
    public boolean allowPlayer;
    public boolean approvesWarCrimes;
    public boolean hasFixedAlignment;
    public int fixedAlignment;

    /* ADD CONSTRUCTORS */

}
