package com.Figures;

import java.util.HashMap;

public class Line implements FigureInterface {
    Point head;
    Point tail;

    // constructor with points
    public Line(Point p1, Point p2){
        head = new Point(p1.x, p1.y);
        tail = new Point(p2.x, p2.y);
    }

    // constructor
    public Line(double x1, double y1, double x2, double y2){
        head = new Point(x1, y1);
        tail = new Point(x2, y2);
    }



    public double getLength(){  return Math.sqrt(Math.pow(tail.x - head.x, 2) + Math.pow(tail.y - head.y, 2)); }

    // getting a to line equation
    public double getA(){
        return (head.y - tail.y) / (head.x - tail.x);
    }

    // getting b to line equation
    public double getC(double aa){
        return (head.y - aa * head.x);
    }

    // calculating general equation
    public double generalEquationWithPoint(Point point){
        return (getA() * point.x - point.y + getC(getA()));
    }

    public void print(){
        System.out.print("Line coordinates: " + head.x + " " + head.y + " " + tail.x + " " + tail.y);
    }


    // II
    public void printGeneralEquation(){
        System.out.println("General equation: " + getA() + "x + " + getC(getA()));
    }

    // creating a hashmap where we have a, b and c
    public HashMap<String, Double> generalEquationHashMap(){
        HashMap<String, Double> map = new HashMap<>();
        map.put("a", getA());
        map.put("b", -1.0);
        map.put("c", getC(getA()));
        return map;
    }

    // III
    // getting crossing point of the two lines, where only lines are given
    public void crossingPoint(Line l){
        HashMap<String, Double> map1 = generalEquationHashMap();
        double a1 = map1.get("a");
        double b1 = map1.get("b");
        double c1= map1.get("c");

        HashMap <String, Double> map2 = l.generalEquationHashMap();
        double a2 = map2.get("a");
        double b2 = map2.get("b");
        double c2= map2.get("c");

        double W = (a1 * b2) - (a2 * b1);
        double Wx = (-c1 * b2) - (-c2 * b1);
        double Wy = (a1 * -c2) - (a2 * -c1);

        Point coordinates = new Point(Wx/W, Wy/W );
        System.out.println("Coordinates of cross point are: " + coordinates.x + ", " +coordinates.y);
    }

    // IV
    // checking on which side the point is
    public void whichSide(Point point){
        double result = generalEquationWithPoint(point);
        //System.out.println("Point " + point.x + " " + point.y + " ");
        if (result > 0 ) {System.out.print("Point " + point.x + " " + point.y + " " + "is on the right"); }
        else if (result == 0 ) {System.out.print("Point " + point.x + " " + point.y + " " + "is on the line"); }
        else if (result < 0 ) {System.out.print("Point " + point.x + " " + point.y + " " + "is on the left"); }
    }

    // V
    // Translation by given vector
    public void translation(Point Vector){
        head.x += Vector.x;
        head.y += Vector.y;
        tail.x += Vector.x;
        tail.y+= Vector.y;

        double c = this.getA();
        double d = this.getC(c);

        System.out.printf("\nLine after translation equals: y = %.2fx + %.2f\n", c, d);

    }

}
