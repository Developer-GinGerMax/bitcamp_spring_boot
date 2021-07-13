package com.example.demo.commmon.controller;

import com.example.demo.Calcu.controller.CalcuController;
import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bicicle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceimpl;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UtilController utilController = new UtilController();
        BankAccountController bankAccountController = new BankAccountController();

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
                    DogController dogController = new DogController(new DogServiceimpl(dog));
                    System.out.println(dogController.barking("왈왈"));
                    break;
                case "4": new BicycleController().main();
                    break;
                case "5": utilController.todayAndCurrentTime();
                    break;
                case"6": bankAccountController.main();
                    break;
            }
        }
    }
}