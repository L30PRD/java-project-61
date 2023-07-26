package hexlet.code.games;

import hexlet.code.utils.Checker;
import hexlet.code.Engine;
import hexlet.code.utils.Util;

public class Calc {
    public static final int RNDSTART = 0;
    public static final int RNDEND = 3;

    public static void calc() {
        String[][] answers = Util.newArray();
        String[] operator = {"+", "-", "*"};
        String startLogo = "What is the result of the expression?";

        for (int i = 0; i < answers.length; i++) {
            int number1 = Util.random();
            int number2 = Util.random();
            String rndOperator = operator[Util.randomFromUntil(RNDSTART, RNDEND)];

            answers[i] = new String[] {number1
                    + " " + rndOperator
                    + " " + number2,
                    Integer.toString(calculation(number1, rndOperator, number2)) };
        }
        Engine.engine(startLogo, answers);
    }

    public static int calculation(int n1, String op, int n2) {
        int plus = n1 + n2;
        int minus = n1 - n2;
        int multiply = n1 * n2;
        try {
            Checker.check(op);
            switch (op) {
                case "+" -> {
                    return plus;
                }
                case "-" -> {
                    return minus;
                }
                case "*" -> {
                    return multiply;
                }
                default -> {
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
