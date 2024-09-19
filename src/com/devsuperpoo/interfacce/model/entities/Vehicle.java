package com.devsuperpoo.interfacce.model.entities;

public class Vehicle {
public Double basicPayment;
public Double tax;

public Vehicle(){
}
public Vehicle(double basicPayment, double tax){
    this.basicPayment = basicPayment;
    this.tax = tax;
}

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
    return getBasicPayment() + getTax();
    }
}
