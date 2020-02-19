package angels;

import constants.AngelsModifiers;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class Spawner extends Angels {
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();
    public Spawner(final int rowPos, final int colPos,
                   final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        //doar daca eroul e mort
            if (hero.getHP() <= 0) {
                this.setAngelHelpedorHit(1);
                hero.setHP(angelsModifiers.getSpawner("K"));
               // hero.setXP(0);
                hero.setStatus("ALIVE");
                this.setBroughtToLife(1);
            }
    }

    @Override
    public final void visit(final Rogue hero) {
        if (hero.getHP() <= 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(angelsModifiers.getSpawner("R"));
            hero.setStatus("ALIVE");
            //hero.setXP(0);
            this.setBroughtToLife(1);
        }

    }

    @Override
    public final void visit(final Wizard hero) {
        if (hero.getHP() <= 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(angelsModifiers.getSpawner("W"));
            hero.setStatus("ALIVE");
            //hero.setXP(0);
            this.setBroughtToLife(1);
        }

    }

    @Override
    public final void visit(final Pyromancer hero) {
        if (hero.getHP() <= 0) {
            this.setAngelHelpedorHit(1);
            hero.setHP(angelsModifiers.getSpawner("P"));
            hero.setStatus("ALIVE");
            //hero.setXP(0);
            this.setBroughtToLife(1);
        }

    }
}
