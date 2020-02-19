package admin;

import angels.Angels;
import angels.GoodOrNot;
import angels.Subject;
import heroes.Heroes;


public class AngelObserver extends TheGreatMagician {
    public AngelObserver(final Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public final void update(final Angels angel, final Heroes hero,
                                    final Heroes hero2) {
        if (angel.getAngelGoodOrNot().equals(GoodOrNot.Bad)) {
            if (angel.getAngelHelpedorHit() == 1) {
                System.out.println(angel.getAngelsType() + " hit "
                        + hero.getTheEntire(hero.getTypeOfHero())
                        + " " + hero.getId());
                if (angel.getKilledAHero() == 1) {
                    System.out.println("Player " + hero.getTheEntire(hero.getTypeOfHero()) +  " "
                            + hero.getId() + " was killed by an angel");
                }
            }

        } else {
            if (hero.getHP() > 0
                    && angel.getAngelHelpedorHit() == 1) {
                System.out.println(angel.getAngelsType() + " helped "
                        + hero.getTheEntire(hero.getTypeOfHero())
                        + " " + hero.getId());
                if (angel.getBroughtToLife() == 1) {
                    System.out.println("Player " + hero.getTheEntire(hero.getTypeOfHero())
                            + " " + hero.getId()
                            + " was brought to life by an angel");
                }
            }
        }
    }
}
