package com.org.collektions;

public class Book implements Comparable<Book> {
    private String name; //title of book
    private String author;
    private double rating;
    private int year;//when it is published

    public Book(String name, String author, double rating, int year) {
        this.name = name;
        this.author = author;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Book book) {
        return this.year - book.year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
