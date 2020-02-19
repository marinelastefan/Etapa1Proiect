package admin;

import angels.Angels;
import angels.Subject;
import heroes.Heroes;

public class LevelUpObserver extends TheGreatMagician {
    public LevelUpObserver(final Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public final void update(final Angels angel,
                             final Heroes hero1, final Heroes hero2) {
        if (hero1.getUpdatedHisLevel() == 1) {
            System.out.println(hero1.getTheEntire(hero1.getTypeOfHero())
                    + " " + hero1.getId()
                    + " reached level " + hero1.getLevel());
            hero1.setUpdatedHisLevel(0);
        }
    }
}
