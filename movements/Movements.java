package movements;
import heroes.Heroes;
import java.util.LinkedList;

public class Movements {
    public final void move(final LinkedList<Heroes> heroes,
                      final String movements, final char[][] mapMatrix) {
        /*pentru fiecare tip de erou il mut pe harta
        setez tipul de teren pe care se afla */
        for (int i = 0; i < heroes.size(); i++) {
            if (movements.charAt(i) == 'L' && heroes.get(i).getCanMove() == 0) {
                heroes.get(i).setyLocation(heroes.get(i).getyLocation() - 1);
                heroes.get(i).setLocation(String.valueOf(
                        mapMatrix[heroes.get(i).getxLocation()][heroes.get(i).getyLocation()]));
            }
            if (movements.charAt(i) == 'R' && heroes.get(i).getCanMove() == 0) {
                heroes.get(i).setyLocation(heroes.get(i).getyLocation() + 1);
                heroes.get(i).setLocation(String.valueOf(
                        mapMatrix[heroes.get(i).getxLocation()][heroes.get(i).getyLocation()]));
            }
            if (movements.charAt(i) == 'U' && heroes.get(i).getCanMove() == 0) {
                heroes.get(i).setxLocation(heroes.get(i).getxLocation() - 1);
                heroes.get(i).setLocation(String.valueOf(
                        mapMatrix[heroes.get(i).getxLocation()][heroes.get(i).getyLocation()]));
            }
            if (movements.charAt(i) == 'D' && heroes.get(i).getCanMove() == 0) {
                heroes.get(i).setxLocation(heroes.get(i).getxLocation() + 1);
                heroes.get(i).setLocation(String.valueOf(
                        mapMatrix[heroes.get(i).getxLocation()][heroes.get(i).getyLocation()]));
            }
            if (movements.charAt(i) == '_' || heroes.get(i).getCanMove() != 0) {
                heroes.get(i).setLocation(String.valueOf(
                        mapMatrix[heroes.get(i).getxLocation()][heroes.get(i).getyLocation()]));
            }


        }

    }
}
