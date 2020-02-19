package angels;

import admin.TheGreatMagician;
import heroes.Heroes;

import java.util.ArrayList;

public class Subject {
    private ArrayList<TheGreatMagician> observers = new ArrayList<>();
    private int state;
    private Angels angel;
    private Heroes hero1;
    private Heroes hero2;

    public final void setAngel(final Angels angel) {
        this.angel = angel;
    }
    public final void setHero1(final Heroes hero) {
        this.hero1 = hero;
    }
    public final void setHero2(final Heroes hero2) {
        this.hero2 = hero2;
    }
    public final int getState() {
        return state;
    }
    public final void attachObserver(final TheGreatMagician observer) {
        observers.add(observer);
    }

    public final void setState(final int state) {
        this.state = state;
        notifyAllObservers();
    }
    public final void notifyAllObservers() {
        for (TheGreatMagician observer : observers) {
            observer.update(angel, hero1, hero2);
        }
    }
}
