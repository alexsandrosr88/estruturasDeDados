package com.cursoloiane.estruturasdados.fila.exercicios;

/*
    Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas. Cada pessoa
    pode receber uma senha prioritária ou uma senha normal. O programa deve obedecer os seguintes critérios:
     - Existe apenas 1 atendente;
     - 1 Pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
     - Não havendo prioridades, as pessoas com senha normal podem ser atendidas.
 */

import com.cursoloiane.estruturasdados.fila.FilaComPrioridade;
import com.cursoloiane.estruturasdados.fila.teste.Pessoa;

public class Ex02 {
    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> filaComPrioridade = new FilaComPrioridade<>();

        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano1", 2));
        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano2", 1));
        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano3", 2));
        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano4", 1));
        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano5", 1));
        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano6", 1));
//        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano7", 1));
//        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano8", 1));
//        filaComPrioridade.enfileiraCada3Prioridades(new Pessoa("fulano9", 2));


        System.out.println(filaComPrioridade);

    }
}
