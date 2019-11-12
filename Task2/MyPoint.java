package com.Task2;
import java.math.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {

    private int x=0;
    private int y=0;

    public MyPoint(){}

    public MyPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY()
    {
        int[] arr = new int[]{x,y};
        return arr ;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y)
    {
        double res;
        return res = sqrt(pow(this.x - x,2) + pow(this.y - y,2));
    }

    public double distance(MyPoint myPoint)
    {
        double res;
        return res = sqrt(pow(this.x-myPoint.x,2)+pow(this.y-myPoint.y,2)) ;
    }



    public double distance()
    {
        double res;
        return res = sqrt(pow(this.x,2)+ pow(this.y,2));
    }
	@Override
    public int hashCode() {
        int result = 17;
        result = 19 * result + x;
        result = 19 * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  ==  null || obj.getClass() != this.getClass()) {
            return false;
        }

        MyPoint myPoint = (MyPoint) obj;
        return myPoint.x == x && myPoint.y == y;
    }
	
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
