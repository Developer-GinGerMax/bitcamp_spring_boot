package com.example.demo.Calcu.controller;

import com.example.demo.Calcu.domain.CalcuDTO;
import com.example.demo.Calcu.service.CalcuService;
import com.example.demo.Calcu.service.CalcuServiceImpl;

import java.util.Scanner;

public class CalcuController{
    Scanner scanner = new Scanner(System.in);
    CalcuDTO calcu = new CalcuDTO();
    CalcuService calcuService = new CalcuServiceImpl();

    public void calculator(){
        System.out.println("첫번째 숫자");
        calcu.setNum1(scanner.nextInt());
        System.out.println("두번째 숫자");
        calcu.setNum2(scanner.nextInt());
        System.out.println("연산자 입력");
        calcu.setOpcode(scanner.next());
        int result = 0;
        switch(calcu.opcode){
            case "+": result = calcuService.add(calcu);
                break;
            case "-": result = calcuService.subtract(calcu);
                break;
            case "*": result = calcuService.multiple(calcu);
                break;
            case "/": result = calcuService.device(calcu);
                break;
            case "%": result = calcuService.remain(calcu);
                break;
        }
        System.out.printf("%d %s %d = %d",calcu.getNum1(),calcu.getOpcode(),calcu.getNum2(),result);
    }

    public void sequence(){
        System.out.println("수열의 시작값");
        calcu.setNum1(scanner.nextInt());
        System.out.println("수열의 끝값");
        calcu.setNum2(scanner.nextInt());
        int[] arr = calcuService.sequence3(calcu);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

}
