package heroes;

public class Wizard extends Heroes {
    @Override
    public void fight(Heroes hero) {
        hero.fightWith(this);
    }

    @Override
    public void fightWith(Wizard wizard) {

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
