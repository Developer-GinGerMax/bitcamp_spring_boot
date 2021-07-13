package com.example.demo.commmon.controller;

import com.example.demo.Calcu.controller.CalcuController;
import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bicicle.controller.BicycleController;
import com.example.demo.bicicle.domain.BicycleDTO;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.controller.UtilController;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UtilController utilController = new UtilController();
        BankAccountController bankAccountController = new BankAccountController();
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();

        while(true){
            System.out.println("\n [MENU] \n 0.EXIT \n 1.CALCULATOR \n 2.ARRAY \n 3.DOG INFOMATION \n 4.BICYCLE INFOMARION \n 5.TODAY INFOMATION \n 6.BANK");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1": new CalcuController().calculator();
                     break;
                case "2": new CalcuController().sequence();
                    break;
                case "3":
                    DogDTO dog = new DogDTO();
                    System.out.println("이름이 무엇입니까?");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 무엇입니까?");
                    dog.setColor(scanner.next());
                    System.out.println("품종은 무엇입니까?");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    dogController.show();
                    break;
                case "4":
                    BicycleDTO bicycle = new BicycleDTO();
                    System.out.println("기어는? 몇단입니까");
                    bicycle.setGear(scanner.next());
                    System.out.println("브랜드는?");
                    bicycle.setBrand(scanner.next());
                    System.out.println("속도는?");
                    bicycle.setSpeed(scanner.next());
                    bicycleController.add(bicycle);
                    bicycleController.show();
                    break;
                case "5": utilController.todayAndCurrentTime();
                    break;
                case"6": bankAccountController.main();
                    break;
            }
        }
    }
}