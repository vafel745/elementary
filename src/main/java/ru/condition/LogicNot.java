package ru.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("is even");
        }
        return true;
    }

    public static boolean isPositive(int num) {
        if (num > 0) {
            System.out.println("is positive");
        }
        return true;
    }

    public static boolean notEven(int num) {
        if (num % 2 != 0) {
            System.out.println("is not even");
        }
        return true;
    }

    public static boolean notPositive(int num) {
        if (num < 0) {
            System.out.println("is not positive");
        }
        return true;
    }

    public static boolean notEvenAndPositive(int num) {
       if (notEven(num) & isPositive(num)) {
           System.out.println("not even and is positive");
       }
       return true;
    }

    public static boolean evenOrNotPositive(int num) {
        if (isEven(num) | notPositive(num)) {
            System.out.println("is even and is not positive");
        }
        return true;
    }

}
