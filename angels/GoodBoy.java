package angels;

import constants.AngelsModifiers;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class GoodBoy extends Angels {
    //LandModifiersFactory factory = LandModifiersFactory.getInstance();
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();
    public GoodBoy(final int rowPos, final int colPos,
                    final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("K"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("K"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getGoodBoyHp("K"));


    }

    @Override
    public final void visit(final Rogue hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("R"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("R"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getGoodBoyHp("R"));

    }

    @Override
    public final void visit(final Wizard hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("W"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("W"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getGoodBoyHp("W"));

    }

    @Override
    public final void visit(final Pyromancer hero) {
        this.setAngelHelpedorHit(1);
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("P"),
                hero.getMapRaceModifiers1());
        hero.increaseModifiers(angelsModifiers.getGoodBoyModifiers("P"),
                hero.getMapRaceModifiers2());
        hero.setHP(hero.getHP() + angelsModifiers.getGoodBoyHp("P"));

    }
}
