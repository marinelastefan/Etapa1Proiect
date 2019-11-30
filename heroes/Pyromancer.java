package heroes;

import abilities.Abilities;
import abilities.PyromancerAbilities;

public class Pyromancer extends Heroes {

    @Override
    public int accept(Abilities abilities) {
        return abilities.visit(this);
    }
    public int getPyromancerDamage (Heroes enemy) {
        PyromancerAbilities pyromancerAbilities = new PyromancerAbilities();
        return enemy.accept(pyromancerAbilities);
    }
}
