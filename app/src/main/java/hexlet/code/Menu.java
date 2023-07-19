package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

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
                    + "4 - GCD \n"
                    + "5 - Exit");
            System.out.print("Your choice: ");
            a = scanner.nextInt();
        } while (a == 0 || a > 4);
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
            case 4:
                Engine.greeting();
                GCD.gameGCD();
                break;
            default:
                break;
        }
    }
}