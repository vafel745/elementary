package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while ((amount * (percent / 100) + amount)  > salary) {
            double percentOfTheCreditPlusAmount = (amount * (percent / 100)) + amount;
            amount = percentOfTheCreditPlusAmount - salary;
            year++;
        }
        return year;
    }
}