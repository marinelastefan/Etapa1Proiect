package heroes;

import abilities.Abilities;
import abilities.KnightAbilities;

public class Knight extends  Heroes {


    @Override
    public int accept(Abilities abilities) {
        return abilities.visit(this);
    }
    //returnaza damage-ul pe care il va da Knight unui adversar de orice tip
    public int getKnightDamage(Heroes enemy) {
        KnightAbilities knightAbilities = new KnightAbilities();
        return enemy.accept(knightAbilities);
    }

}
