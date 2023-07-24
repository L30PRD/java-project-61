package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Progression {

    public static void playProgression() {
        String[][] array = new String[Engine.getRows()][Engine.getColums()];
        String startLogo = "What number is missing in the progression?";
        int amountStart = 5;
        int amountEnd = 11;

        for (int j = 0; j < array.length; j++) {
            int length = ThreadLocalRandom.current().nextInt(amountStart, amountEnd);
            int hiddenNumer = ThreadLocalRandom.current().nextInt(Engine.getRndStart(), length);
            int step = ThreadLocalRandom.current().nextInt(Engine.getRndStart(), amountEnd);
            int number = ThreadLocalRandom.current().nextInt(Engine.getRndStart(), Engine.getRndEnd());
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
