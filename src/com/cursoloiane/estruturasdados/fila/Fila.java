package com.cursoloiane.estruturasdados.fila;

import com.cursoloiane.estruturasdados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento){
        aumentaCapacidade();
        adiciona(elemento);
    }
    public T espiar(){
        return elementos[0];
    }

    public T desenfileira(){
        T elemento = elementos[0];

        if(tamanho == 0){
            elementos[0] = null;
            return elemento;
        }

        for(int i = 0; i < tamanho; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;

        return elemento;
    }
}
