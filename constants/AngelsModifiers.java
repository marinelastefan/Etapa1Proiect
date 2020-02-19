package constants;

import java.util.HashMap;
import java.util.Map;

public final class AngelsModifiers {
    private static AngelsModifiers instance = null;
    private static class DamageAngelModifiers {
        private static final float KNIGHT_MODIFIER = 0.15f;
        private static final float PYROMANCER_MODIFIER = 0.2f;
        private static final float ROGUE_MODIFIER = 0.3f;
        private static final float WIZARD_MODIFIER = 0.4f;

    }

    private static class DarkAngel {
        private static final int KNIGHT_HP = 40;
        private static final int PYROMANCER_HP = 30;
        private static final int ROGUE_HP = 10;
        private static final int WIZARDHP = 20;
    }

    private static class Dracula {
        private static final float KNIGHT_MODIFIER = 0.2f;
        private static final float PYROMANCER_MODIFIER = 0.3f;
        private static final float ROGUE_MODIFIER = 0.1f;
        private static final float WIZARD_MODIFIER = 0.4f;

        private static final int KNIGHT_HP = 60;
        private static final int PYROMANCER_HP = 40;
        private static final int ROGUE_HP = 35;
        private static final int WIZARD_HP = 20;
    }
    private static class GoodBoy {
        private static final float KNIGHT_MODIFIERS = 0.4f;
        private static final float PYROMANCER_MODIFIERS = 0.5f;
        private static final float ROGUE_MODIFIERS = 0.4f;
        private static final float WIZARD_MODIFIERS = 0.3f;

        private static final int KNIGHT_HP = 20;
        private static final int PYROMANCER_HP = 30;
        private static final int ROGUE_HP = 40;
        private static final int WIZARD_HP = 50;

    }

    private static class LevelUpAngel {
        private static final float KNIGHTMODIFIER = 0.1f;
        private static final float PYROMANCERMODIFIER = 0.2f;
        private static final float ROGUEMODIFIER = 0.15f;
        private static final float WIZARDMODIFIER = 0.25f;
    }

    private static class LifeGiver {
        private static final int KNIGHTHP = 100;
        private static final int PYROMANCERHP = 80;
        private static final int WIZARDHP = 120;
        private static final int ROGUEHP = 90;
    }
    private static class SmallAngel {
        private static final float KNIGHTMODIFIERS = 0.1f;
        private static final float PYROMANCERMODIFIERS = 0.15f;
        private static final float ROGUEMODIFIERS = 0.05f;
        private static final float WIZARDMODIFIERS = 0.1f;

        private static final int KNIGHTHP = 10;
        private static final int PYROMANCERHP = 15;
        private static final int ROGUEHP = 20;
        private static final int WIZARDHP = 25;
    }
    private static class Spawner {
        private static final int KNIGHTHP = 200;
        private static final int PYROMANCERHP = 150;
        private static final int ROGUEHP = 180;
        private static final int WIZARDHP = 120;


    }
    private static class XPAngel {
        private static final int KNIGHTXP = 45;
        private static final int PYROMANCERXP = 50;
        private static final int ROGUEXP = 40;
        private static final int WIZARDXP = 60;
    }
    private Map<String, Float> damageAngelModifiers;
    private Map<String, Integer> darkAngelHp;
    private Map<String, Float> draculaModifiers;
    private Map<String, Integer> draculaHp;
    private Map<String, Float> goodBoyModifiers;
    private Map<String, Integer> goodBoyHp;
    private Map<String, Float> levelUpAngelModifiers;
    private Map<String, Integer> lifeGiver;
    private Map<String, Float> smallAngelModifiers;
    private Map<String, Integer> smallAngelHp;
    private Map<String, Integer> spawner;
    private Map<String, Integer> xpAngel;

    private AngelsModifiers() {
        damageAngelModifiers = new HashMap<>();
        darkAngelHp = new HashMap<>();
        draculaHp = new HashMap<>();
        draculaModifiers = new HashMap<>();
        goodBoyModifiers = new HashMap<>();
        goodBoyHp = new HashMap<>();
        levelUpAngelModifiers = new HashMap<>();
        lifeGiver = new HashMap<>();
        smallAngelHp = new HashMap<>();
        smallAngelModifiers = new HashMap<>();
        spawner = new HashMap<>();
        xpAngel = new HashMap<>();

        initDamageAngelModifiers();
        initDarkAngelHp();
        initDraculaHp();
        initDraculaModifiers();
        initGoodBoyHp();
        initGoodBoyModifiers();
        initLevelUpModifiers();
        initLifeGiver();
        initSmallAngelHp();
        initSmallAngelModifiers();
        initSpawner();
        initXpAngel();

    }
    private void initDamageAngelModifiers() {
        damageAngelModifiers.put("K", DamageAngelModifiers.KNIGHT_MODIFIER);
        damageAngelModifiers.put("R", DamageAngelModifiers.ROGUE_MODIFIER);
        damageAngelModifiers.put("P", DamageAngelModifiers.PYROMANCER_MODIFIER);
        damageAngelModifiers.put("W", DamageAngelModifiers.WIZARD_MODIFIER);
    }
    private void  initDarkAngelHp() {
        darkAngelHp.put("K", DarkAngel.KNIGHT_HP);
        darkAngelHp.put("R", DarkAngel.ROGUE_HP);
        darkAngelHp.put("W", DarkAngel.WIZARDHP);
        darkAngelHp.put("P", DarkAngel.PYROMANCER_HP);
    }
    private void initDraculaHp() {
        draculaHp.put("K", Dracula.KNIGHT_HP);
        draculaHp.put("P", Dracula.PYROMANCER_HP);
        draculaHp.put("R", Dracula.ROGUE_HP);
        draculaHp.put("W", Dracula.WIZARD_HP);
    }
    private void initDraculaModifiers() {
        draculaModifiers.put("K", Dracula.KNIGHT_MODIFIER);
        draculaModifiers.put("R", Dracula.ROGUE_MODIFIER);
        draculaModifiers.put("P", Dracula.PYROMANCER_MODIFIER);
        draculaModifiers.put("W", Dracula.WIZARD_MODIFIER);
    }
    private void initGoodBoyModifiers() {
        goodBoyModifiers.put("K", GoodBoy.KNIGHT_MODIFIERS);
        goodBoyModifiers.put("R", GoodBoy.ROGUE_MODIFIERS);
        goodBoyModifiers.put("P", GoodBoy.PYROMANCER_MODIFIERS);
        goodBoyModifiers.put("W", GoodBoy.WIZARD_MODIFIERS);
    }
    private void initGoodBoyHp() {
        goodBoyHp.put("K", GoodBoy.KNIGHT_HP);
        goodBoyHp.put("R", GoodBoy.ROGUE_HP);
        goodBoyHp.put("P", GoodBoy.PYROMANCER_HP);
        goodBoyHp.put("W", GoodBoy.WIZARD_HP);
    }
    private void initLevelUpModifiers() {
        levelUpAngelModifiers.put("K", LevelUpAngel.KNIGHTMODIFIER);
        levelUpAngelModifiers.put("R", LevelUpAngel.ROGUEMODIFIER);
        levelUpAngelModifiers.put("P", LevelUpAngel.PYROMANCERMODIFIER);
        levelUpAngelModifiers.put("W", LevelUpAngel.WIZARDMODIFIER);
    }
    private void initLifeGiver() {
        lifeGiver.put("K", LifeGiver.KNIGHTHP);
        lifeGiver.put("R", LifeGiver.ROGUEHP);
        lifeGiver.put("P", LifeGiver.PYROMANCERHP);
        lifeGiver.put("W", LifeGiver.WIZARDHP);
    }
    private void initSmallAngelModifiers() {
        smallAngelModifiers.put("K", SmallAngel.KNIGHTMODIFIERS);
        smallAngelModifiers.put("R", SmallAngel.ROGUEMODIFIERS);
        smallAngelModifiers.put("P", SmallAngel.PYROMANCERMODIFIERS);
        smallAngelModifiers.put("W", SmallAngel.WIZARDMODIFIERS);

    }
    private void initSmallAngelHp() {
        smallAngelHp.put("K", SmallAngel.KNIGHTHP);
        smallAngelHp.put("R", SmallAngel.ROGUEHP);
        smallAngelHp.put("P", SmallAngel.PYROMANCERHP);
        smallAngelHp.put("W", SmallAngel.WIZARDHP);
    }
    private void initSpawner() {
        spawner.put("K", Spawner.KNIGHTHP);
        spawner.put("R", Spawner.ROGUEHP);
        spawner.put("P", Spawner.PYROMANCERHP);
        spawner.put("W", Spawner.WIZARDHP);
    }
    private void initXpAngel() {
        xpAngel.put("K", XPAngel.KNIGHTXP);
        xpAngel.put("R", XPAngel.ROGUEXP);
        xpAngel.put("P", XPAngel.PYROMANCERXP);
        xpAngel.put("W", XPAngel.WIZARDXP);
    }
    public static AngelsModifiers getInstance() {
        if (instance == null) {
            instance = new AngelsModifiers();
        }
        return instance;
    }

    public  Float getDamageAngelModifiers(final String hero) {
        return damageAngelModifiers.get(hero);
    }

    public  Integer getDarkAngelHp(final String hero) {
        return darkAngelHp.get(hero);
    }

    public  Float getDraculaModifiers(final String hero) {
        return draculaModifiers.get(hero);
    }

    public  Integer getDraculaHp(final String hero) {
        return draculaHp.get(hero);
    }

    public  Float getGoodBoyModifiers(final String hero) {
        return goodBoyModifiers.get(hero);
    }

    public  Integer getGoodBoyHp(final String hero) {
        return goodBoyHp.get(hero);
    }

    public  Float getLevelUpAngelModifiers(final String hero) {
        return levelUpAngelModifiers.get(hero);
    }

    public  Integer getLifeGiver(final String hero) {
        return lifeGiver.get(hero);
    }

    public  Float getSmallAngelModifiers(final String hero) {
        return smallAngelModifiers.get(hero);
    }

    public  Integer getSmallAngelHp(final String hero) {
        return smallAngelHp.get(hero);
    }

    public  Integer  getSpawner(final String hero) {
        return spawner.get(hero);
    }

    public  Integer  getXpAngel(final String hero) {
        return xpAngel.get(hero);
    }
}
