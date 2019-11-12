package com.Task2;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {

   private double radius = 1.0;
   private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return pow(radius,2)*PI;
    }

    @Override
    public String toString()
    {
        return ("radius = " + radius + " " +"color = " + color);
    }
	
	@Override
    public int hashCode() {
        int result = 17;
        result = 19 * result + color.hashCode();
        result = 19 * result + (int)((Double.doubleToLongBits(radius))^(Double.doubleToLongBits(radius)>>>32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj  ==  null || obj.getClass() != this.getClass()) {
            return false;
        }

        Circle circle = (Circle) obj;
        return circle.radius == radius && circle.color.equals(color);
    }
}
