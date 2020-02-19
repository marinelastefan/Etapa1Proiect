package strategies;

import constants.HeroesConstants;
import constants.StrategiesConstants;
import heroes.Heroes;

public class PyromancerStrategy implements HeroesStrategies {


    @Override
    public final void applyStrategy(final Heroes hero) {
        if ((HeroesConstants.getPyromancerLevelHp()
                + HeroesConstants.getPyromancerLevelHp() * hero.getLevel())
                / StrategiesConstants.getPyromancerLeft()
         < hero.getHP() && hero.getHP()
         < (HeroesConstants.getPyromancerInitialHp()
                + HeroesConstants.getPyromancerLevelHp() * hero.getLevel())
                / StrategiesConstants.getPyromancerRight()) {
            hero.setHP(hero.getHP() - hero.getHP() / StrategiesConstants.getPyromancerLostHp());
            hero.increaseModifiers(StrategiesConstants.getPyromancerIncreaseCoefficientsWith(),
                    hero.getMapRaceModifiers1());
            hero.increaseModifiers(StrategiesConstants.getPyromancerIncreaseCoefficientsWith(),
                    hero.getMapRaceModifiers2());
        }
        if (hero.getHP()
                < (HeroesConstants.getPyromancerLevelHp()
                        + HeroesConstants.getPyromancerLevelHp() * hero.getLevel())
                       / StrategiesConstants.getPyromancerLeft()) {
            hero.setHP(hero.getHP() + hero.getHP() / StrategiesConstants.getKnightIncreasedHp());
           hero.decreaseModifiers(StrategiesConstants.getPyromancerDecreaseCoefficientsWith(),
                    hero.getMapRaceModifiers1());
            hero.decreaseModifiers(StrategiesConstants.getPyromancerDecreaseCoefficientsWith(),
                    hero.getMapRaceModifiers2());
        }

    }
}
