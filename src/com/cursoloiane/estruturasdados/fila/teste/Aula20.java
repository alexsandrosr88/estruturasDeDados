package com.cursoloiane.estruturasdados.fila.teste;

import com.cursoloiane.estruturasdados.fila.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estavazia());
        System.out.println(fila.getTamanho());

        System.out.println(fila);
    }
}
