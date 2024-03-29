package com.Task3;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height)
    {
        this.x1 = x1;
        this.y1 = y1;
        x2=this.x1+width;
        y2=this.y1+height;

    }

    public int getX() {

        return x1;
    }

    public int getY() {

        return y1;
    }


    public int getWidth()
    {

        return x2;
    }

    public int getHeight()
    {

        return y2;
    }

    public boolean collides(Ball ball)
    {
        boolean flag=false;
        if (ball.getX()+ball.getRadius()> x1 && ball.getX()-ball.getRadius()> x1 &&
                ball.getX()+ball.getRadius()< x2 && ball.getX()-ball.getRadius()< x2 &&
                ball.getY()+ball.getRadius()> y1 && ball.getY()-ball.getRadius()> y1 &&
                ball.getY()+ball.getRadius()< y2 && ball.getY()-ball.getRadius()< y2)
            flag=true;
        return flag;
    }
	@Override
    public int hashCode() {
        int result = 17;

        result = 19 * result +x1;
        result = 19 * result +x2;
        result = 19 * result +y1;
        result = 19 * result +y2;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Container container = (Container) obj;
        return container.x1 == x1 && container.y1 == y1 && container.x2 == x2 &&
                container.y2 == y2;
    }

    @Override
    public String toString() {
        return "Container[" + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
