package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        if (data[0] != data[1] || data[0] != data[2]) {
            return false;
        }
        return result;
    }
}
