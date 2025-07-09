package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 1.4F;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4 euro. Test result : " + passed);
        in = 180;
        expected = 2F;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 2 dollar. Test result dollar: " + passed);
    }
}