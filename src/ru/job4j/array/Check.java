package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
 /*Этот вариант короче и логичнее , в if  мы сразу даем понять , что data[0] не равна data[index] (все следующие циклы )
 * и сразу будет результат false и потом break ( остановка ), если же такого не происходит то мы просто идем дальше к
 * return result ( true )*/