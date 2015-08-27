package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.thoughtworks.testline.Line.*;

public class LineTest {

    @Test
    public void shouldReturnZeroForLineWithSameEndPoints() {
        assertEquals(0.0, calculateLength(1, 1, 1, 1), 0.0001);
    }

    @Test
    public void shouldReturnLengthOfVerticalLine() {
        assertEquals(1.0, calculateLength(0, 0, 0, 1), 0.0001);
    }

    @Test
    public void shouldReturnLengthOfDiagonalLine() {
        assertEquals(1.41421, calculateLength(0, 0, 1, 1), 0.0001);
    }

}
