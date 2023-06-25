package com.cursoloiane.estruturasdados.pilha.teste;

import com.cursoloiane.estruturasdados.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);

        System.out.println(pilha);

        System.out.println(pilha.desempilhar());

        System.out.println(pilha);
    }
}
