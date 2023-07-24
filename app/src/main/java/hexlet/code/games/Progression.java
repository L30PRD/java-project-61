package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Progression {
    public static final int START = 5;
    public static final int END = 11;

    public static void playProgression() {
        String[][] array = new String[Engine.ROWS][Engine.COLUMS];
        String startLogo = "What number is missing in the progression?";

        for (int j = 0; j < array.length; j++) {
            int length = ThreadLocalRandom.current().nextInt(START, END);
            int hiddenNumer = ThreadLocalRandom.current().nextInt(Engine.RNDSTART, length);
            int step = ThreadLocalRandom.current().nextInt(Engine.RNDSTART, END);
            int number = ThreadLocalRandom.current().nextInt(Engine.RNDSTART, Engine.RNDEND);
            StringBuilder question = new StringBuilder("");
            int answer = 0;

            for (int i = 0; i < length; i++) {
                number = number + step;
                if (i != hiddenNumer) {
                    question.append(number).append(" ");
                } else {
                    question.append(".. ");
                    answer = number;
                }
            }
            array[j] = new String[]{question.toString(), Integer.toString(answer)};
        }
        Engine.engine(startLogo, array);


    }
}
