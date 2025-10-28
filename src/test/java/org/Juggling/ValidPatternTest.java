package org.Juggling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPatternTest {

    ValidPattern vp = new ValidPattern();
    String input = "";
    @Test
    void validPatternTest() {
        input = "531";
        int result = vp.isValidPattern(input);
        Assertions.assertEquals(1, result);
    }
    @Test
    void invalidPatternTest() {
        input = "513";
        int result = vp.isValidPattern(input);
        Assertions.assertEquals(-1, result);
    }

}