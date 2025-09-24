package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        int re = money - price;
        while (re != 0 && re >= coins[j]) {
                re = re - coins[j];
            if (re < coins[j]) {
                j++;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
