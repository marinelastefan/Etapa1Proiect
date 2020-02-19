package angels;

public final class AngelsFactory {
    private static AngelsFactory angelsFactory = null;
    private  AngelsFactory() { }
    //singleton pentru factory
    public static AngelsFactory getAngelsFactory() {
        if (angelsFactory == null) {
            angelsFactory = new AngelsFactory();
        }
        return angelsFactory;
    }
    public  Angels createAngels(final String type,  final int xPos, final int yPos) {
        switch (type) {
            case "DamageAngel": return new DamageAngel(xPos, yPos,
                    AngelsType.DamageAngel, GoodOrNot.Good);
            case "DarkAngel" : return new DarkAngel(xPos, yPos,
                    AngelsType.DarkAngel, GoodOrNot.Bad);
            case "Dracula" : return new Dracula(xPos, yPos,
                    AngelsType.Dracula, GoodOrNot.Bad);
            case "GoodBoy" : return new GoodBoy(xPos, yPos,
                    AngelsType.GoodBoy, GoodOrNot.Good);
            case "LevelUpAngel" : return new LevelUpAngel(xPos, yPos,
                    AngelsType.LevelUpAngel, GoodOrNot.Good);
            case "LifeGiver" : return new LifeGiver(xPos, yPos,
                    AngelsType.LifeGiver, GoodOrNot.Good);
            case "SmallAngel" : return new SmallAngel(xPos, yPos,
                    AngelsType.SmallAngel, GoodOrNot.Good);
            case "Spawner" : return new Spawner(xPos, yPos,
                    AngelsType.Spawner, GoodOrNot.Good);
            case "XPAngel" : return new XpAngel(xPos, yPos,
                    AngelsType.XPAngel, GoodOrNot.Good);
            case "TheDoomer" : return new TheDoomer(xPos, yPos,
                    AngelsType.TheDoomer, GoodOrNot.Bad);
            default: return null;
        }
    }
}
