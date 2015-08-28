package com.thoughtworks.testline;

import static java.lang.Math.*;

public class Line {

    private Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return p1.distanceFromPoint(p2);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || !(that instanceof Line)) {
            return false;
        }
        Line thatLine = (Line)that;
        if(p1.equals(thatLine.p1)) {
            return p2.equals(thatLine.p2);
        } else if(p2.equals(thatLine.p1)) {
            return p1.equals(thatLine.p2);
        } else {
            return false;
        }
    }

}
