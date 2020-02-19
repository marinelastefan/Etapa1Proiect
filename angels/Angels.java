package angels;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public abstract class Angels extends Subject {
    private int rowLoc;
    private int colLoc;
    private AngelsType angelsType;
    private GoodOrNot angelGoodOrNot;
    private int heroWasKilledInFight;
    private int broughtToLife;
    private int killedAHero;

    public final int getKilledAHero() {
        return killedAHero;
    }

    public final void setKilledAHero(final int killedAHero) {
        this.killedAHero = killedAHero;
    }

    public final int getBroughtToLife() {
        return broughtToLife;
    }

    public final void setBroughtToLife(final int broughtToLife) {
        this.broughtToLife = broughtToLife;
    }

    public final int getAngelHelpedorHit() {
        return angelHelpedorHit;
    }

    public final void setAngelHelpedorHit(final int angelHelpedorHit) {
        this.angelHelpedorHit = angelHelpedorHit;
    }

    private int angelHelpedorHit = 0;


    public final int getHeroWasKilledInFight() {
        return heroWasKilledInFight;
    }

    public final void setHeroWasKilledInFight(final int heroWasKilledInFight) {
        this.heroWasKilledInFight = heroWasKilledInFight;
    }

    public Angels() {

    }
    public Angels(final int rowPos, final int colPos,
                  final AngelsType angelsType, final GoodOrNot goodOrNot) {
        this.rowLoc = rowPos;
        this.colLoc = colPos;
        this.angelsType = angelsType;
        this.angelGoodOrNot = goodOrNot;
    }

    public final GoodOrNot getAngelGoodOrNot() {
        return angelGoodOrNot;
    }

    public final void setAngelGoodOrNot(final GoodOrNot angelGoodOrNot) {
        this.angelGoodOrNot = angelGoodOrNot;
    }

    public final AngelsType getAngelsType() {
        return angelsType;
    }

    public final void setAngelsType(final AngelsType angelsType) {
        this.angelsType = angelsType;
    }

    public final int getRowLoc() {
        return rowLoc;
    }

    public final void setRowLoc(final int rowLoc) {
        this.rowLoc = rowLoc;
    }

    public final int getColLoc() {
        return colLoc;
    }

    public final void setColLoc(final int colLoc) {
        this.colLoc = colLoc;
    }
    //metode pentru aplicarea visitorului
    public abstract void visit(Knight hero);
    public abstract void visit(Rogue hero);
    public abstract void visit(Wizard hero);
    public abstract void visit(Pyromancer hero);
}
