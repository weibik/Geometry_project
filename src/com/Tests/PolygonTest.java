package com.Tests;

import com.Figures.Point;
import com.Figures.Polygon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PolygonTest {
    Polygon polygon;
    Point[] pointsArray;
    private static final double DELTA = 1e-15;

    @Before
    public void setup(){
        pointsArray = new Point[5];
        pointsArray[0] = new Point(0, 0);
        pointsArray[1] = new Point(2, 0);
        pointsArray[2] = new Point(-1, 3);
        pointsArray[3] = new Point(1, 4);
        pointsArray[4] = new Point(2, 6);
        polygon = new Polygon(5, pointsArray);

    }

    @Test
    public void constructorTop_Test(){
        Assert.assertEquals(6.0, polygon.mostTop,  DELTA);
    }

    @Test
    public void constructorBot_Test(){
        Assert.assertEquals(0.0, polygon.mostDown,  DELTA);
    }

    @Test
    public void constructorLeft_Test(){
        Assert.assertEquals(-1.0, polygon.mostLeft,  DELTA);
    }

    @Test
    public void constructorRight_Test(){
        Assert.assertEquals(2.0, polygon.mostRight,  DELTA);
    }


}
