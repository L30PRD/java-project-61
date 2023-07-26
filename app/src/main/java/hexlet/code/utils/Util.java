package hexlet.code.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Util {

    public static int random() {
        int rndStart = 2;
        int rndEnd = 101;

        return ThreadLocalRandom.current().nextInt(rndStart, rndEnd);
    }

    public static int randomUntil(int a) {
        int rndStart = 2;

        return ThreadLocalRandom.current().nextInt(rndStart, a);
    }

    public static int randomFrom(int a) {
        int rndEnd = 2;

        return ThreadLocalRandom.current().nextInt(a, rndEnd);
    }

    public static int randomFromUntil(int a, int b) {
        return ThreadLocalRandom.current().nextInt(a, b);
    }

    public static String[][] newArray() {
        int rows = 3;
        int colums = 3;

        return new String[rows][colums];
    }
}
