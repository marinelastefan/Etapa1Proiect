package constants;
import java.util.HashMap;
import java.util.Map;

public  class LandModifiersFactory {
    //private static LandModifiersFactory instance = null;
    private static class PyromancerModifiers {
        private static final float FIREBLAST_DAMAGE =  350;
        private static final float FIREBLAST_LEVEL_DAMAGE =  50;
        private static final float ROGUE_FIREBLAST_MODIFIER = 0.8f;
        private static final float WIZARD_FIREBLAST_MODIFIER = 1.05f;
        private static final float KNIGHT_FIREBLAST_MODIFIER = 1.2f;
        private static final float PYROMANCER_FIREBLAST_MODIFIER = 0.9f;

        private static final float IGNITE_BASE_DAMAGE = 150;
        private static final float IGNITE_LEVEL_DAMAGE = 20;
        private static final float OVERTIME_IGNITE_BASE_DAMAGE = 50;
        private static final float OVERTIME_IGNITE_LEVEL_DAMAGE = 30;

        private static final float ROGUE_IGNITE_MODIFIER = 0.8f;
        private static final float WIZARD_IGNITE_MODIFIER = 1.05f;
        private static final float KNIGHT_IGNITE_MODIFIER = 1.2f;
        private static final float PYROMANCER_IGNITE_MODIFIER = 0.9f;
        private static final float LAND_MODIFIER = 1.25f;
    }
    private static class KnightModifier {
        private static final float EXECUTE_BASE_DAMAGE = 200;
        private static final float EXECUTE_LEVEL_DAMAGE = 30;
        private static final float ROGUE_EXECUTE_DAMAGE = 1.15f;
        private static final float KNIGHT_EXECUTE_DAMAGE = 1f;
        private static final float PYROMANCER_EXECUTE_DAMAGE = 1.10f;
        private static final float WIZARD_EXECUTE_DAMAGE = 0.8f;

        private static final float SLAM_BASE_DAMAGE = 100;
        private static final float SLAM_LEVEL_DAMAGE = 40;
        private static final float ROGUE_SLAM_DAMAGE = 0.8f;
        private static final float KNIGHT_SLAM_DAMAGE = 1.2f;
        private static final float PYROMANCER_SLAM_DAMAGE = 0.9f;
        private static final float WIZARD_SLAM_DAMAGE = 1.05f;

        private static final float LAND_MODIFER = 1.15f;
    }

    private static class WizardModifiers {
        private static final float DRAIN_PROCENT = 0.2f;
        private static final float DRAIN_LEVEL_PROCENT = 0.05f;
        private static final float DRAIN_ROGUE_MODIFIERS = 0.8f;
        private static final float DRAIN_KNIGHT_MODIFIERS = 1.2f;
        private static final float DRAIN_PYROMANCER_MODIFIERS = 0.9f;
        private static final float DRAIN_WIZARD_MODIFIERS = 1.05f;

        private static final float DEFLECT_PROCENT = 0.35f;
        private static final float DEFLECT_LEVEL_PROCENT = 0.02f;
        private static final float ROGUE_DEFLECT_PROCENT = 1.2f;
        private static final float KNIGHT_DEFLECT_PROCENT = 1.4f;
        private static final float PYROMANCER_DEFLECT_PROCENT = 1.3f;
        private static final float LAND_MODIFIER = 1.1f;

    }
    private static class RogueModifiers {
        private static final float BACKSTAB_BASE_DAMAGE = 200;
        private static final float BACKSTAB_LEVEL_DAMAGE = 20;
        private static final float ROGUE_BACKSTAB_MODIFIER = 1.2f;
        private static final float KNIGHT_BACKSTAB_MODIFIER = 0.9f;
        private static final float PYROMANCER_BACKSTAB_MODIFIER = 1.25f;
        private static final float WIZARD_BACKSTAB_MODIFIER = 1.25f;

        private static final float PARALYSIS_BASE_DAMAGE = 40;
        private static final float PARALYSIS_LEVEL_DAMAGE = 10;
        private static final float ROGUE_PARALYSYS_MODIFIER = 0.9f;
        private static final float KNIGHT_PARALYSIS_MODIFER = 0.8f;
        private static final float PYROMANCER_PARALYSIS_MODIFIER = 1.2f;
        private static final float WIZARD_PARALYSIS_MODIFIER = 1.25f;
        private static final float WOODS_MODIFIER = 1.15f;
    }
    private  Map<String, Float> fireblastModifiers;
    private  Map<String, Float> igniteModifiers;
    private  Map<String, Float> executeModifiers;
    private  Map<String, Float> slamModifiers;
    private  Map<String, Float> drainModifiers;
    private  Map<String, Float> deflectModifiers;
    private  Map<String, Float> backstabModifiers;
    private  Map<String, Float> paralysisModifiers;
    private Map<String, Float> allDamages;
    private Map<String, Float> allLevelDamages;
    private Map<String, Float> landModifiers;
    private  Map<String, Float> overtimeIgnite;
    private static final int NMB_OVERTIME_PARALYSIS_DAMAGE = 3;
    private static final int SUPER_NMB_OVERTIME_PARALYSIS_DAMAGE = 6;
    private static final float CRITICAL_DAMAGE = 1.5f;
    private static final float NO_MODIFIERS = 1f;


    public  static float getCriticalDamage() {
        return CRITICAL_DAMAGE;
    }

    public  static float getNoModifiers() {
        return NO_MODIFIERS;
    }

    public static int getNmbOvertimeParalysisDamage() {
        return NMB_OVERTIME_PARALYSIS_DAMAGE;
    }

    public static int getSuperNmbOvertimeParalysisDamage() {
        return SUPER_NMB_OVERTIME_PARALYSIS_DAMAGE;
    }

    public LandModifiersFactory() {
        fireblastModifiers = new HashMap<String, Float>();
        igniteModifiers = new HashMap<String, Float>();
        executeModifiers = new HashMap<>();
        slamModifiers = new HashMap<>();
        drainModifiers = new HashMap<>();
        deflectModifiers = new HashMap<>();
        backstabModifiers = new HashMap<>();
        paralysisModifiers = new HashMap<>();
        allDamages = new HashMap<>();
        allLevelDamages = new HashMap<>();
        landModifiers = new HashMap<>();
        overtimeIgnite = new HashMap<>();
        initKnightModifiers();
        initPyromancerModifier();
        initRogueModifiers();
        initWizardModifiers();

    }
    private void initPyromancerModifier() {
        fireblastModifiers.put("R", PyromancerModifiers.ROGUE_FIREBLAST_MODIFIER);
        fireblastModifiers.put("K", PyromancerModifiers.KNIGHT_FIREBLAST_MODIFIER);
        fireblastModifiers.put("P", PyromancerModifiers.PYROMANCER_FIREBLAST_MODIFIER);
        fireblastModifiers.put("W", PyromancerModifiers.WIZARD_FIREBLAST_MODIFIER);
        allDamages.put("fireblast", PyromancerModifiers.FIREBLAST_DAMAGE);
        allLevelDamages.put("fireblast", PyromancerModifiers.FIREBLAST_LEVEL_DAMAGE);

        igniteModifiers.put("R", PyromancerModifiers.ROGUE_IGNITE_MODIFIER);
        igniteModifiers.put("K", PyromancerModifiers.KNIGHT_IGNITE_MODIFIER);
        igniteModifiers.put("P", PyromancerModifiers.PYROMANCER_IGNITE_MODIFIER);
        igniteModifiers.put("W", PyromancerModifiers.WIZARD_IGNITE_MODIFIER);
        allDamages.put("ignite", PyromancerModifiers.IGNITE_BASE_DAMAGE);
        allLevelDamages.put("ignite", PyromancerModifiers.IGNITE_LEVEL_DAMAGE);
        overtimeIgnite.put("base", PyromancerModifiers.OVERTIME_IGNITE_BASE_DAMAGE);
        overtimeIgnite.put("level", PyromancerModifiers.OVERTIME_IGNITE_LEVEL_DAMAGE);

        landModifiers.put("V", PyromancerModifiers.LAND_MODIFIER);

    }


    private void initRogueModifiers() {
        backstabModifiers.put("R", RogueModifiers.ROGUE_BACKSTAB_MODIFIER);
        backstabModifiers.put("K", RogueModifiers.KNIGHT_BACKSTAB_MODIFIER);
        backstabModifiers.put("W", RogueModifiers.WIZARD_BACKSTAB_MODIFIER);
        backstabModifiers.put("P", RogueModifiers.PYROMANCER_BACKSTAB_MODIFIER);
        allDamages.put("backstab", RogueModifiers.BACKSTAB_BASE_DAMAGE);
        allLevelDamages.put("backstab", RogueModifiers.BACKSTAB_LEVEL_DAMAGE);

        paralysisModifiers.put("R", RogueModifiers.ROGUE_PARALYSYS_MODIFIER);
        paralysisModifiers.put("K", RogueModifiers.KNIGHT_PARALYSIS_MODIFER);
        paralysisModifiers.put("W", RogueModifiers.WIZARD_PARALYSIS_MODIFIER);
        paralysisModifiers.put("P", RogueModifiers.PYROMANCER_PARALYSIS_MODIFIER);
        allDamages.put("paralysis", RogueModifiers.PARALYSIS_BASE_DAMAGE);
        allLevelDamages.put("paralysis", RogueModifiers.PARALYSIS_LEVEL_DAMAGE);

        landModifiers.put("W", RogueModifiers.WOODS_MODIFIER);
    }


    private void initKnightModifiers() {
        executeModifiers.put("R", KnightModifier.ROGUE_EXECUTE_DAMAGE);
        executeModifiers.put("K", KnightModifier.KNIGHT_EXECUTE_DAMAGE);
        executeModifiers.put("W", KnightModifier.WIZARD_EXECUTE_DAMAGE);
        executeModifiers.put("P", KnightModifier.PYROMANCER_EXECUTE_DAMAGE);
        allDamages.put("execute", KnightModifier.EXECUTE_BASE_DAMAGE);
        allLevelDamages.put("execute", KnightModifier.EXECUTE_LEVEL_DAMAGE);

        slamModifiers.put("R", KnightModifier.ROGUE_SLAM_DAMAGE);
        slamModifiers.put("K", KnightModifier.KNIGHT_SLAM_DAMAGE);
        slamModifiers.put("W", KnightModifier.WIZARD_SLAM_DAMAGE);
        slamModifiers.put("P", KnightModifier.PYROMANCER_SLAM_DAMAGE);
        allDamages.put("slam", KnightModifier.SLAM_BASE_DAMAGE);
        allLevelDamages.put("slam", KnightModifier.SLAM_LEVEL_DAMAGE);

        landModifiers.put("L", KnightModifier.LAND_MODIFER);
    }
    private void initWizardModifiers() {
        drainModifiers.put("R", WizardModifiers.DRAIN_ROGUE_MODIFIERS);
        drainModifiers.put("K", WizardModifiers.DRAIN_KNIGHT_MODIFIERS);
        drainModifiers.put("P", WizardModifiers.DRAIN_PYROMANCER_MODIFIERS);
        drainModifiers.put("W", WizardModifiers.DRAIN_WIZARD_MODIFIERS);
        allDamages.put("drain", WizardModifiers.DRAIN_PROCENT);
        allLevelDamages.put("drain", WizardModifiers.DRAIN_LEVEL_PROCENT);

        deflectModifiers.put("R", WizardModifiers.ROGUE_DEFLECT_PROCENT);
        deflectModifiers.put("P", WizardModifiers.PYROMANCER_DEFLECT_PROCENT);
        deflectModifiers.put("K", WizardModifiers.KNIGHT_DEFLECT_PROCENT);
        allDamages.put("deflect", WizardModifiers.DEFLECT_PROCENT);
        allLevelDamages.put("deflect", WizardModifiers.DEFLECT_LEVEL_PROCENT);

        landModifiers.put("D", WizardModifiers.LAND_MODIFIER);
    }
    /*public static LandModifiersFactory getInstance(){
        if (instance == null) {
            instance = new LandModifiersFactory();
        }
        return instance;
    }*/

    public final Float getAllDamages(final String ability) {

        return allDamages.get(ability);
    }

    public final Float getAllLevelDamages(final String ability) {

        return allLevelDamages.get(ability);
    }
    public final Float getFireblastModifiers(final String typeOfHero) {
        return fireblastModifiers.get(typeOfHero); }

    public final Float getIgniteModifiers(final String typeOfHero) {
        return igniteModifiers.get(typeOfHero); }

    public final Float getExecuteModifiers(final String typeOfHero) {

        return executeModifiers.get(typeOfHero);
    }

    public final Float getSlamModifiers(final String typeOfHero) {

        return slamModifiers.get(typeOfHero);
    }

    public final Float getDrainModifiers(final String typeOfHero) {

        return drainModifiers.get(typeOfHero);
    }

    public final Float getDeflectModifiers(final String typeOfHero) {

        return deflectModifiers.get(typeOfHero);
    }

    public final Float getBackstabModifiers(final String typeOfHero) {

        return backstabModifiers.get(typeOfHero);
    }

    public final Float getParalysisModifiers(final String typeOfHero) {

        return paralysisModifiers.get(typeOfHero);
    }
    public final Float getLandModifiers(final String land) {

        return landModifiers.get(land);
    }

    public final Float getOvertimeIgnite(final String s) {

        return overtimeIgnite.get(s);
    }


    public final Map<String, Float> getMapExecuteModifiers() {
        return executeModifiers;
    }

    public final Map<String, Float> getMapSlamModifiers() {
        return slamModifiers;
    }

    public final Map<String, Float> getMapFireblastModifiers() {
        return fireblastModifiers;
    }

    public final Map<String, Float> getMapIgniteModifiers() {
        return igniteModifiers;
    }

    public final Map<String, Float> getMapBackstabModifiers() {
        return backstabModifiers;
    }

    public final Map<String, Float> getMapParalysisModifiers() {
        return paralysisModifiers;
    }

    public final Map<String, Float> getMapDrainModifiers() {
        return drainModifiers;
    }

    public final Map<String, Float> getMapDeflectModifiers() {
        return deflectModifiers;
    }
}
