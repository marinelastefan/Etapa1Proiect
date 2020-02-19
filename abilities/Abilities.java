package abilities;
import constants.LandModifiersFactory;
import heroes.Heroes;

public  class Abilities {
 LandModifiersFactory factory = new LandModifiersFactory();
    public  int damageCalculator(final Heroes enemy, final Heroes hero) {
        return 0;
    }
    //metoda pentru aplicarea damage ului Paralysis
  public final void aplyParalysisOvertime(final Heroes enemy) {
     float locationModifier;
     //scad nr de runde cu overtime damage
     enemy.setParalysisOvertimeDamage(enemy.getParalysisOvertimeDamage() - 1);
     enemy.setCanMove(enemy.getCanMove() - 1);
     if (enemy.getLocation().equals("W")) {
         locationModifier = factory.getLandModifiers("W");
     } else {
         locationModifier = LandModifiersFactory.getNoModifiers();
     }
     //calculez damage-ul
     int damage = Math.round(Math.round(factory.getAllDamages("paralysis")
             * locationModifier) * factory.getParalysisModifiers(enemy.getTypeOfHero()));
     //actualizez hp-ul
     enemy.decreaseHp(enemy, damage);
     if (enemy.getHP() <= 0) {
         enemy.setIsDeadOvertime(1);
     }
  }
  //metoda pentru aplicarea damage ului overtime Ignite
  public final void applyIgniteOvertimeDamage(final Heroes enemy) {
      float locationModifier;
      if (enemy.getLocation().equals("V")) {
          locationModifier = factory.getLandModifiers("V");
      } else {
          locationModifier = LandModifiersFactory.getNoModifiers();
      }
      //calculez damage
    int damage = Math.round(Math.round(factory.getOvertimeIgnite("base"))
            * locationModifier
            * factory.getIgniteModifiers(enemy.getTypeOfHero()));
      //actualizez hp
    enemy.decreaseHp(enemy, damage);
    if (enemy.getHP() <= 0) {
     enemy.setIsDeadOvertime(1);
    }

  }
  public final void applySlamDamage(final Heroes enemy) {
      enemy.setCanMove(enemy.getCanMove() - 1);
  }
  //metoda pentru aplicarea damage-urilor Paralysis
  public final void applyAllOvertimeDamages(final Heroes hero) {
      if (hero.getParalysisOvertimeDamage() != 0) {
          aplyParalysisOvertime(hero);

      }
      if (hero.getIgniteOvertimeDamage() != 0) {
          applyIgniteOvertimeDamage(hero);
      }
  }
}
