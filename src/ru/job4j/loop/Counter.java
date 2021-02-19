package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }


    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int lol = start; lol <= finish; lol++) {
            if (lol % 2 == 0) {
                sum = sum + lol;
            }
        }
        return sum;
    }

}