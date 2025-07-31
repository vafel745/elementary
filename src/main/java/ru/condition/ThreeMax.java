package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second || first < third) {
            result = second;
        }
        if (third > second && third > first) {
            result = third;
        }
        return result;
    }
}
