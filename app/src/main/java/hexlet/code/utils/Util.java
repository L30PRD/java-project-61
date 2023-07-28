package hexlet.code.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Util {

    public static int random(int a) {
        return ThreadLocalRandom.current().nextInt(1, a);
    }

    public static int randomFromUntil(int a, int b) {
        return ThreadLocalRandom.current().nextInt(a, b);
    }
}
