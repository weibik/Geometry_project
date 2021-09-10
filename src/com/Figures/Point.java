package com.Figures;

public class Point implements FigureInterface{
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.print("\nPoint coordinates: " + x + " " + y);
    }
}
