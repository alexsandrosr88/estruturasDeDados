package com.cursoloiane.estruturasdados.vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        elementos = new Object[capacidade];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Object busca(int posicao) {
        validaPosicao(posicao);
        return elementos[posicao];
    }

    public int busca(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    public boolean adiciona(Object elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Object elemento) {

        validaPosicao(posicao);

        aumentaCapacidade();
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

    public void remove(Object elemento) {
        int posicao = busca(elemento);

        if (posicao > -1) {

            validaPosicao(posicao);

            for (int i = posicao; i < tamanho; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[tamanho - 1] = null;
            tamanho--;
        } else
            System.out.println("O Elemento informado não existe no vetor!");
    }

    private void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            Object[] elementosNovos = new Object[elementos.length * 2];
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
            s.append(",");
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
