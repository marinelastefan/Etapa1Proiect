package admin;

import angels.Angels;
import angels.Subject;
import heroes.Heroes;


public class PositionObserver extends TheGreatMagician {
    public PositionObserver(final Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public final void update(final Angels angel,
                             final Heroes hero1, final Heroes hero2) {
        System.out.println("Angel " + angel.getAngelsType() + " was spawned at "
                + angel.getRowLoc() + " " + angel.getColLoc());
    }
}
