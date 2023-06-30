package com.cursoloiane.estruturasdados.fila;

import com.cursoloiane.estruturasdados.base.EstruturaEstatica;

public class FilaComPrioridade<T> extends Fila<T> {
    private static int cont = 0;
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i = 0; i < tamanho; i++) {
            if (chave.compareTo(elementos[i]) < 0) {
                break;
            }
        }
        adiciona(i, elemento);
    }

    public void enfileiraCada3Prioridades(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i = 0, j = 0;

            for (i = 0; i < tamanho; i++) {
                j++;
                if (chave.compareTo(elementos[i]) < 0 && i < 3) {
                    break;
                }
//                else if(chave.compareTo(elementos[i]) == 0 && cont == 3){
//                    cont++;
//                    break;
//                }

            }



        adiciona(i, elemento);
    }
}
