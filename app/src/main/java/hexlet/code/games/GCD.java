package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class GCD {
    public static final int RANGE = 101;
    public static final String LOGO = "Find the greatest common divisor of given numbers.";

    public static void gameGCD() {
        String[][] answers = new String[Engine.ROUNDS][Engine.ROUNDS];

        for (int j = 0; j < answers.length; j++) {
            int number1 = Util.random(RANGE);
            int number2 = Util.random(RANGE);

            answers[j] = new String[] {number1 + " " + number2, Integer.toString(calcGCD(number1, number2))};
        }
        Engine.engine(LOGO, answers);
    }

    public static int calcGCD(int a, int b) {
        int maximum = Math.max(a, b);
        int minimum = Math.min(a, b);
        int result = 0;

        for (int i = 1; i <= maximum; i++) {
            if ((minimum % i) == 0 && (maximum % i) == 0) {
                result = i;
            }
        }
        return  result;
    }
}
