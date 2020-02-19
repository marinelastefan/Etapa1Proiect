package map;

import java.util.ArrayList;

public final class Map {
    private int n;
    private int m;
    private char[][] mapMatrix;
    private static Map  instance = null;
    //singleton pentru crearea hartii
    private Map() { }
    public static Map getMap() {
        if (instance == null) {
            instance = new Map();
        }
        return instance;
    }
    //creez harta
    public char[][] createMap(final ArrayList<String> lands, final int nrR, final int nrC) {
        this.n = nrR;
        this.m = nrC;
        this.mapMatrix = new char[nrR][nrC];
        for (int i = 0; i < nrR; i++) {
            for (int j = 0; j < nrC; j++) {
                mapMatrix[i][j] = lands.get(i).charAt(j);
            }
        }
        return mapMatrix;
    }
 }
