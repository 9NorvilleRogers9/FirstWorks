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
    public int hashCode() {
        int result = 17;

        result = 19 * result + name.hashCode();
        result = 19 * result + Arrays.hashCode(authors);
        result = 19 * result + (int)((Double.doubleToLongBits(price))^(Double.doubleToLongBits(price)>>>32));
        result = 19 * result + qty;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  ==  null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return book.name.equals(name) && Arrays.equals(book.authors,authors) &&
                book.qty == qty && book.price == price;
    }
    @Override
    public String toString()
    {
        return "Book{" + "name='" + name + ' ' + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + '}';
    }
}
