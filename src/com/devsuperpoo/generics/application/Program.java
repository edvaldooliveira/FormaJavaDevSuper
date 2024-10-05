package com.devsuperpoo.generics.application;

import com.devsuperpoo.generics.service.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = entrada.nextInt();
            ps.addValue(value);
        }

        System.out.println();
        ps.print();
        System.out.println("First: " + ps.first());
    }








}
