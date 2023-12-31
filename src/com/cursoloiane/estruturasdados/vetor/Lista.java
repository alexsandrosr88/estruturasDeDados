package com.cursoloiane.estruturasdados.vetor;

import java.util.Arrays;
import java.util.Objects;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }
    //Outra forma de declarar o contrutor e menos elegante.
//    public Lista(int capacidade, Class<T> tipoClasse) {
//        elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//        tamanho = 0;
//    }

    public int getTamanho() {
        return tamanho;
    }

    public T busca(int posicao) {
        validaPosicao(posicao);
        return elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return true;
        }
        return false;
    }
    public int ultimoIndice(T elemento){
        int ultimo = -1;

        for(int i =0; i< tamanho; i++){
            if(elementos[i].equals(elemento))
                ultimo = i;
        }
        if(ultimo == -1)
            return -1;
        else
            return ultimo;
    }

    public boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {

        aumentaCapacidade();
        //validaPosicao(posicao);
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public void remove(int posicao) {

        validaPosicao(posicao);

        for (int i = posicao; i < tamanho; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public boolean remove(T elemento) {
        int posicao = busca(elemento);

        if (posicao > -1) {
            validaPosicao(posicao);

            for (int i = posicao; i < tamanho-1; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[tamanho-1] = null;
            tamanho--;
            return true;
        } else
            return false;
    }

    public void limpar(){
        for (int i =0; i < tamanho-1; i++){
            elementos[i] = null;
        }
        tamanho = 0;
    }

    public T obtem(int posicao){
        validaPosicao(posicao);
        return elementos[posicao];
    }

    private void aumentaCapacidade() {

        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    private void validaPosicao(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(",\n");
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lista<?> lista = (Lista<?>) o;
        return getTamanho() == lista.getTamanho() && Arrays.equals(elementos, lista.elementos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getTamanho());
        result = 31 * result + Arrays.hashCode(elementos);
        return result;
    }
}
