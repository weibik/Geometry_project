package com.Project;

import com.Figures.*;

public class Exercise {
    public static void doExercise(){
        Point point1 = new Point(2, 4);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(0, 2);

        Line line = new Line(point1, point2);
        Triangle triangle = new Triangle(point1, point2, point3);

        Point[] points = loadArrayOfPoints();
        Polygon polygon = new Polygon(7, points);

        printing(line, triangle, polygon);
        lineMethods(line);
        polygonMethods(polygon);
        convexHull(points);

    }

    static Point[] loadArrayOfPoints(){
        Point[] points = new Point[8];
        points[0] = new Point(1, 1);
        points[1] = new Point(2, 0 );
        points[2] = new Point(3, 3);
        points[3] = new Point(-2, 4);
        points[4] = new Point(-2, -1);
        points[5] = new Point(-4, -2);
        points[6] = new Point(-1, -4);
        points[7] = new Point(2, -3);

        return points;
    }

    static void printing(Line l, Triangle t, Polygon p){
        System.out.println("###### PRINTING ######");
        System.out.println("\n--- LINE ---");
        l.print();
        System.out.println("\n\n--- TRIANGLE ---");
        t.print();
        System.out.println("\n\n--- POLYGON ---");
        p.print();
    }

    static void lineMethods(Line l){
        System.out.println("\n###### LINE METHODS ######");
        System.out.println("Length of line is " + l.getLength());
        l.printGeneralEquation();
        l.crossingPoint(new Line(2, 4, 3, 2));
        l.whichSide(new Point(0,0));
        l.translation(new Point(7, 5));
    }

    static void polygonMethods(Polygon polygon){
        System.out.println("\n###### POLYGON METHODS ######");
        polygon.positionRelativeToPolygon(new Point(3, 3));
    }

    static void convexHull(Point[] points){
        System.out.println("\n###### CONVEX HULL ######");

        System.out.print("Our points are: ");
        for(Point i: points)
            i.print();
        System.out.println("\n\nConvex hull: ");
        ConvexHull.doConvexHull(points, points.length);
    }
}
