package com.pluralsight;

public class Book {
    private String title;

    private int numberOfPages;

    private String author;

    private int year;
    private String type;
    private String genre;

    private double price;

    public Book(String title, int numberOfPages, String author, int year, String type, String genre, double price) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.year = year;
        this.type = type;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}


