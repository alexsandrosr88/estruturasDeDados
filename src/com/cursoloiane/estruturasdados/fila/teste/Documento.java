package com.cursoloiane.estruturasdados.fila.teste;

public class Documento implements Comparable<Documento>{
    private String nome;
    private int qtdfolhas;

    public Documento() {
        nome = "";
        qtdfolhas = 0;
    }

    public Documento(String nome, int qtdfolhas) {
        this.nome = nome;
        this.qtdfolhas = qtdfolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdfolhas() {
        return qtdfolhas;
    }

    public void setQtdfolhas(int qtdfolhas) {
        this.qtdfolhas = qtdfolhas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", qtdfolhas=" + qtdfolhas +
                '}';
    }

    @Override
    public int compareTo(Documento d) {

        if(qtdfolhas > d.getQtdfolhas())
            return 1;
        else if(qtdfolhas < d.getQtdfolhas()) {
            return -1;
        }

        return 0;
    }
}
