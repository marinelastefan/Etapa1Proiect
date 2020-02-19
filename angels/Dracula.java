package angels;

import constants.AngelsModifiers;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class Dracula extends Angels {
    public Dracula(final int rowPos, final int colPos,
                   final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();

    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("K"),
                    hero.getMapRaceModifiers1());
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("K"),
                    hero.getMapRaceModifiers2());
            hero.setHP(hero.getHP() - angelsModifiers.getDraculaHp("K"));
            //verifiv daca eroul a fost omorat de catre inger
            if (hero.getHP() <= 0) {
                this.setKilledAHero(1);
            }
        }  else {
            this.setAngelHelpedorHit(0);
        }
    }

    @Override
    public final void visit(final Rogue hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("R"),
                    hero.getMapRaceModifiers1());
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("R"),
                    hero.getMapRaceModifiers2());
            hero.setHP(hero.getHP() - angelsModifiers.getDraculaHp("R"));
            if (hero.getHP() <= 0) {
                this.setKilledAHero(1);
            } else {
                this.setKilledAHero(0);
            }
        }  else {
            this.setAngelHelpedorHit(0);
        }

    }

    @Override
    public final void visit(final Wizard hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("W"),
                    hero.getMapRaceModifiers1());
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("W"),
                    hero.getMapRaceModifiers2());
            hero.setHP(hero.getHP() - angelsModifiers.getDraculaHp("W"));
            if (hero.getHP() <= 0) {
                this.setKilledAHero(1);
            }
        } else {
            this.setAngelHelpedorHit(0);
        }
    }

    @Override
    public final void visit(final Pyromancer hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("P"),
                    hero.getMapRaceModifiers1());
            hero.decreaseModifiers(angelsModifiers.getDraculaModifiers("P"),
                    hero.getMapRaceModifiers2());
            hero.setHP(hero.getHP() - angelsModifiers.getDraculaHp("P"));
            if (hero.getHP() <= 0) {
                this.setKilledAHero(1);
                hero.setDeadBefore(1);
            }
        } else {
            this.setAngelHelpedorHit(0);
        }
    }
}
