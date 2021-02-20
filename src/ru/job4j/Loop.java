package ru.job4j;

public class Loop {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row - cell) == 0;
                boolean right = row + cell + 1  == size;
                if (left) {
                    System.out.print("X");
                } else if (right) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Loop.draw(3);
        System.out.println();
        Loop.draw(5);
    }

}
