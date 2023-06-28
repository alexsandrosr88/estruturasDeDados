package com.cursoloiane.estruturasdados.fila.exercicios;

import com.cursoloiane.estruturasdados.fila.Fila;
import com.cursoloiane.estruturasdados.fila.teste.Documento;

public class Ex01 {
    public static void main(String[] args){
        Fila<Documento> filaImpressao = new Fila<>();

        filaImpressao.enfileira(new Documento("doumento1", 1));
        filaImpressao.enfileira(new Documento("doumento2", 10));
        filaImpressao.enfileira(new Documento("doumento3", 5));

        System.out.println(filaImpressao);

        do {
            System.out.println("Doumento impresso :"+ filaImpressao.desenfileira());

        }while(!filaImpressao.estavazia());

        System.out.println(filaImpressao);
    }
}
