package heroes;

final public class HeroesFactory {
    private static HeroesFactory heroesFactory = null;
    private HeroesFactory() { }
    Heroes createHero(final String type) {
            switch (type) {
                case "W": return new Wizard();
                case "P": return new Pyromancer();
                case "K": return new Knight();
                case "R": return new Rogue();
                default : return null;
            }

    }

}
