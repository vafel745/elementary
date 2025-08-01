package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int res = 0;
        for (int index = start; index <= finish; index++) {
            res += index;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}