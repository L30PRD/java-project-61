package hexlet.code.utils;

public class Checker {

    public static void check(int a) {
        if (a == 0 || a > 6) {
            throw new NullPointerException("\nThere is no such option!");
        }
    }

    public static void check(String a) {
        if (!(a.equals("+") || a.equals("-") || a.equals("*"))) {
            throw new NullPointerException("\nThere is no such option!");
        }
    }
}
