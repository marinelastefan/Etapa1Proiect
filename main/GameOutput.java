package main;

import heroes.Heroes;
import java.util.LinkedList;

public class GameOutput {
    public void printResults(final LinkedList<Heroes> heroes) {
        System.out.println("~~ Results ~~");
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getHP() <= 0) {
                heroes.get(i).setStatus("dead");
                System.out.println(heroes.get(i).getTypeOfHero() + " "
                        + heroes.get(i).getStatus());

            } else {
                System.out.println(heroes.get(i).getTypeOfHero()
                        + " "
                        + heroes.get(i).getLevel() + " " + heroes.get(i).getXP()
                        + " "
                        + heroes.get(i).getHP() + " " + heroes.get(i).getxLocation()
                        + " " + heroes.get(i).getyLocation());
            }
        }

    }
}
