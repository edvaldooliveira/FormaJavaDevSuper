package com.devsuperpoo.contribuintes.application;

import com.devsuperpoo.contribuintes.entities.Company;
import com.devsuperpoo.contribuintes.entities.Individual;
import com.devsuperpoo.contribuintes.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);
            }
            else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }

        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer dados : list){
            //double tax = dados.tax();
            System.out.println(dados.getName() + ": $ " + String.format("%.2f", dados.tax()));
            sum += dados.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ " +  String.format("%.2f", sum));

        sc.close();
    }
}
