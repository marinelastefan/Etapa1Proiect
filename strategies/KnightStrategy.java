package strategies;

import constants.HeroesConstants;
import constants.StrategiesConstants;
import heroes.Heroes;


public class KnightStrategy implements HeroesStrategies {

    @Override
    public final void applyStrategy(final Heroes hero) {
        if (hero.getCanMove() == 0) {
            if ((HeroesConstants.getKnightInitialHp()
                    + HeroesConstants.getKnightLevelHp() * hero.getLevel())
                    / StrategiesConstants.getKnightLeft()
                    < hero.getHP() && hero.getHP()
                    < (HeroesConstants.getKnightInitialHp()
                    + HeroesConstants.getKnightLevelHp() * hero.getLevel())
                    / StrategiesConstants.getKnightRight()) {
                hero.setHP(hero.getHP() - hero.getHP() / StrategiesConstants.getKnightLostHp());
                hero.increaseModifiers(StrategiesConstants.getKnightIncreaseCoefficientsWith(),
                        hero.getMapRaceModifiers1());
                hero.increaseModifiers(StrategiesConstants.getKnightIncreaseCoefficientsWith(),
                        hero.getMapRaceModifiers2());

            }
            if (hero.getHP() < (HeroesConstants.getKnightInitialHp()
                    + HeroesConstants.getKnightLevelHp() * hero.getLevel())
                    / StrategiesConstants.getKnightLeft()) {
                hero.decreaseModifiers(StrategiesConstants.getKnightDecreaseCoefficientWith(),
                        hero.getMapRaceModifiers1());
                hero.decreaseModifiers(StrategiesConstants.getKnightDecreaseCoefficientWith(),
                        hero.getMapRaceModifiers2());

            }
        }
    }
}
