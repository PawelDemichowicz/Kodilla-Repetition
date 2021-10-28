package com.kodilla.testing.shape;

public class Square implements Shape{
    String name = "square";
    double length;

    public Square( double length){
        this.length = length;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return length*length;
    }
}
