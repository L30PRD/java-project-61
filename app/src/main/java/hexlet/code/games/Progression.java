package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Progression {
    public static final int START = 5;
    public static final int END = 11;

    public static void playProgression() {
        String[][] array = Util.newArray();
        String startLogo = "What number is missing in the progression?";

        for (int j = 0; j < array.length; j++) {
            int length = Util.randomFromUntil(START, END);
            int hiddenNumer = Util.randomUntil(length);
            int step = Util.randomUntil(END);
            int number = Util.random();
            int answer = number + ((hiddenNumer + 1) * step);
            array[j] = new String[]{buildProgression(length, hiddenNumer, step, number), Integer.toString(answer)};
        }
        Engine.engine(startLogo, array);
    }

    public static String buildProgression(int length, int hiddenNumer, int step, int number) {
        StringBuilder question = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            number = number + step;
            if (i != hiddenNumer) {
                question.append(number).append(" ");
            } else {
                question.append(".. ");
            }
        }
        return question.toString();
    }
}
