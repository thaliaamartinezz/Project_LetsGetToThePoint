package com.csc205.project1;

import java.lang.Math;

public class Point {
    //declare variables
    public double x,y;

    //create new point
    public Point(){
        this(0,0);
    }

    //set specific variables to new point
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //returns x
    public double getX(){
        return x;
    }
    //set specific number to variable x
    public void setX(double x){
        this.x = x;
    }

    //returns y
    public double getY(){
        return y;
    }

    //set specific number to variable y
    public void setY(double y){
        this.y = y;
    }
    //inserts specific number in variable x and y using previous methods
    public void setPoint(double x,double y){
        setX(x);
        setY(y);
    }

    //adds specific number to variable x
    public void shiftX(double n){
        this.x += n;
    }

    //adds specific number to variable y
    public void shiftY(double n){
        this.y += n;
    }
    //extra method for distance formula
    private double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    //inserts specific point into distance formula from previous method
    public double distance(Point p2){
        return distance(p2.x, p2.y);
    }

    //rotates point by specific angle using rotation formulas for x and y
    public void rotate(double angle){
        x = (x*Math.cos(angle))-(y*Math.sin(angle));
        y = (x*Math.sin(angle))+(y*Math.cos(angle));
    }
    //prints point value
    public String toString(){
       return "Point{x = " + x + ", y = " + y + "}";
    }
}
