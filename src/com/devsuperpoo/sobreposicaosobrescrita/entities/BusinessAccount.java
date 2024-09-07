package com.devsuperpoo.sobreposicaosobrescrita.entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }


    public void loan(double amount){
        if (amount <= loanLimit){ //Limite de empréstimo
            balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw(double amount){
      super.withdraw(amount);
      balance -= 2.0;
    }
}
