package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result1 = distance(1, 2, 2, 4);
        double result2 = distance(6, 3, 8, 9);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 2) to (2, 4) " + result1);
        System.out.println("result (6, 3) to (8, 9) " + result2);
    }
}
