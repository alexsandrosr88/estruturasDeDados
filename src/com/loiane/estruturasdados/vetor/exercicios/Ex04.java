package com.loiane.estruturasdados.vetor.exercicios;

import com.loiane.estruturasdados.vetor.Lista;

import java.util.ArrayList;

/*
    Melhore a classe e implemente o método obtem(int posicao), onde será possível obter o elemento dada uma posição
    vetor. Esse método é semelhante ao método get(int posicao) da classe ArrayList.
 */

public class Ex04 {
    public static void main(String[] args){
        Lista<Integer> vetor = new Lista<>(3);

        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);

        System.out.println(vetor.obtem(2));


    }
}
