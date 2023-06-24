package com.cursoloiane.estruturasdados.vetor.exercicios;

import com.cursoloiane.estruturasdados.vetor.Lista;

/*
    Melhore a classe Lista e implemente o método remove(T elemento), onde será possível remover um elemento da lista
    passando o mesmo como parâmetro.
 */

public class Ex03 {
    public static void main(String[] args){
        Lista<String> vetor = new Lista<>(4);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);

        vetor.remove("A");

        System.out.println(vetor);

        if(vetor.remove("D"))
            System.out.println("A exclusão foi realizado com sucesso!");
        else {
            System.out.println("A exclusão não foi realizada.");
        }
        System.out.println(vetor);
    }
}
