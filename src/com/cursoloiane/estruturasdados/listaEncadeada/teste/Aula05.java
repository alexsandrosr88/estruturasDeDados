package com.cursoloiane.estruturasdados.listaEncadeada.teste;

import com.cursoloiane.estruturasdados.listaEncadeada.ListaEncadeada;

public class Aula05 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);
        System.out.println(lista);


        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.limpa();

        System.out.println(lista);
    }
}
