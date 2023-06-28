package com.cursoloiane.estruturasdados.fila.teste;

import com.cursoloiane.estruturasdados.fila.Fila;

public class Aula19 {
    public static void main(String[] args){
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espiar());
        System.out.println(fila.desenfileira());
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        //System.out.println(fila.desenfileira());
        //System.out.println(fila.espiar());
        System.out.println(fila);
    }
}
