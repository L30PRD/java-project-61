package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Prime {
    public static final int RANGE = 101;
    public static final String LOGO = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {
        String[][] array = new String[Engine.ROUNDS][Engine.ROUNDS];

        for (int i = 0; i < array.length; i++) {
            int number = Util.randomFromUntil(2, RANGE);
            String answer = isPrime(number) ? "yes" : "no";
            array[i] = new String[]{Integer.toString(number), answer};
        }
        Engine.engine(LOGO, array);
    }

    public static boolean isPrime(int a) {
        if (a == 0 || a == 1) {
            return false;
        }
        for (int j = 2; j < Math.sqrt(a); j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
