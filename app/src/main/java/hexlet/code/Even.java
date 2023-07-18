package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

public class Even {

    public static void gameEven() {
        String[][] answers = new String[3][2];
        String startLogo = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < answers.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(1, 101);
            if (number % 2 == 0) {
                answers[i] = new String[]{Integer.toString(number), "yes"};
            } else {
                answers[i] = new String[]{Integer.toString(number), "no"};
            }
        }

        Engine.engine(startLogo, answers);
    }
}
