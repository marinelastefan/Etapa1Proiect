package abilities;

import constants.Constants;
import constants.HeroesConstants;
import constants.LandModifiersFactory;
import heroes.Heroes;

public final class KnightAbilities extends Abilities {
    private LandModifiersFactory factory = new LandModifiersFactory();


    @Override
    public  int damageCalculator(final Heroes enemy, final Heroes hero) {
        float landModifier;
        float hpLimit;
        int firstAblityDamage;
        int secondAbilityDamage;
        //verific daca se afla pe Land
        if (enemy.getLocation().equals("L")) {
            landModifier = factory.getLandModifiers("L");
        } else {
            landModifier = LandModifiersFactory.getNoModifiers();
        }
        //in caz ca enemy e Wizard retin damage-ul fara race Modifiers
         firstAblityDamage = Math.round(landModifier * (factory.getAllDamages("execute")
                 + hero.getLevel() * factory.getAllLevelDamages("execute")));
        hpLimit = Math.round(Math.round(Constants.PROCENT
                * enemy.getLevelHp() + Constants.LEVEL_PROCENT * enemy.getLevel()));
        if (hpLimit > HeroesConstants.getHpLimit()) {
            hpLimit = HeroesConstants.getHpLimit();

        }
        //adversarul va fi omorat direct
        if (hpLimit  > enemy.getHP() && hpLimit > Constants.HP_LIMIT) {
            enemy.setHP(0);
        }
         secondAbilityDamage = Math.round(landModifier * (factory.getAllDamages("slam")
                + hero.getLevel() * factory.getAllLevelDamages("slam")));
        //retin damage-ul fara raceModifiers in caz ca adversarul e Wizard
        int damage = firstAblityDamage + secondAbilityDamage;
            enemy.setDamageReceived(damage);
         firstAblityDamage = Math.round(firstAblityDamage
                 * hero.getRaceModifiers1(enemy.getTypeOfHero()));
         secondAbilityDamage = Math.round(secondAbilityDamage
                 * hero.getRaceModifiers2(enemy.getTypeOfHero()));
         //incapacitatea adversarului de a se misca
         enemy.setCanMove(1);
         enemy.setSlamOvertimeDamage(1);
        return firstAblityDamage + secondAbilityDamage;

    }

}
