package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumOfAllCalculations(double first, double second) {
        return sum(first, second) + subtraction(first, second) + multiply(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfSubtractionAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumOfAllCalculations(10, 20));
    }
}
