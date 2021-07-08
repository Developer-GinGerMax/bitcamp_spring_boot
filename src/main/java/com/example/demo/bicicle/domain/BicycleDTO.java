package com.example.demo.bicicle.domain;

public class BicycleDTO {
    // Bicycle Property
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

    @Override
    public String toString() {
        return String.format("기어 : %d단 \n브랜드 : %s\n스피드 : %dkm",gear,brand,speed);
    }
}