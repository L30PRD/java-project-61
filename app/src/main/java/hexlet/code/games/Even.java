package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Even {
    public static final int ROUNDS = 3;

    public static void gameEven() {
        String[][] answers = Util.newArray();
        String startLogo = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < ROUNDS; i++) {
            int number = Util.random();
            if (isEven(number)) {
                answers[i] = new String[]{Integer.toString(number), "yes"};
            } else {
                answers[i] = new String[]{Integer.toString(number), "no"};
            }
        }
        Engine.engine(startLogo, answers);
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
