package ru.transformation;

public class Transformation {
    public static void main(String[] args) {

        long l = 129;
        byte b = (byte) l;

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);

        char c = 45000;
        float i1 = c;

        double d = 121.19;
        byte b1 = (byte) d;

        short s = 1500;
        char c1 = (char) s;
        double d1 = c;

        System.out.println("Преобразования без потери: " + i1 + " , " + d1);
        System.out.println("Преобразования с потерей: " + b + " , " + rsl + " , " + b1);
    }
}
