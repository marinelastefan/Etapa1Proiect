package angels;

import constants.AngelsModifiers;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class DarkAngel extends Angels {
   private AngelsModifiers factory = AngelsModifiers.getInstance();
    public DarkAngel(final int rowPos, final int colPos,
                     final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        //aplic doar daca eroul e in viata
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(hero.getHP() - factory.getDarkAngelHp("K"));
        } else  {
            this.setAngelHelpedorHit(0);
        }

    }

    @Override
    public final void visit(final Rogue hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(hero.getHP() - factory.getDarkAngelHp("R"));
        } else {
            this.setAngelHelpedorHit(0);
        }
    }

    @Override
    public final void visit(final Wizard hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(hero.getHP() - factory.getDarkAngelHp("W"));
        } else {
            this.setAngelHelpedorHit(0);
        }

    }

    @Override
    public final void visit(final Pyromancer hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(hero.getHP() - factory.getDarkAngelHp("P"));
        } else {
            this.setAngelHelpedorHit(0);
        }
    }
}
