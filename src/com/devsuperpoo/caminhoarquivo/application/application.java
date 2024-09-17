package com.devsuperpoo.caminhoarquivo.application;

import java.io.File;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o cominho do arquivo: ");
        String pathArquivo = sc.nextLine();

        File paht = new File(pathArquivo);

        System.out.println("getPath: " + paht.getPath());
        System.out.println("getParent: " + paht.getParent());
        System.out.println("geNome: " + paht.getName());

        sc.close();
    }

}
