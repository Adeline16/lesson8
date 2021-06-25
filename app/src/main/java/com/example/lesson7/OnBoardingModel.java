package com.example.lesson7;

public class OnBoardingModel {
    String title;
    String des;
    int image;

    public String getDes() {
        return des;
    }

    public OnBoardingModel(String title, String des, int image) {
        this.title = title;
        this.image = image;
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
