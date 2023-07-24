package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String answer;
    public static final Scanner SCANNER = new Scanner(System.in);
    private static String name;
    public static final int ROWS = 3;
    public static final int COLUMS = 3;
    public static final int RNDSTART = 2;
    public static final int RNDEND = 101;
    public static final int COUNT = 3;

    public static void greeting() {
        System.out.println("\n" + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void engine(String startLogo, String[][] answers) {
        int positive = 0;
        System.out.println(startLogo);
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question: " + answers[i][0]);
            System.out.print("Your answer: ");
            answer = SCANNER.nextLine();
            if (answers[i][1].equals(answer)) {
                System.out.println("Correct!");
                positive++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i][1] + "'. \n"
                        + "Let's try again, " + name + "!");
                break;
            }
        }
        if (positive == COUNT) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }

    public static String getName() {
        return name;
    }
}
