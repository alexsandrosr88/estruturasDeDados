package com.cursoloiane.estruturasdados.fila.teste;

import com.cursoloiane.estruturasdados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A", 2));
        fila.enfileira(new Paciente("C", 1));
        fila.enfileira(new Paciente("B", 3));

        System.out.println(fila.desenfileira());

        System.out.println(fila);
    }
}
