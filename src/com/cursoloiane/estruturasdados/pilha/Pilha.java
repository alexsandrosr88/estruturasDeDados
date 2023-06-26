package com.cursoloiane.estruturasdados.pilha;

import com.cursoloiane.estruturasdados.base.EstruturaEstatica;

import java.util.Arrays;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){
        if(estavazia()) {
            return null;
        }
        return elementos[tamanho-1];
    }

    //Forma simplificada
    public T desempilhar(){

        if(estavazia()){
            return null;
        }
        return elementos[--tamanho];
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("|=|");
        s.append(" \n");

        for (int i = tamanho - 1; i >= 0 ; i--) {
            if(elementos[i] != null) {
                s.append(" ");
                s.append(elementos[i]);
                s.append("\n");
            }
        }
        s.append("|=|");
        return s.toString();
    }
}
