package com.cursoloiane.estruturasdados.pilha.teste;

import com.cursoloiane.estruturasdados.pilha.Pilha;

public class Aula15 {
    public static void main(String [] args){
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estavazia());
        pilha.empilha(1);
        System.out.println(pilha);


    }
}
