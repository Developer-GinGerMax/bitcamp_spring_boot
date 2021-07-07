package com.example.demo.bicicle.domain;

public class Bicycle {
    // Bicycle
    private int gear;
    private String brand;
    private int speed;
    // Gear Set
    public void setGear(int gear){
        this.gear = gear;
    }
    // Gear Get
    public int getGear(){
        return this.gear;
    }
    // Brand Set
    public void setBrand(String brand){
        this.brand = brand;
    }
    // Brand Get
    public String getBrand(){
        return this.brand;
    }
    // Speed Set
    public void setSpeed(int speed){
        this.speed = speed;
    }
    // Speed Get
    public int getSpeed() {
        return this.speed;
    }
}