package com.example.demo.util.service;

public class UtilServiceImplTest {
    public static void main(String[] args) {
        String result = "";
        for(int i = 0; i<12; i++){
            result += (int)(Math.random() * 10);
        }
        //System.out.println((int)(Math.random() * 1000) + 1);
        System.out.println(result);
    }
}