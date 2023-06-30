package com.cursoloiane.estruturasdados.fila.teste;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int prioriddade;

    public Pessoa() {
        nome = "";
        prioriddade = 0;
    }

    public Pessoa(String nome, int prioriddade) {
        this.nome = nome;
        this.prioriddade = prioriddade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioriddade() {
        return prioriddade;
    }

    public void setPrioriddade(int prioriddade) {
        this.prioriddade = prioriddade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioriddade +
                "}\n";
    }

    @Override
    public int compareTo(Pessoa p) {
        if(prioriddade > p.getPrioriddade())
            return 1;
        else if(prioriddade < p.getPrioriddade()) {
            return -1;
        }
        return 0;
    }
}
