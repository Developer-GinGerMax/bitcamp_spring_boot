package com.example.demo.math.controller;
import com.example.demo.math.domain.Calculator;
import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Scanner (System.in);
        System.out.println("숫자 1 ?");
        calculator..setNum1(scanner.next());
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3);
    }
}