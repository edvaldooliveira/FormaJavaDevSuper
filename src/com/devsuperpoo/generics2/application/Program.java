package com.devsuperpoo.generics2.application;

import com.devsuperpoo.generics2.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\info.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){


            }

            catch (IOException e) {

            }
        }
    }


}
