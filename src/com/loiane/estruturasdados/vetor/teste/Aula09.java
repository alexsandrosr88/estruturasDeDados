package com.loiane.estruturasdados.vetor.teste;

import com.loiane.estruturasdados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor =  new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.remove(3);

        System.out.println(vetor);

        vetor.remove("A");

        System.out.println(vetor);



    }
}
