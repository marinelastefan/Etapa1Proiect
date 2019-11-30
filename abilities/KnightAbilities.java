package abilities;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class KnightAbilities extends Abilities {
    private final int executeBaseDamage = 200;
    private final int executeLevelDamage = 30;
    private final float hp = 0.2f;
    private final float executeLevelHP = 0.01f;
    private final float executeRogueModifier = 1.15f;
    private final  float executeKnightModifier = 1f;
    private final float executePyromancerModifier = 1.1f;
    private final float executeWizardModifier = 0.8f;
    private final int slamBaseDamage = 100;
    private final int slamLevelDamage = 40;
    private final float slamRogueModifier = 0.8f;
    private final float slamKnightModifier = 1.2f;
    private final float slamPyromancerModifier = 0.9f;
    private final float slamdWizardModifier = 1.05f;
    private int firstAbilityDamage;
    private int secondAbilityDamage;
    private int totalDamage;
    private float locationModifier;

    @Override
    public int visit(Wizard wizard) {
        if (wizard.getLocation().equals("L")) {
            locationModifier = 1.15f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((executeBaseDamage + executeLevelDamage * wizard.getLevel()) *
                locationModifier) * executeWizardModifier);
        secondAbilityDamage = Math.round(Math.round((slamBaseDamage + slamBaseDamage* wizard.getLevel()) *
                locationModifier) * slamdWizardModifier);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;
    }

    @Override
    public int visit(Rogue rogue) {
        if (rogue.getLocation().equals("L")) {
            locationModifier = 1.15f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((executeBaseDamage + executeLevelDamage * rogue.getLevel()) *
                locationModifier) * executeRogueModifier);
        secondAbilityDamage = Math.round(Math.round((slamBaseDamage + slamBaseDamage* rogue.getLevel()) *
                locationModifier) * slamRogueModifier);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;
    }

    @Override
    public int visit(Knight knight) {
        if (knight.getLocation().equals("L")) {
            locationModifier = 1.15f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((executeBaseDamage + executeLevelDamage * knight.getLevel()) *
                locationModifier) * executeKnightModifier);
        secondAbilityDamage = Math.round(Math.round((slamBaseDamage + slamBaseDamage* knight.getLevel()) *
                locationModifier) * slamKnightModifier);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;

    }

    @Override
    public int visit(Pyromancer pyromancer) {
        if (pyromancer.getLocation().equals("L")) {
            locationModifier = 1.15f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((executeBaseDamage + executeLevelDamage * pyromancer.getLevel()) *
                locationModifier) * executePyromancerModifier);
        secondAbilityDamage = Math.round(Math.round((slamBaseDamage + slamBaseDamage* pyromancer.getLevel()) *
                locationModifier) * slamPyromancerModifier);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;

    }
}
