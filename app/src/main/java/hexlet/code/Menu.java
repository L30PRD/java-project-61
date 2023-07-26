package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.utils.Checker;
import hexlet.code.utils.Cli;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter. \n"
                + "1 - Greet \n"
                + "2 - Even \n"
                + "3 - Calc \n"
                + "4 - GCD \n"
                + "5 - Progression \n"
                + "6 - Prime \n"
                + "0 - Exit");
        System.out.print("Your choice: ");

        try {
            int a = scanner.nextInt();
            Checker.check(a);
            switch (a) {
                case 1 -> Cli.greeting();
                case 2 -> Even.gameEven();
                case 3 -> Calc.calc();
                case 4 -> GCD.gameGCD();
                case 5 -> Progression.playProgression();
                case 6 -> Prime.playPrime();
                default -> {
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
