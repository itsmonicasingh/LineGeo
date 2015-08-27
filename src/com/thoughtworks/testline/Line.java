package com.thoughtworks.testline;

import static java.lang.Math.*;

public class Line {

    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x2 - x1, 2.0) + pow(y2 - y1, 2.0));
    }

}
