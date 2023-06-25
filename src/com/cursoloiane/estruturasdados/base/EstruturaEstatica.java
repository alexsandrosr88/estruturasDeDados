package com.cursoloiane.estruturasdados.base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public EstruturaEstatica(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public EstruturaEstatica() {
        elementos = (T[]) new Object[10];
        tamanho = 0;
    }

    public boolean estavazia() {
        return tamanho == 0;
    }

    protected boolean adiciona(T elemento) {
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
        return true;
    }

    protected boolean adiciona(int posicao, T elemento) {
        validaPosicao(posicao);

        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public T obtem(int posicao) {
        validaPosicao(posicao);
        return elementos[posicao];
    }

    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    public int indiceDe(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    protected void aumentaCapacidade() {
        if (tamanho == elementos.length) {

            T[] novoElementos = (T[]) new Object[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                novoElementos[i] = elementos[i];
            }
            elementos = novoElementos;
        }
    }

    private void validaPosicao(int posicao) {
        if (posicao < 0 || posicao > elementos.length)
            throw new IllegalArgumentException("Posição inválida!");
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

    public int ultimoIndice(T elemento) {
        int indice = -1;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                indice = i;
        }
        return indice;
    }

    public T remove(int posicao) {
        validaPosicao(posicao);

        T elemento = elementos[posicao];

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;

        return elemento;
    }

    public boolean remove(T elemento) {
        int posicao = busca(elemento);

        if (posicao == -1)
            return false;
        else {
            for (int i = posicao; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[tamanho - 1] = null;
            tamanho--;
            return true;
        }

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            if(elementos[i] != null) {
                s.append(elementos[i]);
                s.append(",");
            }
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
