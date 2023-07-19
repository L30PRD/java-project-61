package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String answer;
    public static Scanner scanner = new Scanner(System.in);
    public static String name;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void engine(String startLogo, String[][] answers) {
        int positive = 0;
        System.out.println(startLogo);
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question: " + answers[i][0]);
            System.out.print("Your answer: ");
            answer = scanner.nextLine();
            if (answers[i][1].equals(answer)) {
                System.out.println("Correct!");
                positive++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i][1] + "'. \n"
                        + "Let's try again, " + name);
                break;
            }
        }
        if (positive == 3) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }

    public static String getName() {
        return name;
    }

    public static String getAnswer() {
        return answer;
    }
}
