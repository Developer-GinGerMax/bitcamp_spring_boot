package com.example.demo.dog.controller;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import com.example.demo.dog.domain.DogDTO;

import java.util.Scanner;

public class DogController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = new DogDTO();//스태틱 공간 위에서 만들어 진다, 어플이라고 보면 쉬움
        System.out.println("이름이 머야?");
        dog.setName(scanner.next());
        System.out.println("색이 머야?");
        dog.setColor(scanner.next());
        System.out.println("품종이 머야?");
        dog.setBread(scanner.next());
        System.out.println("배고파해?");
        dog.setHungry(scanner.next());
        System.out.printf(dog.toString());
    }
}