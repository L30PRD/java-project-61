package hexlet.code;

import hexlet.code.utils.Cli;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void engine(String startLogo, String[][] answers) {
        Cli.greeting();
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println(startLogo);
        for (String[] strings : answers) {
            System.out.println("Question: " + strings[0]);
            System.out.print("Your answer: ");
            answer = scanner.nextLine();
            if (strings[1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + strings[1] + "'. \n"
                        + "Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
