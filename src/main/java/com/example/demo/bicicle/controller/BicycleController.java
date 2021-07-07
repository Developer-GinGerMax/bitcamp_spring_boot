package com.example.demo.bicicle.controller;
import com.example.demo.bicicle.domain.Bicycle;
import java.util.Scanner;

public class BicycleController {
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