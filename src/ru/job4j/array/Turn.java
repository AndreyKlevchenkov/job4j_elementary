package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) { // array.length / 2  - c его помощью находим середину. {1,2,3,4,5} середина будет 3. {1,2,3,4} середина между 2 и 3
            int a = array[index];                            // "a" будет раняться 0 , т.е отсчет будет с нуля.
            array[index] = array[array.length - index - 1]; // array[index]- это начало отсчета, а array[array.length - index - 1] = это уже числа с конца на которые будем менять.
            array[array.length - index - 1] = a;
        }
        return array;
    }

    }

