package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Prime {

    public static void playPrime() {
        String[][] array = Util.newArray();
        String startLogo = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < array.length; i++) {
            int number = Util.random();
            String answer = isPrime(number) ? "yes" : "no";
            array[i] = new String[]{Integer.toString(number), answer};
        }
        Engine.engine(startLogo, array);
    }

    public static boolean isPrime(int a) {
        for (int j = 2; j < Math.sqrt(a); j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
