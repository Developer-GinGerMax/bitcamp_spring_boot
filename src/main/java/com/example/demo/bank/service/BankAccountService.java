package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

/*
    ** 은행이름은 상수로 정한다.
    * 이름을 입력하면 계좌가 생성된다, 단 계좌번호는 ****-****-**** 이고 랜덤값이다.
    * 계좌번호를 입력한 후 잔액을 확인한다.
    * 금액, 계좌번호를 입력한 후 입금한 후 잔액을 확인한다.
    * 금액, 계좌번호를 입력한 후 출금한 후 잔액을 확인한다.
    * 계좌번호를 입력한 후 계좌를 해지한다.
    *
     */
public interface BankAccountService{
    void creatAccount(BankAccountDTO bank);
    int findBalance(BankAccountDTO bank);
    int deposit(BankAccountDTO bank);
    int withdraw(BankAccountDTO bank);
    void dropAccount(BankAccountDTO bank);


}