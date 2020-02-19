package heroes;
import abilities.Abilities;
import abilities.KnightAbilities;
import angels.Angels;
import strategies.KnightStrategy;
import java.util.Map;

public final class Knight extends  Heroes {


    public Knight(final int initialHP, final int xp, final int hp, final int level,
                  final int xLocation,
                  final int yLocation, final String status, final String typeOfHero,
                  final int levelHp, final Map<String, Float> raceModifiers1,
                  final Map<String, Float> raceModifiers2) {
        super(initialHP, xp, hp, level, xLocation, yLocation,
                status, typeOfHero, levelHp, raceModifiers1, raceModifiers2);
    }
    @Override
    public void fightWith(final Heroes enemy) {
        Abilities knightAbilities = new KnightAbilities();
        //lupta va mai avea loc doar daca adversarul nu a murit din damage Overtime
        if (enemy.getIsDeadOvertime() != 1 && this.getIsDeadOvertime() != 1) {
            int damage = knightAbilities.damageCalculator(enemy, this);
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
        this.setHeroesStrategies(new KnightStrategy());
        this.useStrategy(this);
    }


}
