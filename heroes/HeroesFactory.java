package heroes;

import constants.HeroesConstants;
import constants.LandModifiersFactory;

final public class HeroesFactory {
    private static HeroesFactory factory = null;
    private  HeroesFactory() { }
    public static HeroesFactory getFactory() {
         if (factory == null) {
            factory = new HeroesFactory();
        }
        return factory;
    }
   public  Heroes createHeroes(final String type, final int xLocation, final int yLocation) {
       LandModifiersFactory landModifiersFactory = new LandModifiersFactory();
        switch (type) {
            case "K": return new Knight(HeroesConstants.getKnightInitialHp(),
                    HeroesConstants.getInitialXp(), HeroesConstants.getKnightInitialHp(),
                    HeroesConstants.getInitialLevel(), xLocation, yLocation, "ALIVE",
                    "K",
                    HeroesConstants.getKnightLevelHp(),
                    landModifiersFactory.getMapExecuteModifiers(),
                    landModifiersFactory.getMapSlamModifiers());
            case "P": return  new Pyromancer(HeroesConstants.getPyromancerInitialHp(),
                    HeroesConstants.getInitialXp(), HeroesConstants.getPyromancerInitialHp(),
                    HeroesConstants.getInitialLevel(), xLocation, yLocation,
                    "ALIVE", "P", HeroesConstants.getPyromancerLevelHp(),
                    landModifiersFactory.getMapFireblastModifiers(),
                    landModifiersFactory.getMapIgniteModifiers());
            case "W": return new Wizard(HeroesConstants.getWizardInitialHp(),
                    HeroesConstants.getInitialXp(), HeroesConstants.getWizardInitialHp(),
                    HeroesConstants.getInitialLevel(), xLocation, yLocation, "ALIVE",
                    "W", HeroesConstants.getWizardLevelHp(),
                    landModifiersFactory.getMapDrainModifiers(),
                    landModifiersFactory.getMapDeflectModifiers());
            case "R": return  new Rogue(HeroesConstants.getRogueInitialHp(),
                    HeroesConstants.getInitialXp(), HeroesConstants.getRogueInitialHp(),
                    HeroesConstants.getInitialLevel(), xLocation, yLocation,
                    "ALIVE", "R", HeroesConstants.getRogueLevelHp(),
                    landModifiersFactory.getMapBackstabModifiers(),
                    landModifiersFactory.getMapParalysisModifiers());
            default : return null;
        }
    }
 }
