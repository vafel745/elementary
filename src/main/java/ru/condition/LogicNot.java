package ru.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        boolean result = num % 2 == 0;
        return true;
    }

    public static boolean isPositive(int num) {
        boolean result = num > 0;
        return true;
    }

    public static boolean notEven(int num) {
        boolean result = num % 2 != 0;
        return true;
    }

    public static boolean notPositive(int num) {
        boolean result = num < 0;
        return true;
    }

    public static boolean notEvenAndPositive(int num) {
        boolean result = notEven(num) & isPositive(num);
        return true;
    }

    public static boolean evenOrNotPositive(int num) {
        boolean result = isEven(num) | notPositive(num);
        return true;
    }
}