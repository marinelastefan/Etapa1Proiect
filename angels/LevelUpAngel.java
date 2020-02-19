package angels;

import constants.AngelsModifiers;
import constants.HeroesConstants;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class LevelUpAngel extends Angels {
    private AngelsModifiers angelsModifiers = AngelsModifiers.getInstance();
    public LevelUpAngel(final int rowPos, final int colPos,
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
            int level = hero.getLevel();
            hero.setLevel(level + 1);
            hero.setXP(HeroesConstants.getLevelConstant()
                    + (level + 1) * HeroesConstants.getLevelUpConstant());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("K"),
                    hero.getMapRaceModifiers1());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("K"),
                    hero.getMapRaceModifiers2());
            hero.setHP(HeroesConstants.getKnightInitialHp()
                    + hero.getLevel() * HeroesConstants.getKnightLevelHp());
            hero.setUpdatedHisLevel(1);
        }

    }

    @Override
    public final void visit(final Rogue hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            int level = hero.getLevel();
            hero.setLevel(level + 1);
            hero.setXP(HeroesConstants.getLevelConstant()
                    + (level + 1) * HeroesConstants.getLevelUpConstant());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("R"),
                    hero.getMapRaceModifiers1());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("R"),
                    hero.getMapRaceModifiers2());
            hero.setHP(HeroesConstants.getRogueInitialHp()
                    + hero.getLevel() * HeroesConstants.getRogueLevelHp());
            hero.setUpdatedHisLevel(1);
        }

    }

    @Override
    public final void visit(final Wizard hero) {
        if (hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            int level = hero.getLevel();
            hero.setLevel(level + 1);
            hero.setXP(HeroesConstants.getLevelConstant()
                    + (level + 1) * HeroesConstants.getLevelUpConstant());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("W"),
                    hero.getMapRaceModifiers1());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("W"),
                    hero.getMapRaceModifiers2());
            hero.setHP(HeroesConstants.getWizardInitialHp()
                    + hero.getLevel() * HeroesConstants.getWizardLevelHp());
            hero.setUpdatedHisLevel(1);
        }

    }

    @Override
    public final void visit(final Pyromancer hero) {
        if (hero.getLevel() == 0 && hero.getHP() > 0) {
            this.setAngelHelpedorHit(1);
            int level = hero.getLevel();
            hero.setLevel(level + 1);
            hero.setXP(HeroesConstants.getLevelConstant()
                    + (level + 1) * HeroesConstants.getLevelUpConstant());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("P"),
                    hero.getMapRaceModifiers1());
            hero.increaseModifiers(angelsModifiers.getLevelUpAngelModifiers("P"),
                    hero.getMapRaceModifiers2());
            hero.setHP(HeroesConstants.getPyromancerInitialHp()
                    + hero.getLevel() * HeroesConstants.getPyromancerLevelHp());
            hero.setUpdatedHisLevel(1);
        }

    }
}
