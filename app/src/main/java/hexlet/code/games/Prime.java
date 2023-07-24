package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Prime {

    public static void playPrime() {
        String[][] array = new String[Engine.arrRows][Engine.arrColums];
        String startLogo = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < array.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(Engine.rndStart, Engine.rndEnd);
            String answer = "yes";
            for (int j = 2; j < Math.sqrt(number); j++) {
                if (number % j == 0) {
                    answer = "no";
                }
            }
            array[i] = new String[]{Integer.toString(number), answer};
        }
        Engine.engine(startLogo, array);
    }
}
