package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.thoughtworks.testline.Line.*;

public class LineTest {

    @Test
    public void shouldCalculateLengthOfALineAsObjectWithCoordinateProperties() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Line line = new Line(p1, p2);
        assertEquals(1.41421, line.calculateLength(), 0.0001);
    }

    @Test
    public void shouldNotEquateLineWithNullObject() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Line line = new Line(p1, p2);
        assertNotEquals(line, null);
    }

    @Test
    public void shouldNotEquateWithAnObjectOfDifferentType() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Line line = new Line(p1, p2);
        assertNotEquals(line, "String");
    }

    @Test
    public void shouldSuccessfullyEnforceThatLineUsesPointObjectsAsFields() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Line line = new Line(p1, p2);
        assertEquals(line, line);
    }

}
