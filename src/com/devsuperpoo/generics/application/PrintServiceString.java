package com.devsuperpoo.generics.application;

import com.devsuperpoo.generics.service.PrintService;

import java.util.Scanner;

public class PrintServiceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String result = ps.first();
        System.out.println("First: " + result);

        sc.close();

    }
}
