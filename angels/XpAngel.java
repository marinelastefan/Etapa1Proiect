package angels;

import constants.AngelsModifiers;
import constants.HeroesConstants;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class XpAngel extends Angels {
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();
    public XpAngel(final int rowPos, final int colPos,
                   final AngelsType angelsType, final GoodOrNot goodOrNot) {
        super(rowPos, colPos, angelsType, goodOrNot);
    }

    /*suprascriu metodele visit pentru fiecare tip de erou si actualizez hp
    si raceModifiers
     */
    @Override
    public final void visit(final Knight hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setXP(hero.getXP() + angelsModifiers.getXpAngel("K"));
            //creste xp pana la max_level
            int aux = HeroesConstants.getLevelConstant()
                    + (hero.getLevel() + 1) * HeroesConstants.getLevelUpConstant();
            if (hero.getXP() >= aux) {
                hero.updateLevel(hero);
            }
        }

    }

    @Override
    public final void visit(final Rogue hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setXP(hero.getXP() + angelsModifiers.getXpAngel("R"));
            int aux = HeroesConstants.getLevelConstant()
                    + (hero.getLevel() + 1) * HeroesConstants.getLevelUpConstant();
            if (hero.getXP() >= aux) {
                hero.updateLevel(hero);
            }
        }
    }

    @Override
    public final void visit(final Wizard hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setXP(hero.getXP() + angelsModifiers.getXpAngel("W"));
            int aux = HeroesConstants.getLevelConstant()
                    + (hero.getLevel() + 1) * HeroesConstants.getLevelUpConstant();
            if (hero.getXP() >= aux) {
                hero.updateLevel(hero);
            }
        }
    }

    @Override
    public final void visit(final Pyromancer hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            hero.setXP(hero.getXP() + angelsModifiers.getXpAngel("P"));
            int aux = HeroesConstants.getLevelConstant()
                    + (hero.getLevel() + 1) * HeroesConstants.getLevelUpConstant();
            if (hero.getXP() >= aux) {
                hero.updateLevel(hero);
            }
        }

    }
}
