package com.devsuperpoo.manipulandopastas.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FORDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File result : files){
            System.out.println(result);
        }


        boolean sucess = new File(strPath + "\\edvaldoProgramador").mkdirs();
        System.out.println("Diretory created successfully: " + sucess);

        sc.close();

    }

}
