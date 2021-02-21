package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};   // сделать { 5,4,3,2,1 }
        int a = array[1];
        array[1] = array[4];
        array[4] = a;
        int b = array[2];
        array[2] = array[4];
        array[4] = b;
        int c = array[4];
        array[4] = array[3];
        array[3] = c;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println();

        int[] array1 = new int[]{5, 4, 3, 2, 1};   // сделать { 1,2,3,4,5 }
        int d = array1[0];
        array1[0] = array1[4];
        array1[4] = d;
        int f = array1[1];
        array1[1] = array1[3];
        array1[3] = f;
        for (int index = 0; index < array1.length; index++) {
            System.out.println(array1[index]);
        }



    }
}
