package com.example.demo.bank.domain;

public class BankAccountDTO {

    private int balance;
    private int deposit;
    private int withdraw;
    private int checkMyBalance;
    private int amount;

    // Balance Set
    public void setBalance(int balance){
        this.balance = balance;
    }
    // Balance Get
    public int getBalance(){
        return this.balance;
    }
    // Deposit Set
    public void setDeposit(int deposit){
        this.deposit = deposit;
    }
    // Deposit Get
    public int getDeposit(){
        return this.deposit;
    }
    // Withdraw Set
    public void setWithdraw(int withdraw){
        this.withdraw = withdraw;
    }
    // Withdraw Get
    public int getWithdraw(){
        return this.withdraw;
    }
    // CheckMyBalance Set
    public void setCheckMyBalance(int checkMyBalance){
        this.checkMyBalance = checkMyBalance;
    }
    // CheckMyBalance Get
    public int getcheckMyBalance(){
        return this.checkMyBalance;
    }
    // Amount Set
    public void setAmount(int amount){
        this.amount = amount;
    }
    // Amount Get
    public int getAmount(){
        return this.amount;
    }
}