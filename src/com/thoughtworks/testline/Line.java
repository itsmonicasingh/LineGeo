package com.thoughtworks.testline;

import static java.lang.Math.*;

public class Line {

    private Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calculateLength() {
        return sqrt(pow(p2.x - p1.x, 2.0) + pow(p2.y - p1.y, 2.0));
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || !(that instanceof Line)) {
            return false;
        }
        return true;
    }

}
