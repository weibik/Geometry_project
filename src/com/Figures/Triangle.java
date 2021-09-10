package com.Figures;

public class Triangle implements FigureInterface {
    Point pointA = new Point(0, 0);
    Point pointB = new Point(0, 0);
    Point pointC = new Point(0, 0);

    Line lineAB = new Line(pointA, pointB);
    Line lineAC = new Line(pointA, pointC);
    Line lineBC = new Line(pointB, pointC);

    public Triangle(Point A, Point B, Point C){
        pointA = A;
        pointB = B;
        pointC = C;
    }

    double getLengthAB(){
        return lineAB.getLength();
    }

    double getLengthAC(){
        return lineAC.getLength();
    }

    double getLengthBC(){
        return lineBC.getLength();
    }

    public void print(){
        System.out.println("Vertices of triangle are: ");
        pointA.print();
        pointB.print();
        pointC.print();
        //System.out.print("Point A: " + pointA.print());
        //System.out.print("Point B: " + pointB.print());
        //System.out.print("Point C: " + pointC.print());
    }

    // V
    public double areaOfTriangle(){
        double p = (getLengthAB() + getLengthAC() + getLengthBC()) / 2;
        return Math.sqrt(p * (p - getLengthBC()) * (p - getLengthAB()) * (p - getLengthAC()));
    }

    public void positionRelativeToTriangle(Point point) {
        double left = pointA.x;
        double right = pointA.x;
        double bottom = pointA.y;
        double up = pointA.y;

        if (pointB.x < left) left = pointB.x;
        if (pointC.x < left) left = pointC.x;

        if (pointB.x > right) right = pointB.x;
        if (pointC.x > right) right = pointC.x;

        if (pointB.y > up) up = pointB.y;
        if (pointC.y > up) up = pointC.y;

        if (pointB.y < bottom) bottom = pointB.y;
        if (pointC.y < bottom) bottom = pointC.y;

        System.out.print("\nPoint " + point.x + " " + point.y + " is ");
        if (point.x < left) System.out.println("outside triangle");
        else if (point.x > right) System.out.println("outside triangle");
        else if (point.y > up) System.out.println("outside triangle");
        else if (point.y < bottom) System.out.println("outside triangle");
        else System.out.println("inside triangle");
    }
}
