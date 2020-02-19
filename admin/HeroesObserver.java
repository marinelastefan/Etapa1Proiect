package admin;

import angels.Angels;
import angels.Subject;
import heroes.Heroes;
public class HeroesObserver extends TheGreatMagician {
    public HeroesObserver(final Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public final void update(final Angels angel,
                             final Heroes hero, final Heroes hero2) {
        if (hero2.getHP() <= 0 && hero2.getDeadBefore() == 0) {
            System.out.println("Player " + hero2.getTheEntire(hero2.getTypeOfHero())
                    + " "
                    + hero2.getId() +  " was killed by "
                    + hero.getTheEntire(hero.getTypeOfHero())
                    + " " + hero.getId());
            hero2.setDeadBefore(1);
        }
        if (hero.getHP() <= 0 && hero.getDeadBefore() == 0) {
            System.out.println("Player " + hero.getTheEntire(hero.getTypeOfHero())
                    + " "
                    + hero.getId() +  " was killed by "
                    + hero2.getTheEntire(hero2.getTypeOfHero())
                    + " " + hero2.getId());
            hero.setDeadBefore(1);
        }
        if (hero.getUpdatedHisLevel() == 1) {
            hero.setUpdatedHisLevel(0);
            int level = hero.getLevel();
            int contor = 1;
            while (contor <= level) {
                System.out.println(hero.getTheEntire(hero.getTypeOfHero()) + " " + hero.getId()
                        + " reached level " + contor);
                contor++;
            }
        }
        if (hero2.getUpdatedHisLevel() == 1) {
            hero2.setUpdatedHisLevel(0);
            if (hero2.getLevel() == 1) {
                System.out.println(hero2.getTheEntire(hero2.getTypeOfHero()) + " " + hero2.getId()
                        + " reached level " + hero2.getLevel());

            } else {
                int level = hero.getLevel();
                int contor = 1;
                while (contor <= level) {
                    System.out.println(hero2.getTheEntire(hero2.getTypeOfHero()) + " "
                            + hero2.getId()
                            + " reached level " + contor);
                    contor++;
                }
            }
        }

    }
}
