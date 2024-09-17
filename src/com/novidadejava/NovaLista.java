package com.novidadejava;

import java.util.ArrayList;
import java.util.List;

public class NovaLista {
    public static void main(String[] args) {

        List<String>  languages = new ArrayList<>()
        {{
            add("Tubos");
            add("Conexões");
            add("Ralos");
            add("Grelhas");
            add("Torneiras");
            add("registros");
        }};

        System.out.println("----------------------");
        for (String result : languages)
        System.out.println("Produto: " + result);
    }
}
