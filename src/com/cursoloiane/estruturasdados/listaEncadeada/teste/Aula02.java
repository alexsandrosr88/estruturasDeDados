package com.cursoloiane.estruturasdados.listaEncadeada.teste;

import com.cursoloiane.estruturasdados.listaEncadeada.ListaEncadeada;

public class Aula02 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);

        System.out.println("Tamanho: "+ lista.getTamanho());
        System.out.println(lista);
    }
}
