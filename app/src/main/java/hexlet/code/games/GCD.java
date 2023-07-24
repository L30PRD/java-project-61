package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class GCD {

    public static void gameGCD() {
        String[][] answers = new String[Engine.arrRows][Engine.arrColums];
        String startLogo = "Find the greatest common divisor of given numbers.";


        for (int j = 0; j < answers.length; j++) {
            int number1 = ThreadLocalRandom.current().nextInt(Engine.rndStart, Engine.rndEnd);
            int number2 = ThreadLocalRandom.current().nextInt(Engine.rndStart, Engine.rndEnd);
            int maximum = Math.max(number1, number2);
            int minimum = Math.min(number1, number2);
            int result = 0;

            for (int i = 1; i <= maximum; i++) {
                if ((minimum % i) == 0 && (maximum % i) == 0) {
                    result = i;
                }
            }
            answers[j] = new String[] {number1 + " " + number2, Integer.toString(result)};

        }
        Engine.engine(startLogo, answers);
    }
}
