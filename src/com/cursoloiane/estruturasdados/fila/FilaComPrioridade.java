package com.cursoloiane.estruturasdados.fila;

import com.cursoloiane.estruturasdados.base.EstruturaEstatica;

public class FilaComPrioridade<T> extends Fila<T> {
    public void enfileira(T elemento){
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i = 0; i<tamanho; i++){
            if(chave.compareTo(elementos[i]) < 0){
                break;
            }
        }
        adiciona(i,elemento);

    }
}
