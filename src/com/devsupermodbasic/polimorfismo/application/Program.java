package com.devsupermodbasic.polimorfismo.application;

import com.devsupermodbasic.polimorfismo.entities.Account;
import com.devsupermodbasic.polimorfismo.entities.BusinessAccount;
import com.devsupermodbasic.polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

      Account x = new Account(1020, "Alex", 1000.00);
      Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

      x.withdraw(50.0);
      y.withdraw(50.0);

        System.out.println("Valor de x: " + x.getBalance());
        System.out.println("Valor de y: " + y.getBalance());
    }
}
