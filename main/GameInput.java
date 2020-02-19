package main;


import java.util.ArrayList;

public final class GameInput {
    private final ArrayList<String> lands;
    private final ArrayList<String> movements;
    private final ArrayList<String> heroes;
    private final int[] initialPosX;
    private final int[] initialPosY;
    private final int numberOfPlayers;
    private final int rounds;
    private final int nDimenssion;
    private final int mDimenssion;
    private final ArrayList<Integer> numberOfAngels;
    private final ArrayList<String> angels;


    public GameInput() {
        lands = null;
        movements = null;
        heroes = null;
        initialPosX = null;
        initialPosY = null;
        numberOfPlayers = -1;
        rounds = -1;
        nDimenssion = -1;
        mDimenssion = -1;
        numberOfAngels = null;
        angels = null;
    }

    public GameInput(final int firstDimenssion, final int secondDimenssion,
                     final ArrayList<String> lands,
                     final int numberOfPlayers, final ArrayList<String> heroes,
                     final int[] initialPosX,
                     final int[] initialPosY, final int rounds, final ArrayList<String> movements,
                     final ArrayList<Integer> numberOfAngels, final ArrayList<String> angels) {
        this.lands = lands;
        this.movements = movements;
        this.heroes = heroes;
        this.numberOfPlayers = numberOfPlayers;
        this.rounds = rounds;
        this.nDimenssion = firstDimenssion;
        this.mDimenssion = secondDimenssion;
        this.initialPosY = initialPosY;
        this.initialPosX = initialPosX;
        this.numberOfAngels = numberOfAngels;
        this.angels = angels;
    }

    public ArrayList<String> getAngels() {
        return angels;
    }

    public int getMDimenssion() {
        return mDimenssion;
    }

    public int getNDimenssion() {
        return nDimenssion;
    }

    public int getRounds() {
        return rounds;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public ArrayList<String> getHeroes() {
        return heroes;
    }

    public ArrayList<String> getMovements() {
        return movements;
    }

    public ArrayList<String> getLands() {
        return lands;
    }

    public int[] getInitialPosX() {
        return initialPosX;
    }

    public int[] getInitialPosY() {
        return initialPosY;
    }

    public int getnDimenssion() {
        return nDimenssion;
    }

    public int getmDimenssion() {
        return mDimenssion;
    }

    public ArrayList<Integer> getNumberOfAngels() {
        return numberOfAngels;
    }


}
