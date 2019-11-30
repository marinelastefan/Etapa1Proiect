package heroes;

public class Knight extends  Heroes {
    public abstract float executeDamage(Heroes hero);
    @Override
    public void fight(Heroes hero) {
        hero.fightWith(this);
    }

    @Override
    public void fightWith(Wizard wizard) {
        this.setLocationModifier(1f);
        if (this.getLocation().equals("L")) {
            this.setLocationModifier(1.15f);
            setDamageFirstAbility(exe);





        }

    }

    @Override
    public void fightWith(Rogue rogue) {

    }

    @Override
    public void fightWith(Pyromancer pyromancer) {

    }

    @Override
    public void fightWith(Knight knight) {

    }
}
