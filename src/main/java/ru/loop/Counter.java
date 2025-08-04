package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int res = 0;
        for (int index = start; index <= finish; index++) {
            res += index;
        }
        return res;
    }

    public static int sumByEven(int start, int finish) {
        int result = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                result += index;
            }
        }
        return result;
    }
}
