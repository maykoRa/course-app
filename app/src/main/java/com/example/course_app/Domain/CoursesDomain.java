package com.example.course_app.Domain;

public class CoursesDomain {
    private String title;
    private double price;
    private int picPath;

    public CoursesDomain(String title, double price, int picPath) {
        this.title = title;
        this.price = price;
        this.picPath = picPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPicPath() {
        return picPath;
    }

    public void setPicPath(int picPath) {
        this.picPath = picPath;
    }
}
