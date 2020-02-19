package angels;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class TheDoomer extends Angels {
    public TheDoomer(final int rowPos, final int colPos,
                     final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        //doar daca eroul e in viata
        if (hero.getHP() > 0) {
            hero.setHP(0);
            this.setAngelHelpedorHit(1);
            this.setKilledAHero(1);
            hero.setStatus("dead");
            hero.setDeadBefore(1);
        } else {
            this.setAngelHelpedorHit(0);
            this.setKilledAHero(0);
        }
    }

    @Override
    public final void visit(final Rogue hero) {
        if (hero.getHP() > 0) {
            hero.setHP(0);
            hero.setStatus("dead");
            hero.setDeadBefore(1);
            this.setAngelHelpedorHit(1);
            this.setKilledAHero(1);
        } else {
            this.setAngelHelpedorHit(0);
            this.setKilledAHero(0);
        }

    }

    @Override
    public final void visit(final Wizard hero) {
        if (hero.getHP() > 0) {
            hero.setHP(0);
            hero.setStatus("dead");
            hero.setDeadBefore(1);
            this.setAngelHelpedorHit(1);
            this.setKilledAHero(1);
        } else {
            this.setAngelHelpedorHit(0);
            this.setKilledAHero(0);
        }

    }

    @Override
    public final void visit(final Pyromancer hero) {
        if (hero.getHP() > 0) {
            hero.setHP(0);
            hero.setStatus("dead");
            hero.setDeadBefore(1);
            this.setAngelHelpedorHit(1);
            this.setKilledAHero(1);
        } else {
            this.setAngelHelpedorHit(0);
            this.setKilledAHero(0);
        }

    }
}
