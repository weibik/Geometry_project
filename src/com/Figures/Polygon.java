package com.Figures;

public class Polygon implements FigureInterface {
    int numberOfVertices;
    Point[] vertices = new Point[numberOfVertices];

    public double mostLeft, mostRight, mostTop, mostDown;

    public Polygon(int numOfVert, Point[] arrOfVerts){
        numberOfVertices = numOfVert;
        vertices = arrOfVerts;

        mostLeft = vertices[0].x;
        mostRight = vertices[0].x;
        mostTop = vertices[0].y;
        mostDown = vertices[0].y;
        for (int i = 0; i < numberOfVertices; i++)
        {
            if (vertices[i].x > mostRight) mostRight = vertices[i].x;
            if (vertices[i].x < mostLeft) mostLeft = vertices[i].x;
            if (vertices[i].y > mostTop) mostTop = vertices[i].y;
            if (vertices[i].y < mostDown) mostDown = vertices[i].y;
        }

    }

    public void positionRelativeToPolygon(Point point){
        System.out.print("Point: " + point.x + " " + point.y + " is ");

        if(point.x < mostLeft) System.out.println("outside a Polygon");
        else if(point.y > mostRight) System.out.println("outside a Polygon");
        else if(point.y > mostTop) System.out.println("outisde a Polygon");
        else if(point.x > mostTop) System.out.println("outisde a Polygon");
        else if(point.x < mostDown) System.out.println("outisde a Polygon");
        else System.out.println("inside a polygon");
    }

    public void print(){
        System.out.println("Vertices of polygon are: ");
        for(Point i : vertices){
            System.out.println("Point: " + i.x + " " + i.y + " ");
        }
    }
}
