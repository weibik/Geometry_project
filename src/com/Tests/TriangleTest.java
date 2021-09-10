package com.Tests;

import com.Figures.Point;
import com.Figures.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TriangleTest {
    Triangle triangle;
    private static final double DELTA = 1e-15;

    @BeforeEach
    public void setup(){
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 3);
        Point point3 = new Point(4, 0);
        triangle = new Triangle(point1, point2, point3);
    }

    @Test
    public void areaOfTriangle_IsCorrect_Test(){
        Assert.assertEquals(triangle.areaOfTriangle(), 6.0, DELTA);
    }

}
