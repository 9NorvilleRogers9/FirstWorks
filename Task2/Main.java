package com.Task2;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {

        /*Circle circle = new Circle();
        circle.setRadius(5.0);
        circle.setColor("green");
        double area=circle.getArea();
        String string = circle.toString();
        System.out.println(string);
        System.out.println("Circle area=" + area);*/

        /*Employee employee = new Employee(1,"John", "Deer", 50);
        int AnnSal = employee.getAnnualSalary();
        System.out.println(employee.getSalary());
        System.out.println("AnnualSalary:"+AnnSal);
        double raiseSalary=employee.raiseSalary(13);
        System.out.println("RaiseSalary:"+raiseSalary);*/


        /*Author author = new Author("Eddy" ,"mail@mail.com",'M');
        Author author1 = new Author("Jack","other.com",'M');
        Author authors[] = new Author[]{author,author1};
        Book book = new Book("GG", authors, 1337);
        System.out.println(book.getAuthorName());*/



        MyPoint myPoint  = new MyPoint(0,0);
        MyPoint myPoint1 = new MyPoint(50,50);
        MyPoint myPoint2 = new MyPoint(100,0);

        MyTriangle myTriangle = new MyTriangle(myPoint,myPoint1,myPoint2);
        double perimetr = myTriangle.getPerimetr();
        String type = myTriangle.getType();
        System.out.println("Perimetr:"+perimetr);
        System.out.println("Type:"+type);





    }
}
