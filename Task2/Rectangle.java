package com.Task2;

public class Rectangle {

    private float lenght = 1.0f;
    private float width =1.0f;

    public Rectangle()
    {

    }

    public Rectangle(float lenght, float width)
    {
        this.lenght=lenght;
        this.width=width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(float width,float lenght)
    {
        return width*lenght ;
    }
    public float getPerimetr()
    {
        return 2*(lenght+width);
    }
	@Override
    public int hashCode() {
        int result = 17;
        result = 19 * result + Float.floatToIntBits(lenght);
        result = 19 * result + Float.floatToIntBits(width);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  ==  null || obj.getClass() != this.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        return rectangle.lenght == lenght && rectangle.width == width;
    }

    @Override
    public String toString()
    {
        return "lenght"+lenght+"width"+width;
    }
}