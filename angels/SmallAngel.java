package angels;

import constants.AngelsModifiers;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class SmallAngel extends Angels {
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();
    public SmallAngel(final int rowPos, final int colPos,
                      final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("K"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("K"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getSmallAngelHp("K"));

    }

    @Override
    public final void visit(final Rogue hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("R"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("R"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getSmallAngelHp("R"));

    }

    @Override
    public final void visit(final Wizard hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("W"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("W"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getSmallAngelHp("W"));

    }

    @Override
    public final void visit(final Pyromancer hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("P"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getSmallAngelModifiers("P"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getSmallAngelHp("P"));

    }
}
