package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        result = 1;
        for (int lol = result; lol <= n; lol++) {
            result = result * lol;
        }
        return result;
    }
}
