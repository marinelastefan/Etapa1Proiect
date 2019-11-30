package abilities;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class RogueAbilities extends Abilities {
    private final int backstabBaseDamage = 200;
    private final int backstabLevelDamage = 20;
    private final float critical = 1.5f;
    private final float backstabRogueModifier = 1.2f;
    private final float backstabKnightMofifier = 0.9f;
    private final float backstabPyromancerModifier = 1.25f;
    private final float backstabWizardModifier = 1.25f;
    private int firstAbilityDamage;
    private int secondAbilityDamage;
    private final float paralysisRogueModifier = 0.9f;
    private final float paralysisKnightModifier = 0.8f;
    private final float paralysisWizardModifier = 1.25f;
    private final float paralysisPyromancerModifier = 1.20f;
    private final int paralysisBaseDamage = 40;
    private final int paralisysLevelDamage = 10;
    private float locationModifier;
    private int totalDamage;
    @Override
    public int visit (Wizard wizard) {
        if(wizard.getLocation().equals("W")) {
            locationModifier = 1.15f;
        } else {
            locationModifier = 1f;
        }
        firstAbilityDamage = Math.round(Math.round((backstabBaseDamage + wizard.getLevel()
                * backstabLevelDamage)*critical*locationModifier) * backstabWizardModifier);
        secondAbilityDamage = Math.round(Math.round((paralysisBaseDamage + wizard.getLevel()
                * paralisysLevelDamage) *locationModifier) * paralysisWizardModifier);
        wizard.setOvertimeDamage(6);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;
    }

    public int visit (Pyromancer pyromancer){
        if(pyromancer.getLocation().equals("W")) {
            locationModifier = 1.5f;
        } else {
            locationModifier = 1;
        }
        firstAbilityDamage = Math.round(Math.round((backstabBaseDamage + pyromancer.getLevel()
                * backstabLevelDamage)*critical*locationModifier) * backstabPyromancerModifier);
        secondAbilityDamage = Math.round(Math.round((paralysisBaseDamage + pyromancer.getLevel()
                * paralisysLevelDamage) *locationModifier) * paralysisPyromancerModifier);
        pyromancer.setOvertimeDamage(6);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;

    }
    public int visit (Knight knight) {
        if(knight.getLocation().equals("W")) {
            locationModifier = 1.5f;
        } else {
            locationModifier = 1;
        }
        firstAbilityDamage = Math.round(Math.round((backstabBaseDamage + knight.getLevel()
                * backstabLevelDamage)*critical*locationModifier) * backstabKnightMofifier);
        secondAbilityDamage = Math.round(Math.round((paralysisBaseDamage + knight.getLevel()
                * paralisysLevelDamage) *locationModifier) * paralysisKnightModifier);
        knight.setOvertimeDamage(6);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;

    }
    public int visit (Rogue rogue) {
        if(rogue.getLocation().equals("W")) {
            locationModifier = 1.5f;
        } else {
            locationModifier = 1;
        }
        firstAbilityDamage = Math.round(Math.round((backstabBaseDamage + rogue.getLevel()
                * backstabLevelDamage)*critical*locationModifier) * backstabRogueModifier);
        secondAbilityDamage = Math.round(Math.round((paralysisBaseDamage + rogue.getLevel()
                * paralisysLevelDamage) *locationModifier) * paralysisRogueModifier);
        rogue.setOvertimeDamage(6);
        totalDamage = firstAbilityDamage + secondAbilityDamage;
        return totalDamage;
    }
}
