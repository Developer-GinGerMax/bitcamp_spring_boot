package com.example.demo.Calcu.domain;

public class CalcuDTO {
    public int num1;
    public int num2;
    public String opcode;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
    public int getNum1() {
        return this.num1;
    }
    public int getNum2() {
        return this.num2;
    }
    public String getOpcode() {
        return this.opcode;
    }
}