package com.Tests;

import org.junit.Assert;
import org.junit.Before;
import com.Figures.Point;
import org.junit.Test;

public class PointTest {
    Point p;
    private static final double DELTA = 1e-15;

    @Before
    public void setup(){
        p = new Point(1, 10);
    }

    @Test
    public void Constructor_XCord_Test(){
        Assert.assertEquals(p.x, 1.0, DELTA);
    }

    @Test
    public void Constructor_YCord_Test(){
        Assert.assertEquals(p.y, 10.0, DELTA);
    }
}
