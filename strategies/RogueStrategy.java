package strategies;

import constants.HeroesConstants;
import constants.StrategiesConstants;
import heroes.Heroes;

public class RogueStrategy implements HeroesStrategies {
    @Override
    public final void applyStrategy(final Heroes hero) {
        if (hero.getCanMove() == 0) {
            if ((HeroesConstants.getRogueInitialHp()
                    + HeroesConstants.getRogueLevelHp() * hero.getLevel())
                    / StrategiesConstants.getRogueLeft()
                    < hero.getHP() && hero.getHP()
                    < HeroesConstants.getRogueLevelHp() / StrategiesConstants.getRogueRight()) {
                hero.setHP(hero.getHP() - hero.getHP() / StrategiesConstants.getRogurLostHp());
                hero.increaseModifiers(StrategiesConstants.getRogueIncreaseCoefficientsWith(),
                        hero.getMapRaceModifiers1());
                hero.decreaseModifiers(StrategiesConstants.getRogueIncreaseCoefficientsWith(),
                        hero.getMapRaceModifiers2());

            }
            if (hero.getHP()
                    < (HeroesConstants.getRogueInitialHp()
                    + HeroesConstants.getRogueLevelHp() * hero.getLevel())
                    / StrategiesConstants.getRogueLeft()) {
                hero.setHP(hero.getHP() + hero.getHP() / StrategiesConstants.getRogueIncreasedHp());
               hero.decreaseModifiers(StrategiesConstants.getPyromancerDecreaseCoefficientsWith(),
                        hero.getMapRaceModifiers1());
                hero.decreaseModifiers(StrategiesConstants.getRogueDecreaseCoefficientWith(),
                        hero.getMapRaceModifiers2());
            }
        }
    }
}
