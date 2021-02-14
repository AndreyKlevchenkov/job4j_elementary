package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        int rubToEur = value / 70;
        return rubToEur;
    }
    public static int rubleToDollar(int value){
        int rubToDol  = value / 60;
        return rubToDol;
    }
    public static void main(String [] args){
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("240 dollars are " + dollar + " dollar");
    }
}
