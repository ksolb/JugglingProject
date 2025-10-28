package org.Juggling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPatternTest {

    @Test
    void isValidPatternTest() {
        ValidPattern vp = new ValidPattern();
        String input = "531";
        int result = vp.isValidPattern(input);

        Assertions.assertEquals(1, result);

    }

}