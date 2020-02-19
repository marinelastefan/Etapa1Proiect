package heroes;

import abilities.Abilities;
import abilities.RogueAbilities;
import angels.Angels;
import strategies.RogueStrategy;

import java.util.Map;

public final class Rogue extends  Heroes {


    public Rogue(final int initialHP, final int xp, final int hp, final int level,
                 final int xLocation,
                 final int yLocation, final String status, final String typeOfHero,
                 final int levelHp, final Map<String, Float> raceModifiers1,
                 final Map<String, Float> raceModifiers2) {
        super(initialHP, xp, hp, level, xLocation, yLocation,
                status, typeOfHero, levelHp, raceModifiers1, raceModifiers2);
    }

    @Override
    public void fightWith(final Heroes enemy) {
        Abilities rogueAbilities = new RogueAbilities();
        int damage;
        //lupta va mai avea loc doar daca adversarul nu a murit din damage Overtime
        if (enemy.getIsDeadOvertime() != 1 && this.getIsDeadOvertime() != 1) {
            damage = rogueAbilities.damageCalculator(enemy, this);
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
        this.setHeroesStrategies(new RogueStrategy());
        this.useStrategy(this);

    }


}

