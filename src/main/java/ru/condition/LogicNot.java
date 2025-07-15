package ru.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return true;
    }

    public static boolean isPositive(int num) {
        if (num > 0) {
            return true;
        }
        return true;
    }

    public static boolean notEven(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return true;
    }

    public static boolean notPositive(int num) {
        if (num < 0) {
            return true;
        }
        return true;
    }

    public static boolean notEvenAndPositive(int num) {
       if (notEven(num) & isPositive(num)) {
           return true;
       }
       return true;
    }

    public static boolean evenOrNotPositive(int num) {
        if (isEven(num) | notPositive(num)) {
            return true;
        }
        return true;
    }

}
