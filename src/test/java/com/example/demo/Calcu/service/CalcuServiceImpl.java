package com.example.demo.Calcu.service;

import com.example.demo.Calcu.domain.CalcuDTO;

public class CalcuServiceImpl implements CalcuService {
    @Override
    public int add(CalcuDTO calcu) {
        return calcu.getNum1() + calcu.getNum2();
    }

    @Override
    public int subtract(CalcuDTO calcu) {
        return calcu.getNum1() - calcu.getNum2();
    }

    @Override
    public int multiple(CalcuDTO calcu) {
        return calcu.getNum1() * calcu.getNum2();
    }

    @Override
    public int device(CalcuDTO calcu) {
        return calcu.getNum1() / calcu.getNum2();
    }

    @Override
    public int remain(CalcuDTO calcu) {
        return calcu.getNum1() % calcu.getNum2();
    }

    @Override
    public int[] sequence3(CalcuDTO calcu) {
        int count = calcu.getNum2() - calcu.getNum1() + 1;
        int[] arr = new int[count];
        int i = 0;
        for(int j = calcu.getNum1(); j <= calcu.getNum2(); j++){
           arr[i] = j;
           i++;
        }
        return arr;
    }
}
