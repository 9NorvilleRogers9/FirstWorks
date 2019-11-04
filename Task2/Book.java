package com.Task2;
import java.util.Arrays;
public class Book {

   private String name;
   private Author[] authors;
   private double price;
   private int qty=0;

    public Book(String name, Author[] authors, double price)
    {
        this.name=name;
        this.authors=authors;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName()
    {
        String autName ="";
        for(Author aut:authors)
        {
            autName+=aut.getName()+" ";
        }
        return autName;
    }
    @Override
    public String toString()
    {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
