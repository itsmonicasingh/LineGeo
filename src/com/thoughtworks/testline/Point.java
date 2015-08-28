package com.thoughtworks.testline;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromPoint(Point that) {
        return sqrt(pow(this.x - that.x, 2.0) + pow(this.y - that.y, 2.0));
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        Point thatPoint = (Point)that;
        if(x == thatPoint.x && y == thatPoint.y) {
            return true;
        } else {
            return false;
        }
    }

}