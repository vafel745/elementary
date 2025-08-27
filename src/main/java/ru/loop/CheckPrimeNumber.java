package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 1; index <= number; index++) {
            if (number == 1) {
                prime = false;
                break;
            } else if (number % index == 0 && number % 2 != 0) {
                prime = true;
                break;
            } else {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
