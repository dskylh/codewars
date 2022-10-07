package BuildTower;

public class Kata {
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        int floorNum = 1;
        int max = nFloors * 2 - 1;
        for (int i = 0; i < nFloors; i++) {
            // 1 3 5 7 9 11
            result[i] = " ".repeat((max - floorNum) / 2).concat("*".repeat(floorNum))
                    .concat(" ".repeat((max - floorNum) / 2));
            floorNum += 2;
        }
        return result;
    }
}
