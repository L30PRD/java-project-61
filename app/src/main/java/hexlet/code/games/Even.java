package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Even {
    public static final int RANGE = 101;
    public static final String LOGO = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameEven() {
        String[][] answers = new String[Engine.ROUNDS][Engine.ROUNDS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Util.random(RANGE);
            answers[i] = isEven(number)
                    ? new String[]{Integer.toString(number), "yes"}
                    : new String[]{Integer.toString(number), "no"};
        }
        Engine.engine(LOGO, answers);
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
