package heroes;

import angels.Angels;
import constants.HeroesConstants;
import strategies.HeroesStrategies;

import java.util.Map;

public abstract class Heroes {
   private  int initialHP = 0;
   private int xp;
   private int hp;
   private int level = 0;
   private int xLocation;
   private int yLocation;
   private String status;
   private int round;
   private int paralysisOvertimeDamage;
   private int igniteOvertimeDamage;
   private int slamOvertimeDamage;
   private int isDeadOvertime;
   private String location;
   private String typeOfHero;
   private int damageReceived;
   private int canMove;
   private int levelHp;
   private HeroesStrategies strategy;
   private int id;
   private int updatedHisLevel;
   private Map<String, Float> raceModifiers1;
   private Map<String, Float> raceModifiers2;
   private int deadBefore;

    public final int getDeadBefore() {
        return deadBefore;
    }

    public final void setDeadBefore(final int deadBefore) {
        this.deadBefore = deadBefore;
    }

    public final Float getRaceModifiers1(final String hero) {
        return raceModifiers1.get(hero);
    }

    public final Float getRaceModifiers2(final String hero) {
        return raceModifiers2.get(hero);
    }

    public final Map<String, Float> getMapRaceModifiers1() {
        return raceModifiers1;
    }

    public final Map<String, Float> getMapRaceModifiers2() {
        return raceModifiers2;
    }

    public final int getUpdatedHisLevel() {
        return updatedHisLevel;
    }

    public final void setUpdatedHisLevel(final int updatedHisLevel) {
        this.updatedHisLevel = updatedHisLevel;
    }

    public final int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final void setHeroesStrategies(final HeroesStrategies strategy) {
       this.strategy = strategy;
   }

    public final int getSlamOvertimeDamage() {
        return slamOvertimeDamage;
    }

    public final void setSlamOvertimeDamage(final int slamOvertimeDamage) {
        this.slamOvertimeDamage = slamOvertimeDamage;
    }

    public final int getLevelHp() {
        return levelHp;
    }

    public final void setLevel(final int level) {
        this.level = level;
    }

    public final int getCanMove() {
        return canMove;
    }

    public final void setCanMove(final int canMove) {
        this.canMove = canMove;
    }

    public final int getDamageReceived() {
        return damageReceived;
    }

    public final void setDamageReceived(final int damageReceived) {

        this.damageReceived = damageReceived;
    }

    public final int getIgniteOvertimeDamage() {
        return igniteOvertimeDamage;
    }

    public final void setIgniteOvertimeDamage(final int igniteOvertimeDamage) {
        this.igniteOvertimeDamage = igniteOvertimeDamage;
    }


    public final String getTypeOfHero() {
        return typeOfHero;
    }

    public final int getIsDeadOvertime() {
        return isDeadOvertime;
    }
    public final void setIsDeadOvertime(final int isDeadOvertime) {
        this.isDeadOvertime = isDeadOvertime;
    }
    public final int getParalysisOvertimeDamage() {
        return paralysisOvertimeDamage;
    }

    public final void setParalysisOvertimeDamage(final int paralysisOvertimeDamage) {
        this.paralysisOvertimeDamage = paralysisOvertimeDamage;
    }

    public final String getLocation() {
        return location;
    }

    public final void setLocation(final String location) {

        this.location = location;
    }

    public final int getRound() {
        return round;
    }

    public final void setRound(final int round) {
        this.round = round;
    }

    public final void setXP(final int xp) {
        this.xp = xp;
    }
    public final void setHP(final int hp) {
        this.hp = hp;
    }
    public final void setxLocation(final int xLocation) {

        this.xLocation = xLocation;
    }

    public final void setyLocation(final int yLocation) {
        this.yLocation = yLocation;
    }
    public final int getInitialHP() {
        return initialHP;
    }
    public final int getXP() {
        return xp;
    }
    public final int getHP() {
        return hp;
    }
    public final int getLevel() {
        return level;
    }

    public final int getxLocation() {
        return xLocation;
    }

    public final int getyLocation() {
        return yLocation;
    }

    public final String getStatus() {
        return status;
    }
    public final void setStatus(final String status) {
        this.status = status;
    }
    public Heroes(final int initialHP, final int xp, final int hp, final int level,
                  final int xLocation,
                  final int yLocation, final String status, final String typeOfHero,
                  final int levelHp, final Map<String, Float> raceModifiers1,
                  final Map<String, Float> raceModifiers2) {
        this.initialHP = initialHP;
        this.xp = xp;
        this.hp = hp;
        this.level = level;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.status = status;
        this.typeOfHero = typeOfHero;
        this.levelHp = levelHp;
        this.raceModifiers1 = raceModifiers1;
        this.raceModifiers2 = raceModifiers2;

    }
    public final String getTheEntire(final String hero) {
        switch (hero) {
            case "K" : return "Knight";
            case "P" : return "Pyromancer";
            case "W" : return "Wizard";
            case "R" : return "Rogue";
            default: return null;
        }
    }
    public final void decreaseHp(final Heroes enemy, final int damage) {

        enemy.setHP(enemy.getHP() - damage);
    }
    //hero1-winner hero2 -loser
    public final void updateExperience(final Heroes hero1, final Heroes hero2) {
        int aux = HeroesConstants.getXpConstant()
                - (hero1.getLevel() - hero2.getLevel()) * HeroesConstants.getXpMultiplier();
        if (aux >= 0) {
            hero1.setXP(hero1.getXP() + aux);
        }
    }
    public final void updateLevel(final Heroes hero) {
        for (int i = 1; i < HeroesConstants.getMaximumLevel(); i++) {
            int aux = HeroesConstants.getLevelConstant()
                    + i * HeroesConstants.getLevelUpConstant();
            if (hero.getXP() >= aux) {
                hero.setLevel(i);
                hero.setHP(hero.getInitialHP() + i * hero.getLevelHp());
                hero.setUpdatedHisLevel(1);
            } else {
               break;
            }
        }
    }
    public final void increaseModifiers(final Float procent, final Map<String, Float> map) {
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            map.put(entry.getKey(), entry.getValue() + procent);
        }
    }
    public final void decreaseModifiers(final Float procent, final Map<String, Float> map) {
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            if (entry.getValue() != 1) {
                map.put(entry.getKey(), entry.getValue() - procent);
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }
    //use the strategy
    public final void useStrategy(final Heroes hero)
    {
        strategy.applyStrategy(hero);
    }
    public abstract void applyStrategies(Heroes hero);
    //visitor pentru lupte
    public abstract void fightWith(Heroes enemy);
    public abstract void accept(Heroes hero);
    //visitor pentru ingeri
    public abstract void acceptAngel(Angels angel);

}
