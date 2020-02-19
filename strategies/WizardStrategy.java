package strategies;
import constants.HeroesConstants;
import constants.StrategiesConstants;
import heroes.Heroes;

public class WizardStrategy implements HeroesStrategies {


    @Override
    public final void applyStrategy(final Heroes hero) {
        if ((HeroesConstants.getWizardLevelHp()
                + HeroesConstants.getWizardLevelHp() * hero.getLevel())
                / StrategiesConstants.getWizardLeft()
                < hero.getHP() && hero.getHP()
                < (HeroesConstants.getWizardLevelHp()
                + HeroesConstants.getWizardLevelHp() * hero.getLevel())
                / StrategiesConstants.getRogueRight()) {
            hero.setHP(hero.getHP() - hero.getHP() / StrategiesConstants.getWizardLostHp());
            hero.increaseModifiers(StrategiesConstants.getWizardDecreaseCoefficientWith(),
                    hero.getMapRaceModifiers1());
            hero.increaseModifiers(StrategiesConstants.getWizardDecreaseCoefficientWith(),
                    hero.getMapRaceModifiers2());
        }

        if (hero.getHP() < HeroesConstants.getWizardLevelHp()
                / StrategiesConstants.getWizardLeft()) {
            hero.setHP(hero.getHP() + hero.getHP()
                    * StrategiesConstants.getWizardIncreasedHp());
            hero.decreaseModifiers(StrategiesConstants.getWizardIncreaseCoefficientsWith(),
                    hero.getMapRaceModifiers1());
            hero.decreaseModifiers(StrategiesConstants.getWizardIncreaseCoefficientsWith(),
                    hero.getMapRaceModifiers2());
        }
    }
}
