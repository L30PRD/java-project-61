package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Even {

    public static void gameEven() {
        String[][] answers = new String[Engine.ROWS][Engine.COLUMS];
        String startLogo = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < answers.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(Engine.RND_START, Engine.RND_END);
            if (number % 2 == 0) {
                answers[i] = new String[]{Integer.toString(number), "yes"};
            } else {
                answers[i] = new String[]{Integer.toString(number), "no"};
            }
        }

        Engine.engine(startLogo, answers);
    }
}
