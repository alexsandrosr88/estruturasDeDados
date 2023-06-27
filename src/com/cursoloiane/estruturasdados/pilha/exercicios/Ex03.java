package com.cursoloiane.estruturasdados.pilha.exercicios;

import com.cursoloiane.estruturasdados.pilha.Pilha;

import java.time.LocalDate;
import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        String[] livros = {"Java: Como Programar", "Head First Java",
                "Effective Java", "Java Concurrency in Practice",
                "Clean Code: A Handbook of Agile Software Craftsmanship",
                "Thinking in Java", "Java: The Complete Reference", "Java Performance: The Definitive Guide",
                "Java in a Nutshell", "Java 8 in Action", "Java Generics and Collections",
                "Java Network Programming", "Java Message Service", "Java Puzzlers: Traps, Pitfalls, and Corner Cases",
                "Head First Design Patterns", "Java Threads", "Java Cryptography", "Java Persistence with Hibernate",
                "JavaFX: Introduction by Example", "Java Performance Tuning"};

        int dia = 0, mes = 0, ano = 0;
        Pilha<Livro> pilha = new Pilha<>(20);

        for (int i = 0; i < 6; i++) {

            StringBuilder s = new StringBuilder();
            s.append("850");

            Random rd = new Random();

            for (int j = 0; j < 6; j++) {
                int n = rd.nextInt(10);
                s.append(n);
            }

            dia = rd.nextInt(30) + 1;
            mes = rd.nextInt(11) + 1;
            ano = rd.nextInt(1998, 2023);

            s.append("X");

            Livro livro = new Livro(livros[i], s.toString(), LocalDate.of(ano, mes, dia));
            pilha.empilha(livro);
        }
        System.out.println(pilha);
        System.out.println(pilha.topo());
        System.out.println(pilha.estavazia());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);
        System.out.println(pilha.obtem(0));
        Livro livro = new Livro("Effective Java", "850437827X", LocalDate.of(2001,7,7));
        System.out.println(pilha.busca(livro));
        System.out.println(pilha.getTamanho());
        System.out.println(pilha.remove(0));
        pilha.limpar();
        System.out.println(pilha);

    }
}

