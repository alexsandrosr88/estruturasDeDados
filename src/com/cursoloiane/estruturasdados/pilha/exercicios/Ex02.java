package com.cursoloiane.estruturasdados.pilha.exercicios;

import com.cursoloiane.estruturasdados.pilha.Pilha;

import java.util.Random;

/*
Escreva uma programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir:
- Se o número for par, empilhe na pilha chamada par;
-Se o número for impar, empilhe na pilha chamada impar;
Se o número for zero(0), desempilhe um elemento de cada pilha. Caso alguma pilha esteje vazia, mostre uma mensagem de erro na tela.
Ao final do programa desempilhe todos os elementos das duas pilhas, imprimindo-os na tela.

 */
public class Ex02 {
    public static void main(String[] args) {
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        Random rn = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rn.nextInt(10);

            if (n % 2 == 0)
                pilhaPar.empilha(n);
            else if (n == 0) {
                pilhaPar.desempilhar();
                pilhaImpar.desempilhar();
            } else {
                pilhaImpar.empilha(n);
            }
        }
        System.out.println(pilhaPar);
        System.out.println(pilhaImpar);
    }
}
