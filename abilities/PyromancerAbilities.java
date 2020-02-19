package abilities;

import constants.LandModifiersFactory;
import heroes.Heroes;
public final class PyromancerAbilities extends Abilities {
   // LandModifiersFactory factory = LandModifiersFactory.getInstance();


    @Override
    public  int damageCalculator(final Heroes enemy, final Heroes hero) {
        float landModifier;
        int firstAbilityDamage;
        int secondAbilityDamage;
        if (enemy.getLocation().equals("V")) {
            landModifier = factory.getLandModifiers("V");
        } else {
            landModifier = LandModifiersFactory.getNoModifiers();
        }
        firstAbilityDamage = Math.round(landModifier * (factory.getAllDamages("fireblast")
            + hero.getLevel() * factory.getAllLevelDamages("fireblast")));
        secondAbilityDamage = Math.round(landModifier * (factory.getAllDamages("ignite")
            + hero.getLevel() * factory.getAllLevelDamages("ignite")));
        //retin damage-ul fara modificatori in caz ca adversarul este wizard
        enemy.setDamageReceived(firstAbilityDamage + secondAbilityDamage);
        firstAbilityDamage = Math.round(firstAbilityDamage
                * hero.getRaceModifiers1(enemy.getTypeOfHero()));
        secondAbilityDamage = Math.round(secondAbilityDamage
                * hero.getRaceModifiers2(enemy.getTypeOfHero()));
        //ii setez damage overtime
        enemy.setIgniteOvertimeDamage(2);
        return  firstAbilityDamage + secondAbilityDamage;
    }

}
