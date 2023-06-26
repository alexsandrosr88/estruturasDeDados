package com.cursoloiane.estruturasdados.pilha.exercicios;

import com.cursoloiane.estruturasdados.pilha.Pilha;

import java.util.Random;

/*
1- Escreva um programa que leia 10 números, Para cada número lido verifique de acordo com as regras a seguir:
- Se o número for par, empilhe na pilha.
- Se o número for impar, desempilhe um número da pilha. Caso esteja vazia, mostre uma mensagem.
- Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, imprimindo-os.

 */
public class Ex01 {
    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<>();
        Random rn = new Random();

        for(int i =0; i< 10; i++){
             int n = rn.nextInt(10);
            if(n % 2 == 0)
             pilha.empilha(n);
            else if(pilha.estavazia())
                System.out.println("A lista está vazia!");
            else
                pilha.desempilhar();
        }
        System.out.println(pilha);
    }
}
