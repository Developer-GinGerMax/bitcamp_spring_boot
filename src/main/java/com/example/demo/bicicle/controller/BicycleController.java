package com.example.demo.bicicle.controller;
import com.example.demo.bicicle.domain.BicycleDTO;
import com.example.demo.bicicle.service.BicycleService;
import com.example.demo.bicicle.service.BicycleServiceImpl;

import java.util.Scanner;

public class BicycleController {

    private BicycleService bicycleService;
    private BicycleDTO bicycle;
    private Scanner scanner;


    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycle = new BicycleDTO();
        this.scanner = new Scanner(System.in);
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = new BicycleDTO();
        System.out.println("기어는? 몇단입니까");
        bicycle.setGear(scanner.nextInt());
        System.out.println("브랜드는?");
        bicycle.setBrand(scanner.next());
        System.out.println("속도는?");
        bicycle.setSpeed(scanner.nextInt());
        System.out.printf("기어는 %d , 브랜드는 %s , 속도는 %d 임다.",bicycle.getGear(),bicycle.getBrand(),bicycle.getSpeed());
    }
}