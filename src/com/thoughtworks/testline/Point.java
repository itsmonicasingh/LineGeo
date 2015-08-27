package com.thoughtworks.testline;

public class Point {

    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        return true;
    }

}