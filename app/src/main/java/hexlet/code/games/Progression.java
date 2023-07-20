package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Progression {

    public static void playProgression() {
        String[][] array = new String[3][3];
        String startLogo = "What number is missing in the progression?";

        for (int j = 0; j < array.length; j++) {
            int length = ThreadLocalRandom.current().nextInt(5, 11);
            int hiddenNumer = ThreadLocalRandom.current().nextInt(1, length);
            int step = ThreadLocalRandom.current().nextInt(1, 11);
            int number = ThreadLocalRandom.current().nextInt(1, 101);
            StringBuilder question = new StringBuilder(" ");
            int answer = 0;

            for (int i = 0; i < length; i++) {
                number = number + step;
                if (i != hiddenNumer) {
                    question.append(" ").append(number).append(" ");
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
