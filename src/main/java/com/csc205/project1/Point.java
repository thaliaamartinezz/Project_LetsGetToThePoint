package com.csc205.project1;

import java.lang.Math;

public class Point {
    public double x,y;

    public Point(){
        this(0,0);
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setPoint(double x,double y){
        setX(x);
        setY(y);
    }

    public void shiftX(double n){
        this.x += n;
    }

    public void shiftY(double n){
        this.y += n;
    }
    private double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point p2){
        return distance(p2.x, p2.y);
    }



    public void rotate(double angle){
        x = (x*Math.cos(angle))-(y*Math.sin(angle));
        y = (x*Math.sin(angle))+(y*Math.cos(angle));
    }

    public String toString(){
       return "Point{x = " + x + ", y = " + y + "}";
    }
}
