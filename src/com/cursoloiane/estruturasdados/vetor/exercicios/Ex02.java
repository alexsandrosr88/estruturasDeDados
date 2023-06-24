package com.cursoloiane.estruturasdados.vetor.exercicios;

import com.cursoloiane.estruturasdados.vetor.Lista;

/*
    Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe ArrayList.
 */
public class Ex02 {
    public static void main(String[] args){
        Lista<String> lista = new Lista<>(3);

        lista.adiciona("Alex");
        lista.adiciona("Alex");
        lista.adiciona("Alex");

        System.out.println(lista.ultimoIndice("Alex"));
    }
}
