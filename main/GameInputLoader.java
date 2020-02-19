package main;

import fileio.FileSystem;
import java.util.ArrayList;

public final class GameInputLoader {
    private final String mInputPath;
    private final String mOutputPath;
    GameInputLoader(final String inputPath, final String outputPath) {
        mInputPath = inputPath;
        mOutputPath = outputPath;
    }
    public GameInput load() {
        int nDimenssion = -1;
        int mDimenssion = -1;
       ArrayList<String> lands = new ArrayList<>();
        int numberOfHeroes = 0;
        ArrayList<String> heroes = new ArrayList<>();
        //doi vectori in care voi stoca pozitiile intiale ale
        //fiecarui tip de erou
        int[] initialPosX = new int[0];
        int[] initialPosY = new int[0];
        int numberOfRounds = 0;
        ArrayList<String> movements = new ArrayList<>();
       ArrayList<Integer> numberOfAngels = new ArrayList<>();
       ArrayList<String> angels = new ArrayList<>();

        try {
            FileSystem fs  = new FileSystem(mInputPath, mOutputPath);
            nDimenssion = fs.nextInt();
            mDimenssion = fs.nextInt();
            for (int i = 0; i < nDimenssion; i++) {
                lands.add(fs.nextWord());
            }
            numberOfHeroes = fs.nextInt();
            initialPosX = new int[numberOfHeroes];
            initialPosY = new int[numberOfHeroes];
            for (int i = 0; i < numberOfHeroes; i++) {
                heroes.add(fs.nextWord());
                initialPosX[i] = fs.nextInt();
                initialPosY[i] = fs.nextInt();
            }
            numberOfRounds = fs.nextInt();
            for (int i = 0; i < numberOfRounds; i++) {
                movements.add(fs.nextWord());

            }
            for (int k = 0; k < numberOfRounds; k++) {
                numberOfAngels.add(fs.nextInt());
                for (int i = 0; i < numberOfAngels.get(k); i++) {
                    angels.add(fs.nextWord());
                }
            }
            fs.close();
        }  catch (Exception e1) {
            e1.printStackTrace();
        }
        return new GameInput(nDimenssion, mDimenssion, lands, numberOfHeroes, heroes, initialPosX,
                initialPosY, numberOfRounds, movements, numberOfAngels, angels);

    }

}
