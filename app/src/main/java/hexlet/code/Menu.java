package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class Menu {
    public static final int CHOICE_0 = 0;
    public static final int CHOICE_1 = 1;
    public static final int CHOICE_2 = 2;
    public static final int CHOICE_3 = 3;
    public static final int CHOICE_4 = 4;
    public static final int CHOICE_5 = 5;
    public static final int CHOICE_6 = 6;
    public static final int GAMES_NUMBER = 6;

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Please enter the game number and press Enter. \n"
                    + "1 - Greet \n"
                    + "2 - Even \n"
                    + "3 - Calc \n"
                    + "4 - GCD \n"
                    + "5 - Progression \n"
                    + "6 - Prime \n"
                    + "0 - Exit");
            System.out.print("Your choice: ");
            a = scanner.nextInt();
        } while (a == CHOICE_0 || a > GAMES_NUMBER);
        switch (a) {
            case CHOICE_1:
                Engine.greeting();
                break;
            case CHOICE_2:
                Engine.greeting();
                Even.gameEven();
                break;
            case CHOICE_3:
                Engine.greeting();
                Calc.calc();
                break;
            case CHOICE_4:
                Engine.greeting();
                GCD.gameGCD();
                break;
            case CHOICE_5:
                Engine.greeting();
                Progression.playProgression();
                break;
            case CHOICE_6:
                Engine.greeting();
                Prime.playPrime();
                break;
            default:
                break;
        }
    }
}
