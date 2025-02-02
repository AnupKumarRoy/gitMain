package com.example;

public class DisplayDetails {

    public void displayDetails(Book book) {
        System.out.println("Author Name: " + book.getAuthor());
        System.out.println("Title Name: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setAuthor("Vikin Raj");
        b1.setTitle("Physics");
        b1.setPrice(2000.0);
        new DisplayDetails().displayDetails(b1);
        Book b2 = new Book("Anup Kumar Roy A", "Maths", 2500.0);
        new DisplayDetails().displayDetails(b2);

    }
}
