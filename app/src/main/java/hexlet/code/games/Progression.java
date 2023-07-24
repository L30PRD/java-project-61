package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Progression {

    public static void playProgression() {
        String[][] array = new String[Engine.arrRows][Engine.arrColums];
        String startLogo = "What number is missing in the progression?";

        for (int j = 0; j < array.length; j++) {
            int amountStart = 5;
            int amountEnd = 11;
            int length = ThreadLocalRandom.current().nextInt(amountStart, amountEnd);
            int hiddenNumer = ThreadLocalRandom.current().nextInt(Engine.rndStart, length);
            int step = ThreadLocalRandom.current().nextInt(Engine.rndStart, amountEnd);
            int number = ThreadLocalRandom.current().nextInt(Engine.rndStart, Engine.rndEnd);
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
