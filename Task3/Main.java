package com.Task3;

public class Main {

    public static void main(String[] args) {

        /*MyComplex myComplex = new MyComplex();
        MyComplex myComplex1 = new MyComplex(5.0,7.0);
        MyComplex myComplex2 = new MyComplex();
        myComplex2.addNew(myComplex1);
        System.out.println(myComplex2.toString());
        //myComplex2.substractNew(myComplex1);
        //System.out.println(myComplex2.toString());
        myComplex.conjugate();
        System.out.println(myComplex.toString());

*/

       /* double[] mas = new double[]{1.0,12.0,25.0,27.0,19.0};
        MyPolynomial myPolynomial = new MyPolynomial(mas);
        System.out.println(myPolynomial.toString());*/

        Ball ball = new Ball(7,7,5,4,-6);
        Container square = new Container(0,0,20,100);

        System.out.println(ball);
        System.out.println(square);
        System.out.println("Ball in container: "+square.collides(ball));

        ball.move();
        System.out.println(" "+ball);
        System.out.println("Ball in container: "+square.collides(ball)+" ");


        System.out.println("Reflecting X direction");
        ball.reflectHorizontal();

        ball.move();
        System.out.println(" "+ball);
        System.out.println("Ball in container: "+square.collides(ball)+" ");
    }
}
