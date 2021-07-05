package com.example.demo;

public class BankAccount
{
    static int balance = 0;
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

class bankAccountOO
{
    public static void main(String[] args)
    {
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        yoon.deposit(5000);
        park.deposit(3000);

        yoon.withdraw(2000);
        park.withdraw(2000);

        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}


