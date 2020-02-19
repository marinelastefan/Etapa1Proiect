package angels;

import constants.AngelsModifiers;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class DamageAngel extends Angels {
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();
    public DamageAngel(final int rowPos, final int colPos,
                       final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight knight) {
        this.setAngelHelpedorHit(1);
        knight.increaseModifiers(angelsModifiers.getDamageAngelModifiers("K"),
               knight.getMapRaceModifiers1());
        knight.increaseModifiers(angelsModifiers.getDamageAngelModifiers("K"),
                knight.getMapRaceModifiers2());

    }

    @Override
    public final void visit(final Rogue rogue) {
        this.setAngelHelpedorHit(1);
        rogue.increaseModifiers(angelsModifiers.getDamageAngelModifiers("R"),
                rogue.getMapRaceModifiers1());
        rogue.increaseModifiers(angelsModifiers.getDamageAngelModifiers("R"),
                rogue.getMapRaceModifiers2());

    }
    @Override
    public final void visit(final Wizard wizard) {
        this.setAngelHelpedorHit(1);
        wizard.increaseModifiers(angelsModifiers.getDamageAngelModifiers("W"),
                wizard.getMapRaceModifiers1());
        wizard.increaseModifiers(angelsModifiers.getDamageAngelModifiers("W"),
                wizard.getMapRaceModifiers2());

    }
    @Override
    public final void visit(final Pyromancer pyromancer) {
        this.setAngelHelpedorHit(1);
        pyromancer.increaseModifiers(angelsModifiers.getDamageAngelModifiers("P"),
                pyromancer.getMapRaceModifiers1());
        pyromancer.increaseModifiers(angelsModifiers.getDamageAngelModifiers("P"),
                pyromancer.getMapRaceModifiers2());
    }
}
