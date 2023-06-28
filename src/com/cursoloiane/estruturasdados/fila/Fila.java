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
        adiciona(elemento);
    }
    public T espiar(){
        return elementos[0];
    }

    public T desenfileira(){
        final int POS = 0;

        if(estavazia()){
            return null;
        }

        T elementoASerRemovido = elementos[POS];

        remove(POS);

        return elementoASerRemovido;
    }
}
