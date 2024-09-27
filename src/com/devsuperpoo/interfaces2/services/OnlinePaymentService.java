package com.devsuperpoo.interfaces2.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);

}
