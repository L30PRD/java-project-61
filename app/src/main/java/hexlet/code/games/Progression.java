package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Progression {
    public static final int START = 5;
    public static final int END = 11;
    public static final int RANGE = 101;
    public static final String LOGO = "What number is missing in the progression?";

    public static void playProgression() {
        String[][] array = new String[Engine.ROUNDS][Engine.ROUNDS];

        for (int j = 0; j < Engine.ROUNDS; j++) {
            int length = Util.randomFromUntil(START, END);
            int hiddenNumber = Util.random(length);
            int step = Util.random(END);
            int number = Util.random(RANGE);

            String[] question = buildProgression(length, step, number);
            String answer = question[hiddenNumber];
            question[hiddenNumber] = "..";
            array[j] = new String[]{String.join(" ", question), answer};
        }
        Engine.engine(LOGO, array);
    }

    public static String[] buildProgression(int length, int step, int number) {
        String[] array = new String[length];

        for (int i = 0; i < array.length; i++) {
            number = number + step;
            array[i] = Integer.toString(number);
        }
        return array;
    }
}
