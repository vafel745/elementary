package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert134RblThen1dot48Dlr() {
        float in = 134;
        float expected = 1.4888f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert453RblThen5dot03Dlr() {
        float in = 453;
        float expected = 5.0333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen1dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert467RblThen4dot67Euro() {
        float in = 467;
        float expected = 4.67f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert876RblThen8dot76Euro() {
        float in = 876;
        float expected = 8.76f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}