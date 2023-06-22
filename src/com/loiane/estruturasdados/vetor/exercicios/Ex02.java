package com.loiane.estruturasdados.vetor.exercicios;

import com.loiane.estruturasdados.vetor.Lista;

import java.util.ArrayList;
import java.util.List;
public class Ex02 {
    public static void main(String[] args){
        Lista<String> lista = new Lista<>(3);

        lista.adiciona("Alex");
        lista.adiciona("Alex");
        lista.adiciona("Alex");

        System.out.println(lista.ultimoIndice("Alex"));
    }
}
