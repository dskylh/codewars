package TakeATenMinuteWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int xCor = 0;
        int yCor = 0;
        for (char a : walk) {
            switch (a) {
                case 'n':
                    xCor++;
                    break;
                case 's':
                    xCor--;
                    break;
                case 'w':
                    yCor++;
                    break;
                case 'e':
                    yCor--;
                    break;
            }
        }
        return xCor == 0 && yCor == 0 && walk.length == 10;
    }
}
