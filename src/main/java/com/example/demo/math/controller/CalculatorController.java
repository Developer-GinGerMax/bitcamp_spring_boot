package com.example.demo.math.controller;
import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;
import com.sun.xml.internal.ws.server.ServiceDefinitionImpl;

import javax.xml.ws.Service;
import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl();
        // 숫자 1 입력
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        // 숫자 2 입력
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        // 숫자 연산자 입력
        System.out.println("연산자");
        String opcode = scanner.next();
        calculator.setOpcode(opcode);
        // 연산
        int result = 0;
        String opcodeString;
        switch (calculator.getOpcode()){
            /*
            case "+": result = calculator.getNum1() + calculator.getNum2();
            break;
            */
            case "+": result = calculatorService.add(calculator);
            break;
            case "-": result = calculatorService.subtract(calculator);
            break;
            case "*": result = calculatorService.multiple(calculator);
            break;
            case "/": result = calculatorService.divide(calculator);
            break;
            case "%": result = calculatorService.remain(calculator);
            break;
        }
        //System.out.print(calculator.toString());
        System.out.printf("%d %s %d = %d",
                calculator.getNum1(),
                calculator.getOpcode(),
                calculator.getNum2(),
                result);
    }
}