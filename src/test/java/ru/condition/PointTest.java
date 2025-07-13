package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21to31then2dot23() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 2;
        double expected = 2.23;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when61to81then7dot07() {
        int x1 = 3;
        int y1 = 1;
        int x2 = 8;
        int y2 = 6;
        double expected = 7.07;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3415to137then19dot92() {
        int x1 = 7;
        int y1 = 15;
        int x2 = 13;
        int y2 = 34;
        double expected = 19.92;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}