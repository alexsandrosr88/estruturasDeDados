package com.cursoloiane.estruturasdados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Paciente> filaComPrioridade = new PriorityQueue<Paciente>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
//                        if(p1.getPrioridade() > p2.getPrioridade()){
//                            return 1;
//                        }
//                        else if (p1.getPrioridade() < p2.getPrioridade()){
//                            return -1;
//                        }
//
//                        return 0;
                        //Forma simplificada
                        return Integer.compare(p1.getPrioridade(), p2.getPrioridade());
                    }
                }
        );

        filaComPrioridade.add(new Paciente("A", 3));
        filaComPrioridade.add(new Paciente("C", 1));

        System.out.println(filaComPrioridade);
    }
}
