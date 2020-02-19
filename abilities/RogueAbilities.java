package abilities;
import constants.Constants;
import constants.LandModifiersFactory;
import heroes.Heroes;

public final class RogueAbilities extends Abilities {

    @Override
    public  int damageCalculator(final Heroes enemy, final Heroes hero) {
        //super.damageCalculator(enemy, hero);
        float criticalDamage;
        int firstAbilityDamage;
        int secondAbilityDamage;
        //verific daca trebuie sa aplic critical
        if (enemy.getRound() % Constants.THREE_BY_THREE == 0
                && enemy.getLocation().equals("W")) {
            criticalDamage = LandModifiersFactory.getCriticalDamage();
        } else {
            criticalDamage = LandModifiersFactory.getNoModifiers();
        }
        float locationModifier;
        //verific daca se afla pe Woods si setez damageOvertime pentru adversar
        if (enemy.getLocation().equals("W")) {
            locationModifier = factory.getLandModifiers("W");
            enemy.setParalysisOvertimeDamage(
                    LandModifiersFactory.getSuperNmbOvertimeParalysisDamage());
            enemy.setCanMove(LandModifiersFactory.getSuperNmbOvertimeParalysisDamage());
        } else {
            enemy.setParalysisOvertimeDamage(LandModifiersFactory.getNmbOvertimeParalysisDamage());
            enemy.setCanMove(LandModifiersFactory.getNmbOvertimeParalysisDamage());
            locationModifier = LandModifiersFactory.getNoModifiers();
        }
        //retin damage fara raceModifiers in caz ca adversarul e Wizard
        firstAbilityDamage = Math.round((factory.getAllDamages("backstab")
                + hero.getLevel() * factory.getAllLevelDamages("backstab"))
                * criticalDamage * locationModifier);
        secondAbilityDamage = Math.round((factory.getAllDamages("paralysis")
                + hero.getLevel() * factory.getAllLevelDamages("paralysis"))
                 * locationModifier);
        enemy.setDamageReceived(firstAbilityDamage + secondAbilityDamage);
        firstAbilityDamage = Math.round(firstAbilityDamage
                * hero.getRaceModifiers1(enemy.getTypeOfHero()));
        secondAbilityDamage = Math.round(secondAbilityDamage
                * hero.getRaceModifiers2(enemy.getTypeOfHero()));
        return  firstAbilityDamage + secondAbilityDamage;

    }


}
