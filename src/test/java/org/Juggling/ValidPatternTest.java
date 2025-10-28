package org.Juggling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPatternTest {

    ValidPattern vp = new ValidPattern();
    String input = "";

    @Nested
    class validPatternTest {

        @Test
        void test531() {
            test(1, "531");
        }
        @Test
        void test441() {
            test(1, "441");
        }

    }
    @Nested
    class invalidPatternTest {

        @Test
        void test513() {
            test( -1, "513");
        }

    }

    void test (int expected, String pattern) {
        ValidPattern vp = new ValidPattern();
        String input = "";
        int result = vp.isValidPattern(pattern);

        Assertions.assertEquals(expected, result);

    }
}