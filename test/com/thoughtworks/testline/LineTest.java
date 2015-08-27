package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.thoughtworks.testline.Line.*;

public class LineTest {

    @Test
    public void shouldReturnZeroForLineWithSameEndPoints() {
        assertEquals(0.0, calculateLength(1, 1, 1, 1), 0.0001);
    }

}
