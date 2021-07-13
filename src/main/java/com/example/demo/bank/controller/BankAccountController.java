package com.example.demo.bank.controller;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;

import java.util.Scanner;

public class BankAccountController {
        private BankAccountService bankAccountService;
        private BankAccountDTO bankAccountDTO;
        private Scanner scanner;

        public BankAccountController(){
                this.bankAccountService = new BankAccountServiceImpl();
                this.bankAccountDTO = new BankAccountDTO();
                this.scanner = new Scanner(System.in);
        }

        public void main() {
                System.out.println("계좌 만들거야?[MENU] \n 0.EXIT \n 1.계좌계설 \n 2.잔액확인 \n 3.입금 \n 4.출금 \n 5.계좌해지");
                while(true){
                        switch(scanner.next()){
                                case "0": return;
                                case "1":
                                        System.out.println("이름이 머야?");
                                        bankAccountDTO.setName(scanner.next());
                                        this.bankAccountService.creatAccount(bankAccountDTO);
                                        break;
                                case "2":
                                        System.out.println("계좌번호 머야?");
                                        bankAccountDTO.setAccountNumber(scanner.next());
                                        bankAccountService.findBalance(bankAccountDTO);
                                        break;
                                case "3":
                                        System.out.println("계좌번호 머야?");
                                        bankAccountDTO.setAccountNumber(scanner.next());
                                        System.out.println("얼마 입금할거야?");
                                        bankAccountDTO.setMoney(scanner.nextInt());
                                        bankAccountService.deposit(bankAccountDTO);
                                        break;
                                case "4":
                                        System.out.println("계좌번호 머야?");
                                        bankAccountDTO.setAccountNumber(scanner.next());
                                        System.out.println("얼마 출금할거야?");
                                        bankAccountDTO.setMoney(scanner.nextInt());
                                        bankAccountService.withdraw(bankAccountDTO);
                                        break;
                                case"5":
                                        System.out.println("계좌번호 머야?");
                                        bankAccountDTO.setAccountNumber(scanner.next());
                                        bankAccountService.dropAccount(bankAccountDTO);
                                        break;
                        }
                }
        }




        // 두 개의 인스턴스 생성
        /*
        BankAccountDTO Yoon = new BankAccountDTO();
        BankAccountDTO Park = new BankAccountDTO();
        //각 인스턴스 대상으로 예금 진행
        Yoon.deposit(5000);
        Park.deposit(3000);
        //각 인스턴스 대상으로 출금 진행
        Yoon.withdraw(2000);
        Park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        Yoon.checkMyBalance();
        Park.checkMyBalance();
        */
}