package com.devsuperpoo.classesabstratas.application;

import com.devsuperpoo.classesabstratas.entities.Account;
import com.devsuperpoo.classesabstratas.entities.BusinessAcount;
import com.devsuperpoo.classesabstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Edvaldo", 500.00, 0.01));
        list.add(new BusinessAcount(1002, "Djane",   1000.00, 400.00));
        list.add(new SavingsAccount(1003, "Silvano", 300.0, 0.01));
        list.add(new BusinessAcount(1004, "Luciene", 500.0, 500.0));
        System.out.println();

        double  totalBalance = 0.0;
        for (Account ac : list){
            System.out.printf("Conta: %d %s  R$ %.2f%n", ac.getNumber(), ac.getHolder(), ac.getBalance());
            totalBalance += ac.getBalance();

        }
        System.out.printf("Saldo total de todas as contas: R$ %.2f%n\n", totalBalance);


        double totalBalanc = 0.0;
        for (Account acc : list){
            acc.deposit(50.0);
            System.out.printf("Conta: %d %s  R$ %.2f%n", acc.getNumber(), acc.getHolder(), acc.getBalance());
            totalBalanc += acc.getBalance();
        }
        System.out.printf("Saldo total de todas as contas: R$ %.2f%n\n", totalBalanc);
    }
}
