package heroes;

import abilities.Abilities;
import abilities.WizardAbilities;
import angels.Angels;
import strategies.WizardStrategy;
import java.util.Map;

public final class Wizard extends Heroes {


    public Wizard(final int initialHP, final int xp, final int hp, final int level,
                  final int xLocation,
                  final int yLocation, final String status, final String typeOfHero,
                  final int levelHp, final Map<String, Float> raceModifiers1,
                  final Map<String, Float> raceModifiers2) {
        super(initialHP, xp, hp, level, xLocation, yLocation,
                status, typeOfHero, levelHp, raceModifiers1, raceModifiers2);
    }

    @Override
    public void fightWith(final Heroes enemy) {
        Abilities wizardAbilities = new WizardAbilities();
        if (enemy.getIsDeadOvertime() != 1 && this.getIsDeadOvertime() != 1) {
            int damage = wizardAbilities.damageCalculator(enemy, this);
            enemy.decreaseHp(enemy, damage);
        }

    }

    @Override
    public void accept(final Heroes hero) {
        hero.fightWith(this);
    }
    @Override
    public void acceptAngel(final Angels angel) {
        angel.visit(this);
    }

    @Override
    public void applyStrategies(final Heroes hero) {
        this.setHeroesStrategies(new WizardStrategy());
        this.useStrategy(this);
    }


}
