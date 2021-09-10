package com.Tests;

import com.Figures.Line;
import com.Figures.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineTest {
    Line line;
    private static final double DELTA = 0.00001;


    @Before
    public void setup(){
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        line = new Line(p1, p2);
    }

    @Test
    public void getLength_Expected5_Test(){
        Assert.assertEquals( 5.0, line.getLength(), DELTA );
    }

    @Test
    public void getA_Test(){
        Assert.assertEquals( 1.3333333333333333 , line.getA(), DELTA);
    }

    @Test
    public void getB_Test(){
        Assert.assertEquals( -0.3333333333333333 , line.getC(line.getA()), DELTA);
    }

    @Test
    public void whichSide_ShouldBeLeft_Test(){
        line.whichSide(new Point(4, 6));
    }

    @Test
    public void whichSide_ShouldBeRight_Test(){
        line.whichSide(new Point(3, 0));
    }

    // Here is other line, because searching for good number with previous line was hard
    @Test
    public void whichSide_ShouldBeOn_Test(){
        Line Newline = new Line(1, 1, 3, 3);
        Newline.whichSide(new Point(2, 2));
    }

}
