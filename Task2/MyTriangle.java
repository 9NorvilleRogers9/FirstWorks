package com.Task2;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {

    }

    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3)
    {
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    @Override
    public String toString() {
        return "v1=" + v1.getX()+ " " + v1.getY() +"v2=" + v2.getX()+ " " + v2.getY() + "v3=" + v3.getX()+ " " + v3.getY() ;
    }

    public double getPerimetr()
    {
        double perimetr;
        return perimetr = v1.distance(v2.getX(),v2.getY())+v2.distance(v3.getX(),v3.getY())+v3.distance(v1.getX(),v1.getY());
    }

    public String getType()
    {
        double a=v1.distance(v2.getX(),v2.getY());
        double b=v2.distance(v3.getX(),v3.getY());
        double c= v3.distance(v1.getX(),v1.getY());
        String name="";
        if ((a==b) && (a==c))
        {
            name="equilateral";
        }
        else if((a!=b)&&(a!=c)&&(b!=c))
        {
            name="versatile";
        }
        else if ((a==b && b!=c)||(b==c && a!=c) || (a==c && b!=c))
        {
            name="isosceles";
        }
        return name;
    }
}
