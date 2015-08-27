package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.thoughtworks.testline.Line.*;

public class LineTest {

    @Test
    public void shouldCalculateLengthOfALineAsObjectWithCoordinateProperties() {
        Line line = new Line(0, 0, 1, 1);
        assertEquals(1.41421, line.calculateLength(), 0.0001);
    }

    @Test
    public void shouldEquateLineWithItself() {
        Line line = new Line(0, 0, 0, 0);
        assertEquals(line, line);
    }

}
