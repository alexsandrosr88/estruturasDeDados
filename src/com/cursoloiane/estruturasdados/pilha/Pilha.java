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

//    public T desempilhar(){
//
//        if(estavazia()){
//            return null;
//        }
//        T elementoRemovido = elementos[tamanho-1];
//
//        elementos[tamanho-1] = null;
//        tamanho--;
//
//        return elementoRemovido;
//    }

    //Forma simplificada
    public T desempilhar(){

        if(estavazia()){
            return null;
        }
        return elementos[--tamanho];
    }
}
