package heroes;

import abilities.Abilities;
import abilities.WizardAbilities;

public class Wizard extends Heroes {

    @Override
    public int  accept(Abilities abilities) {
           return abilities.visit(this);
    }
    public int getWizardDamage (Heroes enemy) {
        WizardAbilities wizardAbilities = new WizardAbilities();
        return enemy.accept(wizardAbilities);
    }

}
