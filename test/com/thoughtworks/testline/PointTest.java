package com.thoughtworks.testline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PointTest {

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
    public void shouldCalculateZeroDistanceFromSamePoint() {
        Point point1 = new Point(0, 0);

        assertEquals(0.0, point1.distanceFromPoint(point1), 0.0001);
    }

}
