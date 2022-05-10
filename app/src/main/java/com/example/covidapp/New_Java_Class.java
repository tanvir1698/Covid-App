package com.example.covidapp;

public class New_Java_Class {
    int x,y;
    String newStr;

    public New_Java_Class(int x, int y, String newStr) {
        this.x = x;
        this.y = y;
        this.newStr = newStr;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNewStr() {
        return newStr;
    }

    public void setNewStr(String newStr) {
        this.newStr = newStr;
    }
}
