package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int i = 0;
        int re = money - price;
        while (re >= coins[i]) {
            re = re - coins[i];
            rsl[size] = coins[i];
            size++;
            if (re < coins[i] && re != 0) {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
