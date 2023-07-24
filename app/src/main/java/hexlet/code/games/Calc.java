package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Calc {
    public static final int RNDSTART = 0;
    public static final int RNDEND = 3;
    
    public static void calc() {
        String[][] answers = new String[Engine.ROWS][Engine.COLUMS];
        String[] operator = {"+", "-", "*"};
        String startLogo = "What is the result of the expression?";

        for (int i = 0; i < answers.length; i++) {
            int number1 = ThreadLocalRandom.current().nextInt(Engine.RNDSTART, Engine.RNDEND);
            int number2 = ThreadLocalRandom.current().nextInt(Engine.RNDSTART, Engine.RNDEND);
            int rndOperator = ThreadLocalRandom.current().nextInt(RNDSTART, RNDEND);

            answers[i] = new String[] {number1
                    + " " + operator[rndOperator]
                    + " " + number2,
                    Integer.toString(calculation(number1, rndOperator, number2)) };
        }
        Engine.engine(startLogo, answers);
    }

    public static int calculation(int n1, int op, int n2) {
        int result = 0;
        switch (op) {
            case 0:
                result = n1 + n2;
                break;
            case 1:
                result = n1 - n2;
                break;
            case 2:
                result = n1 * n2;
                break;
            default:
                break;
        }
        return result;
    }
}
