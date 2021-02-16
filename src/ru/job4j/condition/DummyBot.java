package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {

        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } else {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;

    }

    public static void main(String[] args) {
        String privet = DummyBot.answer("Привет, Бот.");
        System.out.println(privet);
        String poka = DummyBot.answer("Пока.");
        System.out.println(poka);
        String anotherQuestion = DummyBot.answer("Другой вопрос");
        System.out.println(anotherQuestion);

    }
}