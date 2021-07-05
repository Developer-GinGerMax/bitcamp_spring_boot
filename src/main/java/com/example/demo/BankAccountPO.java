package com.example.demo;

public class BankAccountPO {
    static int balance = 0;
    public static void main(String[] args)
    {
        //입금 진행
        deposit(10000);

        //잔액 확인
        checkMyBalance();
        
        //출금을 진행
        withdraw(3000);
        
        //잔액 확인
        checkMyBalance();
    }
    public static int deposit(int amount)
    {
        balance += amount;
        return balance;
    }

    public static int checkMyBalance()
    {
        System.out.println("잔액" + balance);
        return balance;
    }

    public static int withdraw(int amount)
    {
        balance -= amount;
        return balance;
    }

}