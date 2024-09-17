package com.novidadejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(10,7,3,15,3,1,9,4,12,5));
        System.out.println("\n Antes e Depois da ordenação:");
        System.out.println(" Ordenação tradicional = " + numeros);
        Collections.sort(numeros);
        System.out.println(" Ordenação com lambda  = " + numeros);


    }
}
