package hexlet.code;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Please enter the game number and press Enter. \n"
                    + "1 - Greet \n"
                    + "2 - Even \n"
                    + "3 - Exit");
            a = scanner.nextInt();
        } while (a == 0 || a > 3);
        System.out.println("Your choice: " + a + "\n");
        switch (a) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Cli.greeting();
                Even.even();
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
