package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        int[] nums = new int[5];
        nums[0] = 2006;
        nums[1] = 2010;
        nums[2] = 2014;
        nums[3] = 2018;
        nums[4] = 2022;
        System.out.println(nums[2]);
        int years = nums[3];
        System.out.println(years);
        String[] names = new String[4];
        names[0] = "Andrey";
        names[1] = "Sergey";
        names[2] = "Bober";
        names[3] = "Lolka";
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
    }
}
