package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;
    private List<BankAccountDTO> bankAccounts;

    public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
        bankAccounts = new ArrayList<>();
    }

    @Override
    public void creatAccount(BankAccountDTO bank) {
        bankAccount = new BankAccountDTO();
        String randomNumber = "";
        Random rand = new Random();
        System.out.println(rand.nextInt(1000000000));
    }

    @Override
    public int findBalance(BankAccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bank) {
        int restMoney = bankAccount.getMoney();
        bankAccount.setMoney(restMoney + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int withdraw(BankAccountDTO bank) {
        return 0;
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {

    }
}

    /**
     *
     *
     *
     *
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
     *
     *
     *
     */
