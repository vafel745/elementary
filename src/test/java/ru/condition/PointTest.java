package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21to31then2dot23() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 2);
        double expected = 2.23;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when61to81then7dot07() {
        Point a = new Point(3, 1);
        Point b = new Point(8, 6);
        double expected = 7.07;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3415to137then19dot92() {
        Point a = new Point(7, 15);
        Point b = new Point(13, 34);
        double expected = 19.92;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when186715to1794then7dot07() {
        Point a = new Point(7, 4, 3);
        Point b = new Point(6, 9, 2);
        double expected = 5.19;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}