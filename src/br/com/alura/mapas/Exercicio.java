package br.com.alura.mapas;

import java.util.HashMap;
import java.util.Map;

/* 
 * No código abaixo, temos um Map preparado que associa uma pessoa com a sua idade. Sabendo que temos acesso ao conjunto
 * de chaves de um Map através do método keySet(), implemente um código que itere por esse conjunto e imprima os 
 * seus valores.
 * 
 * */ 

public class Exercicio {
    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        //...
        
        System.out.println(pessoas); System.out.println("--------------------------------------------- ");
        
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });
    }

}
