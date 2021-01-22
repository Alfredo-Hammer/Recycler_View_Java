package com.example.recyclerviewjava;

public class ModelClass {

    private int imageResourse;
    private String title;
    private String body;

    public ModelClass(int imageResourse, String title, String body) {
        this.imageResourse = imageResourse;
        this.title = title;
        this.body = body;
    }

    public int getImageResourse() {
        return imageResourse;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
