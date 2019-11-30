package abilities;
import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public class WizardAbilities extends Abilities {
    private final float drainRogueModifier = 0.8f;
    private final float drainKnightModifier = 1.2f;
    private final float drainPyromancerModifier = 0.9f;
    private final float drainWizardModifier = 1.05f;
    private final float drainProcent = 0.2f;
    private final float drainLevel = 0.05f;
    private final float deflectRogueModifier = 1.2f;
    private final float deflectKnightModifier = 1.4f;
    private final float deflectPyromancerModifier = 1.3f;
    private final float deflectProcent = 0.35f;
    private int firstAbilityDamage;
    private int secondAbiliyDamage;
    private int totalDamage;
    private float locationModifier;


    @Override
    public void visit(Wizard wizard) {
        float procent = drainProcent + drainLevel * wizard.getLevel();
        float totalProcent = procent - drainProcent * procent;
        if(wizard.getLocation().equals("D")) {
            locationModifier = 1.1f;
        } else {
            locationModifier = 1f;
        }
        int minimum;
        if(wizard.hitPoints < wizard.maxHitPoints) {
            minimum = wizard.hitPoints;
        } else {
            minimum = wizard.maxHitPoints;
        }
        firstAbilityDamage = Math.round(Math.round(totalProcent * minimum * locationModifier) * drainWizardModifier);
        secondAbiliyDamage = 0;
        totalDamage = firstAbilityDamage;
    }

    @Override
    public void visit(Rogue rogue) {
        if (rogue.getLocation().equals("D")) {
            locationModifier = 1.1f;
        } else {
            locationModifier = 1f;
        }
        float procent = drainProcent + drainLevel * rogue.getLevel();
        float totalProcent = procent - drainProcent * procent;
        int minimum;
        if(rogue.hitPoints < rogue.maxHitPoints) {
            minimum = rogue.hitPoints;
        } else {
            minimum = rogue.maxHitPoints;
        }
        firstAbilityDamage = Math.round(Math.round(totalProcent * minimum * locationModifier) * drainRogueModifier);
        secondAbiliyDamage = Math.round(Math.round(drainProcent * locationModifier) *deflectRogueModifier);
        totalDamage = firstAbilityDamage + secondAbiliyDamage;

    }

    @Override
    public void visit(Knight knight) {
        if (knight.getLocation().equals("D")) {
            locationModifier = 1.1f;
        } else {
            locationModifier = 1f;
        }
        float procent = drainProcent + drainLevel * knight.getLevel();
        float totalProcent = procent - drainProcent * procent;
        int minimum;
        if(knight.hitPoints < knight.maxHitPoints) {
            minimum = knight.hitPoints;
        } else {
            minimum = knight.maxHitPoints;
        }
        firstAbilityDamage = Math.round(Math.round(totalProcent * minimum * locationModifier) * drainKnightModifier);
        secondAbiliyDamage = Math.round(Math.round(drainProcent * locationModifier) *deflectKnightModifier);
        totalDamage = firstAbilityDamage + secondAbiliyDamage;
    }

    @Override
    public void visit(Pyromancer pyromancer) {
        if(pyromancer.getLocation().equals("D")) {
            locationModifier = 1.1f;
        } else {
            locationModifier = 1f;
        }
        float procent = drainProcent + drainLevel * pyromancer.getLevel();
        float totalProcent = procent - drainProcent * procent;
        int minimum;
        if(pyromancer.hitPoints < pyromancer.maxHitPoints) {
            minimum = pyromancer.hitPoints;
        } else {
            minimum = pyromancer.maxHitPoints;
        }
        firstAbilityDamage = Math.round(Math.round(totalProcent * minimum * locationModifier) * drainPyromancerModifier);
        secondAbiliyDamage = Math.round(Math.round(drainProcent * locationModifier) *deflectPyromancerModifier);
        totalDamage = firstAbilityDamage + secondAbiliyDamage;

    }
}
