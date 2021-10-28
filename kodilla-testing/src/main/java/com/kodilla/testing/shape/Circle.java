package com.kodilla.testing.shape;

public class Circle implements Shape{
    String name = "circle";
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return 14 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
