package com.novidadejava;

public class Switch {
    public static void main(String[] args) {

        var produto = "Farinhas";
        System.out.println();
        switch(produto){
        case "Azeite"   -> System.out.println("Produto: Azei");
        case "Oleo"     -> System.out.println("Produto: Oleo");
        case "Arroz"    -> System.out.println("Produto: Arroz");
        case "Açucar"   -> System.out.println("Produto: Açucar");
        case "Farinhas" -> System.out.println("Produto: Farinhas");
        }
    }
}
