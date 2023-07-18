package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Please enter the game number and press Enter. \n"
                    + "1 - Greet \n"
                    + "2 - Even \n"
                    + "3 - Calc \n"
                    + "4 - Exit");
            a = scanner.nextInt();
        } while (a == 0 || a > 3);
        System.out.println("Your choice: " + a + "\n");
        switch (a) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.greeting();
                Even.gameEven();
                break;
            case 3:
                Engine.greeting();
                Calc.calc();
                break;
            default:
                break;
        }
    }
}
