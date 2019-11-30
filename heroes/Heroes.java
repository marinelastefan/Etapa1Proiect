package heroes;

public abstract class Heroes {
    float experience;
    float hitPoints;
    private int xPosition;
    private int yPosition;
    private String typeOfHero;
    private float locationModifier;
    private String location;
    private int level;
    private float damageFirstAbility;
    private float damageSecondAbility;
    private float totalDamage;

    public void setDamageFirstAbility(float damageFirstAbility) {
        this.damageFirstAbility = damageFirstAbility;
    }

    public void setDamageSecondAbility(float damageSecondAbility) {
        this.damageSecondAbility = damageSecondAbility;
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

    public void setLocationModifier(float landModifier) {
        this.locationModifier = landModifier;
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
    public abstract void fight(Heroes hero);
    public abstract void fightWith(Wizard wizard);
    public abstract  void  fightWith( Rogue rogue);
    public abstract void fightWith(Pyromancer pyromancer);
    public abstract void fightWith(Knight knight);
}
