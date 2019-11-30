package abilities;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class PyromancerAbilities extends Abilities{
    private final int fireblastBaseDamage = 350;
    private final int fireblastLevelDamage = 50;
    private final float fireblastRogueModifier = 0.8f;
    private final float fireblastPyromancerModifier = 0.9f;
    private final float fireblastWizardMOdifier = 1.05f;
    private final int igniteBaseDamage = 150;
    private final int igniteLevelDamage = 20;
    private final int igniteBaseDamage2 = 50;
    private final int igniteLevelDamage2 = 30;
    private final float igniteRogueModifier = 0.8f;
    private final float ignitePyromancerModifier = 0.9f;
    private final float igniteKnightModifier = 1.2f;
    private final float igniteWizardModifier = 1.05f;
    private int firstAbilityDamage;
    private int secondAbilityDamage;
    private int totalDamage;
    private int totalAbility;
    private float locationModifier;

    public void visit(Wizard wizard) {
        if(wizard.getLocation().equals("v")) {
            locationModifier = 1.25f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((fireblastBaseDamage + fireblastLevelDamage * wizard.getLevel()) *
               locationModifier) * fireblastWizardMOdifier);
        secondAbilityDamage = Math.round(Math.round((igniteBaseDamage + igniteLevelDamage * wizard.getLevel()) *
                    locationModifier) * igniteWizardModifier);
        totalDamage = fireblastBaseDamage + secondAbilityDamage;
    }

    public void visit(Rogue rogue) {
        if(rogue.getLocation().equals("v")) {
            locationModifier = 1.25f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((fireblastBaseDamage + fireblastLevelDamage * rogue.getLevel()) *
                locationModifier) * fireblastRogueModifier);

        secondAbilityDamage = Math.round(Math.round((igniteBaseDamage + igniteLevelDamage * rogue.getLevel()) *
                    locationModifier) * igniteRogueModifier);

        totalDamage = fireblastBaseDamage + secondAbilityDamage;

    }

    public void visit(Knight knight) {
        if(knight.getLocation().equals("v")) {
            locationModifier = 1.25f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((fireblastBaseDamage + fireblastLevelDamage * knight.getLevel()) *
                locationModifier) * fireblastWizardMOdifier);

        secondAbilityDamage = Math.round(Math.round((igniteBaseDamage + igniteLevelDamage * knight.getLevel()) *
                    locationModifier) * igniteKnightModifier);

        totalDamage = fireblastBaseDamage + secondAbilityDamage;

    }

    public void visit(Pyromancer pyromancer) {
        if(pyromancer.getLocation().equals("v")) {
            locationModifier = 1.25f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((fireblastBaseDamage + fireblastLevelDamage * pyromancer.getLevel()) *
                locationModifier) * fireblastPyromancerModifier);

        secondAbilityDamage = Math.round(Math.round((igniteBaseDamage + igniteLevelDamage * pyromancer.getLevel()) *
                    locationModifier) * ignitePyromancerModifier);

        totalDamage = fireblastBaseDamage + secondAbilityDamage;

    }
}
