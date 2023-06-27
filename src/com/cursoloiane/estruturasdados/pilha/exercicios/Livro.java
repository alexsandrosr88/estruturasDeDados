package com.cursoloiane.estruturasdados.pilha.exercicios;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Livro {
    private String nome;
    private String isbn;
    private LocalDate dtLancamento;

    public Livro(String nome, String isbn, LocalDate dtLancamento) {
        this.nome = nome;
        this.isbn = isbn;
        this.dtLancamento = dtLancamento;
    }

    public Livro() {
        nome = "";
        isbn = "";
        //dtLancamento = LocalDate.of(1, 1, 1);
        dtLancamento = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDtLancamento() {
        return dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", dtLancamento=" + dtLancamento +
                '}';
    }
}
