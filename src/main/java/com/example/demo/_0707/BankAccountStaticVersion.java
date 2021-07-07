package com.example.demo._0707;
public class BankAccountStaticVersion
{
    //예금 잔액
    static int balance = 0;

    public static void main(String[] args)
    {
        //입금 진행
        deposit(10000);
        // 잔액 확인
        checkMyBalance();
        //출금 진행
        withdraw(3000);
        // 잔액 확인
        checkMyBalance();
    }
    //입금을 담당하는 메소드
    public static int deposit(int amount)
    {
        balance += amount;
        return balance;
    }
    //출금을 담당하는 메소드
    public static int withdraw(int amount)
    {
        balance -=  amount;
        return balance;
    }
    // 예금 조회를 담당하는 메소드
    public static int checkMyBalance()
    {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
