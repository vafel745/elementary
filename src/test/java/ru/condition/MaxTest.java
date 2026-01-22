package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int first = 3;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int first = 5;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3To1Then3() {
        int first = 2;
        int second = 3;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3To1To2Then5() {
        int first = 5;
        int second = 3;
        int third = 1;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
