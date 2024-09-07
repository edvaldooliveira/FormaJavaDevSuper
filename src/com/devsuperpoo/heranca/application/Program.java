package com.devsuperpoo.heranca.application;


import com.devsuperpoo.heranca.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount(8010,"Edvaldo",0.0,500.0);
        System.out.println(account.getBalance());
    }
}
