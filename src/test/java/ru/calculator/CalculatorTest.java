package ru.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    void whenOneTwoTwoThenResultFive() {
        double first = 1;
        double second = 2;
        double third = 2;
        double result = Calculator.add(first, second, third);
        double excepted = 5;
        assertThat(result).isEqualTo(excepted);
    }
}