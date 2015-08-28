package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void shouldCalculateLengthOfALineAsObjectWithCoordinateProperties() {
        Line line = new Line(new Point(0, 0), new Point(1, 1));

        assertEquals(1.41421, line.length(), 0.0001);
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
    public void shouldEquateForSameLines() {
        Line line1 = new Line(new Point(0, 0), new Point(1, 1));
        Line line2 = new Line(new Point(0, 0), new Point(1, 1));

        assertEquals(line1, line2);
    }

    @Test
    public void shouldNotEquateLineIfOnlyEndPointTwoIsSameAsOtherEndPointTwo() {
        Line line1 = new Line(new Point(1, 1), new Point(4, 5));
        Line line2 = new Line(new Point(2, 3), new Point(4, 5));

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEquateLineIfOnlyEndPointOneIsSameAsOtherEndPointOne() {
        Line line1 = new Line(new Point(1, 1), new Point(2, 3));
        Line line2 = new Line(new Point(1, 1), new Point(6, 7));

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldEquateLineEvenIfEndPointsAreInReverseOrder() {
        Line line1 = new Line(new Point(1, 1), new Point(4, 5));
        Line line2 = new Line(new Point(4, 5), new Point(1, 1));

        assertEquals(line1, line2);
    }

    @Test
    public void shouldNotEquateIfOnlyEndPointTwoIsSameAsOtherEndPointOne() {
        Line line1 = new Line(new Point(1, 1), new Point(4, 5));
        Line line2 = new Line(new Point(4, 5), new Point(2, 3));

        assertNotEquals(line1, line2);
    }

}
