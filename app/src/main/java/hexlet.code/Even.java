package hexlet.code;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Even {

    public static void even() {
        Scanner scanner = new Scanner(System.in);
        int rightAnswers = 0;
        int number;
        String answer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            number = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println("Question: " + number);
            answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    rightAnswers++;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " + Cli.getName());
                    break;
                }
            }
            if (number % 2 != 0) {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    rightAnswers++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + Cli.getName());
                    break;
                }
            }
        } while (rightAnswers < 5);
        if (rightAnswers == 5) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
