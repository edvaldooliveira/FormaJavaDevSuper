package com.devsuperpoo.interfaces2.application;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fnt = DateTimeFormatter.ofPattern("dd/MM/yyyy : HH:mm");

        System.out.println("Entre os dados do contrato: ");


    }
}
