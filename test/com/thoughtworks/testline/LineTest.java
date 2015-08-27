package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.thoughtworks.testline.Line.*;

public class LineTest {

    @Test
    public void shouldCalculateLengthOfALineAsObjectWithCoordinateProperties() {
        Line line = new Line(new Point(0, 0), new Point(1, 1));

        assertEquals(1.41421, line.calculateLength(), 0.0001);
    }

    @Test
    public void shouldNotEquateLineWithNullObject() {
        Line line = new Line(new Point(0, 0), new Point(0, 0));

        assertNotEquals(line, null);
    }

    @Test
    public void shouldNotEquateWithAnObjectOfDifferentType() {
        Line line = new Line(new Point(0, 0), new Point(0, 0));

        assertNotEquals(line, "String");
    }

    @Test
    public void shouldSuccessfullyEnforceThatLineUsesPointObjectsAsFields() {
        Line line = new Line(new Point(0, 0), new Point(0, 0));

        assertEquals(line, line);
    }

    @Test
    public void shouldEquatePointToItself() {
        Point point = new Point(0, 0);

        assertEquals(point, point);
    }

    @Test
    public void shouldNotEquatePointToNullObject() {
        Point point = new Point(0, 0);
    }

    @Test
    public void shouldEquateTwoSamePoints() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        assertEquals(point1, point2);
    }

    @Test
    public void shouldNotEquateTwoDifferentPoints() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 0);

        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldEquateForSameLines() {
        Line line1 = new Line(new Point(0, 0), new Point(1, 1));
        Line line2 = new Line(new Point(0, 0), new Point(1, 1));

        assertEquals(line1, line2);
    }

}
