package com.devsupermodbasic.pedido.entities;

public class Product {
    private String name;
    private double prece;

    public Product(){

    }
    public Product(String name, double prece){
        this.name = name;
        this.prece = prece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrece() {
        return prece;
    }

    public void setPrece(double prece) {
        this.prece = prece;
    }
}
