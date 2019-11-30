package heroes;

import abilities.Abilities;
import abilities.RogueAbilities;

public class Rogue extends  Heroes {
    @Override
    public int accept(Abilities abilities) {
            return abilities.visit(this);
    }
    public int getRogueDamage ( Heroes enemy) {
        RogueAbilities rogueAbilities = new RogueAbilities();
        return enemy.accept(rogueAbilities);
    }
}

