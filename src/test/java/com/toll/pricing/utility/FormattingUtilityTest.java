package com.toll.pricing.utility;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormattingUtilityTest {

    @Test
    public void test_should_round_off_to_two_decimal_points() {
        double value = 12.3456;
        double expected = 12.35;
        double actual = FormattingUtility.roundOff(value, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test_should_ignore_rounding_if_rounding_is_zero() {
        double value = 12.3456;
        double actual = FormattingUtility.roundOff(value, 0);
        assertEquals(value, actual);
    }

    @Test
    public void test_should_convert_to_double() {
        Object value = 123;
        double expected = 123.0;
        double actual = FormattingUtility.toDouble(value);
        assertEquals(expected, actual);
    }

    @Test(expected = ClassCastException.class)
    public void test_should_not_convert_to_double_for_invalid_value() {
        Object value = "abc";
        FormattingUtility.toDouble(value);
    }
}
