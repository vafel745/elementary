package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
        result = number < 0;
        if (result) {
            System.out.println("This is negative number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-1);
    }
}
