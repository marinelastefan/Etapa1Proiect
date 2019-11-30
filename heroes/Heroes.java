package heroes;

import abilities.Abilities;
import abilities.RogueAbilities;

public abstract class Heroes {
    public float experience;
    public int hitPoints;
    public int maxHitPoints;
    private int xPosition;
    private int yPosition;
    private String typeOfHero;
    private String location;
    private int level;
    private float totalDamage;
    private int overtimeDamage;
    private int round;

    public int getRound() {
        return round;
    }

    public void setOvertimeDamage(int overtimeDamage) {
        this.overtimeDamage = overtimeDamage;
    }

    public void setTotalDamage(float totalDamage) {
        this.totalDamage = totalDamage;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setTypeOfHero(String typeOfHero) {
        this.typeOfHero = typeOfHero;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    public abstract int accept (Abilities abilities);
}
