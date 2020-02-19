package main;
import abilities.Abilities;
import admin.AngelObserver;
import admin.HeroesObserver;
import admin.LevelUpObserver;
import admin.PositionObserver;
import angels.Angels;
import angels.AngelsFactory;
import angels.Subject;
import constants.Constants;
import heroes.Heroes;
import heroes.HeroesFactory;
import map.Map;
import movements.Movements;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public final class Main {
    private Main() {
        // just to trick checkstyle
    }
    public static void main(final String[] args) {
        GameInputLoader gameInputLoader = new GameInputLoader(args[0], args[1]);
        GameInput gameInput = gameInputLoader.load();
        int nDimenssion = gameInput.getNDimenssion();
        int mDimenssion = gameInput.getMDimenssion();
        Map map = Map.getMap();
        char[][] mapMatrix = map.createMap(gameInput.getLands(), nDimenssion, mDimenssion);
        int numberOfHeroes = gameInput.getNumberOfPlayers();
        ArrayList<String> typeOfHeroes = gameInput.getHeroes();
        int[] xPositions = gameInput.getInitialPosX();
        int[] yPositions = gameInput.getInitialPosY();
        HeroesFactory factory = HeroesFactory.getFactory();
        AngelsFactory angelsFactory = AngelsFactory.getAngelsFactory();
        LinkedList<Heroes> heroes = new LinkedList<Heroes>();
        LinkedList<Angels> angels = new LinkedList<>();
        ArrayList<String> inputAngels = gameInput.getAngels();
        ArrayList<String> typeOfAngels = new ArrayList<>();
        int[][] angelRowPos = new int[Constants.MAXIMUM][Constants.MAXIMUM];
        int[][] angelColPos = new int[Constants.MAXIMUM][Constants.MAXIMUM];
        for (int i = 0; i < inputAngels.size(); i++) {
            ArrayList<String> strings =
                    new ArrayList<>(Arrays.asList(inputAngels.get(i).split(",")));
            typeOfAngels.add(strings.get(0));
            angelRowPos[i][0] = Integer.parseInt(strings.get(1));
            angelColPos[i][0] = Integer.parseInt(strings.get(2));

        }
        //creez eroii
        for (int i = 0; i < numberOfHeroes; i++) {
            heroes.add(factory.createHeroes(typeOfHeroes.get(i), xPositions[i], yPositions[i]));
            heroes.get(i).setId(i);
        }
        ArrayList<String> movements = gameInput.getMovements();
        Movements movement = new Movements();
        Abilities abilities = new Abilities();
        ArrayList<Integer> numberOfAngels = gameInput.getNumberOfAngels();
        Subject subject = new Subject();
        LevelUpObserver levelUpObserver = new LevelUpObserver(subject);
        int angelsContor = 0;
        try {
            PrintStream file = new PrintStream(args[1]);
            System.setOut(file);
         for (int k = 0; k < gameInput.getRounds(); k++) {
            int round = k + 1;
            System.out.println("~~ Round " + round + " ~~");
            movement.move(heroes, movements.get(k), mapMatrix);
            for (int i = 0; i < heroes.size(); i++) {
                for (int j = i + 1; j < heroes.size(); j++) {
                    //verific daca au aceeasi pozitie pe harta
                    if (i != j && heroes.get(i).getxLocation() == heroes.get(j).getxLocation()
                            && heroes.get(i).getyLocation() == heroes.get(j).getyLocation()) {
                        heroes.get(i).setRound(k);
                        heroes.get(j).setRound(k);
                        //aplic mai intai damage-ul overtime pentru fiecare dintre eroi
                        abilities.applyAllOvertimeDamages(heroes.get(i));
                        abilities.applyAllOvertimeDamages(heroes.get(j));
                        //aplic strategiile
                        heroes.get(i).applyStrategies(heroes.get(i));
                        heroes.get(j).applyStrategies(heroes.get(j));
                        //aplic damage overtime pentru incapacitate de miscare
                        if (heroes.get(i).getSlamOvertimeDamage() != 0) {
                            abilities.applySlamDamage(heroes.get(i));
                        }
                        if (heroes.get(j).getSlamOvertimeDamage() != 0) {
                            abilities.applySlamDamage(heroes.get(j));
                        }
                        //lupta efectiva intre eroi
                        if (heroes.get(i).getStatus().equals("ALIVE")
                                && heroes.get(j).getStatus().equals("ALIVE")) {
                            //visitor pentru lupte
                            if (heroes.get(j).getTypeOfHero().equals("W")) {
                                heroes.get(j).accept(heroes.get(i));
                                heroes.get(i).accept(heroes.get(j));
                            } else {
                                heroes.get(i).accept(heroes.get(j));
                                heroes.get(j).accept(heroes.get(i));

                            }
                            //actualizez experienta
                            if (heroes.get(i).getHP() <= 0
                                    && heroes.get(i).getIsDeadOvertime() != 1
                                && heroes.get(j).getHP() > 0) {
                                heroes.get(j).updateExperience(heroes.get(j), heroes.get(i));
                                heroes.get(i).setStatus("dead");
                            }
                            if (heroes.get(j).getHP() <= 0
                                    && heroes.get(j).getIsDeadOvertime() != 1
                                    && heroes.get(i).getHP() > 0) {
                                heroes.get(i).updateExperience(heroes.get(i), heroes.get(j));
                                heroes.get(j).setStatus("dead");
                                heroes.get(j).setDeadBefore(0);
                            }
                            //actualizez nivelul
                            if (heroes.get(i).getHP() > 0 && heroes.get(j).getHP() < 0) {
                                heroes.get(i).updateLevel(heroes.get(i));
                            }
                            if (heroes.get(j).getHP() > 0 &&  heroes.get(i).getHP() < 0) {
                                heroes.get(j).updateLevel(heroes.get(j));
                            }
                        }

                    }
                    System.out.println(heroes.get(i).getTypeOfHero() +  " " + heroes.get(i).getHP());
                    System.out.println(heroes.get(j).getTypeOfHero() + " " + heroes.get(j).getHP());
                    HeroesObserver heroesObserver = new HeroesObserver(subject);
                    heroesObserver.update(null, heroes.get(i), heroes.get(j));
                }
            }
            //la finalul fiecarei runde apar ingerii
            for (int i = 0; i < numberOfAngels.get(k); i++) {
                angels.add(angelsFactory.createAngels(typeOfAngels.get(angelsContor),
                        angelRowPos[angelsContor][0], angelColPos[angelsContor][0]));
                angelsContor++;
            }
            for (int i = 0; i < angels.size(); i++) {
                int positionObserverContor = 0;
                angels.get(i).setAngelHelpedorHit(0);
                //vad daca exista eroi pe pozitia respectiva
                for (int j = 0; j < heroes.size(); j++) {
                    if (heroes.get(j).getxLocation() == angels.get(i).getRowLoc()
                            && heroes.get(j).getyLocation() == angels.get(i).getColLoc()
                            && numberOfAngels.get(k) != 0) {
                        //visitor intre eroi si ingeri
                        heroes.get(j).acceptAngel(angels.get(i));
                        //observer
                            subject.setAngel(angels.get(i));
                            subject.setHero1(heroes.get(j));
                            subject.setHero2(null);
                            PositionObserver positionObserver = new PositionObserver(subject);
                            if (positionObserverContor == 0) {
                                positionObserver.update(angels.get(i), heroes.get(j), null);
                                positionObserverContor++;
                            }
                            AngelObserver angelObserver = new AngelObserver(subject);
                            angelObserver.update(angels.get(i), heroes.get(j), null);
                            levelUpObserver.update(null, heroes.get(j), null);
                        }
                }
            }
            angels.clear();
            System.out.println();
        }
        GameOutput gameOutput = new GameOutput();
         gameOutput.printResults(heroes);
        } catch (Exception e1) {
            e1.printStackTrace();
        }


    }

}
