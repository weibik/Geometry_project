package com.Project;

import com.Figures.Point;
import java.util.Vector;

public class ConvexHull {
    public static void doConvexHull(Point[] points, int numberOfPoints)
    {
        // There cannot be a convex hull if there is less than 3 points
        if (numberOfPoints < 3) return;

        Vector<Point> hull = new Vector<>();

        // searching for the point on the most left
        int left = 0;
        for (int i = 1; i < numberOfPoints; i++)
            if (points[i].x < points[left].x)
                left = i;

        int p = left, q;
        do
        {
            hull.add(points[p]);

            q = (p + 1) % numberOfPoints;

            // searching for most oriented counterclock wise point
            for (int i = 0; i < numberOfPoints; i++)
            {
                if (orientation(points[p], points[i], points[q]) == 2)
                    q = i;
            }

            p = q;
        } while (p != left);

        for (Point temp : hull)
            System.out.println("(" + temp.x + ", " +
                    temp.y + ")");
    }

    public static int orientation(Point p, Point q, Point r)
    {
        int val = (int) ((q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y));

        if (val == 0) return 0;  // collinear
        return (val > 0)? 1: 2; // clock or counterclock wise
    }

}
