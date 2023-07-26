package hexlet.code.utils;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void greeting() {
        System.out.println("\n" + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
