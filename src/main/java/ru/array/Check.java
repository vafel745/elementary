package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean core = data[0];
        for (int i = 1; i < data.length; i++) {
            if (core != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
