package com.example.recyclerviewjava;

public class Product {

    private int id;
    private  String title, shortdeso;
    private double rating;
    private  double price;
    private int image;

    public Product(int id, String title, String shortdeso, double v, double rating, int image) {
        this.id = id;
        this.title = title;
        this.shortdeso = shortdeso;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdeso() {
        return shortdeso;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice(){
        return price;
    }

    public int getImage() {
        return image;
    }
}
