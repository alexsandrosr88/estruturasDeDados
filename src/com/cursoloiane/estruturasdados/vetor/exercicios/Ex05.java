package com.cursoloiane.estruturasdados.vetor.exercicios;

import com.cursoloiane.estruturasdados.vetor.Lista;

/*
    Melhore a classe Lista e implemente o método limpar, onde todos os elementos da lista são removidos.
    Esse método é semelhante ao método clear da classe ArrayList.
 */
public class Ex05 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(5);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);
    }
}
