package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Calc {
    public static final int RANGE = 101;
    public static  final String LOGO = "What is the result of the expression?";

    public static void calc() {
        String[][] answers = new String[Engine.ROUNDS][Engine.ROUNDS];
        String[] operator = {"+", "-", "*"};

        for (int i = 0; i < answers.length; i++) {
            int number1 = Util.random(RANGE);
            int number2 = Util.random(RANGE);
            String rndOperator = operator[Util.randomFromUntil(0, operator.length)];

            answers[i] = new String[] {number1
                    + " " + rndOperator
                    + " " + number2,
                    Integer.toString(calculation(number1, rndOperator, number2)) };
        }
        Engine.engine(LOGO, answers);
    }

    public static int calculation(int n1, String op, int n2) {
        int result = 0;

        switch (op) {
            case "+" -> result = n1 + n2;
            case "-" -> result = n1 - n2;
            case "*" -> result = n1 * n2;
            default -> {
                throw new RuntimeException("No such option!");
            }
        }
        return result;
    }
}
