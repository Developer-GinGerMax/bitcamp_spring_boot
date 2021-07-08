package com.example.demo.math.domain;

public class CalculatorDTO {
    private int num1;
    private int num2;
    private String opcode;
    // num1 Set
    public void setNum1(int num1){
        this.num1 = num1;
    }
    // num1 Get
    public int getNum1(){
        return this.num1;
    }
    // num2 Set
    public void setNum2(int num2){
        this.num2 = num2;
    }
    // num2 Get
    public int getNum2(){
        return this.num2;
    }
    // opcode Set
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    // opcode Get
    public String getOpcode(){
        return this.opcode;
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d", num1, num2, opcode);
    }
}