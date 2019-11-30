package abilities;
import heroes.Wizard;
import heroes.Rogue;
import  heroes.Knight;
import heroes.Pyromancer;

public abstract class Abilities {
    public abstract int  visit (Wizard wizard);
    public abstract int visit( Rogue rogue);
    public abstract int visit (Knight knight);
    public  abstract int visit (Pyromancer pyromancer);

}
