package abilities;
import constants.HeroesConstants;
import constants.LandModifiersFactory;
import heroes.Heroes;

public final class WizardAbilities extends Abilities {
    //LandModifiersFactory factory = LandModifiersFactory.getInstance();
    @Override
    public  int damageCalculator(final Heroes enemy, final Heroes hero) {
        float locationModifier;
        int firstAbilityDamage;
        int secondAbilityDamage;
        if (enemy.getLocation().equals("D")) {
            locationModifier = factory.getLandModifiers("D");
        } else {
            locationModifier = LandModifiersFactory.getNoModifiers();
        }
        float minimum;
        //drain
        if (HeroesConstants.getWizardMin() * enemy.getInitialHP() < enemy.getHP()) {
            minimum = enemy.getInitialHP() * HeroesConstants.getWizardMin();
        } else {
            minimum = enemy.getHP();
        }
        float aux = factory.getAllDamages("drain")
                + factory.getAllLevelDamages("drain") * hero.getLevel();
        float procent;
        procent = aux  + (factory.getDrainModifiers(enemy.getTypeOfHero()) - 1) * aux;
        firstAbilityDamage = Math.round(procent * minimum * locationModifier);
        //deflect se aplica doar daca enemy nu este wizard
        if (enemy.getTypeOfHero().equals("W")) {
            secondAbilityDamage = 0;
        } else {
             secondAbilityDamage = Math.round((factory.getAllDamages("deflect")
                     + factory.getAllLevelDamages("deflect") * hero.getLevel())
                     * hero.getDamageReceived()
                     * factory.getDeflectModifiers(enemy.getTypeOfHero()) * locationModifier);
        }
        return firstAbilityDamage + secondAbilityDamage;

    }

}
