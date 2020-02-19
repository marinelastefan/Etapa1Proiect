package angels;

import constants.AngelsModifiers;
import constants.HeroesConstants;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class LifeGiver extends Angels {
    private AngelsModifiers factory = AngelsModifiers.getInstance();
    public LifeGiver(final int rowPos, final int colPos,
                     final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }
    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        int maximum = HeroesConstants.getKnightInitialHp()
                + hero.getLevel() * HeroesConstants.getKnightLevelHp();
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            if (hero.getHP() + factory.getLifeGiver("K") < maximum) {
                hero.setHP(hero.getHP() + factory.getLifeGiver("K"));
            } else {
                hero.setHP(maximum);
            }
        }
    }

    @Override
    public final void visit(final Rogue hero) {
        int maximum = HeroesConstants.getRogueLevelHp()
                + hero.getLevel() * HeroesConstants.getWizardLevelHp();
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            if (hero.getHP() + factory.getLifeGiver("R") <= maximum) {
                hero.setHP(hero.getHP() + factory.getLifeGiver("R"));
            } else {
                hero.setHP(maximum);
            }
        }
    }

    @Override
    public final void visit(final Wizard hero) {
        int maximum = HeroesConstants.getWizardInitialHp()
                + hero.getLevel() * HeroesConstants.getWizardLevelHp();
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            if (hero.getHP() + factory.getLifeGiver("W") <= maximum) {
                hero.setHP(hero.getHP() + factory.getLifeGiver("W"));
            } else {
               hero.setHP(maximum);
            }
        }
    }

    @Override
    public final void visit(final Pyromancer hero) {
        int maximum = HeroesConstants.getPyromancerInitialHp()
                + hero.getLevel() * HeroesConstants.getPyromancerLevelHp();
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            if (hero.getHP() + factory.getLifeGiver("P") <= maximum) {
                hero.setHP(hero.getHP() + factory.getLifeGiver("P"));
            } else {
                hero.setHP(maximum);
            }
        }
    }
}
