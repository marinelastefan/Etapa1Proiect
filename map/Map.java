package map;

public class Map {
    TypeOfLand typeOfLand;
    //singleton pentru crearea hartii
    private static Map map = null;
    private Map() { }
    public static Map getMap() {
        if(map == null) {
            map = new Map();
        }
        return map;
    }
}
