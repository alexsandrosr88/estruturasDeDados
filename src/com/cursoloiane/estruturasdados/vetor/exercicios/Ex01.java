package com.cursoloiane.estruturasdados.vetor.exercicios;

import com.cursoloiane.estruturasdados.vetor.Lista;

/*
    Melhore a classe Lista e implemente o método contém, semelhante ao método contains da classe ArrayList.
 */

public class Ex01 {
    public static void main(String[] args){
        Lista<Integer> vetor = new Lista<>(3);

        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);

        System.out.println(vetor);

        if(vetor.contem(3))
            System.out.println("O número existe no vetor.");
        else
            System.out.println("O número não existe no vetor.");
    }
}
