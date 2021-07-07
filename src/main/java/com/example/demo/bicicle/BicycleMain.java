package com.example.demo.bicicle;

import java.util.Scanner;

class Bicycle{
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

public class BicycleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicycle = new Bicycle();
        System.out.println("기어는?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("브랜드는?");
        bicycle.setBrand(scanner.next());
        System.out.println("속도는?");
        bicycle.setSpeed(scanner.nextInt());
        System.out.printf("기어는 %d , 브랜드는 %s , 속도는 %d 임다.",bicycle.getGear(),bicycle.getBrand(),bicycle.getSpeed());

    }
}
