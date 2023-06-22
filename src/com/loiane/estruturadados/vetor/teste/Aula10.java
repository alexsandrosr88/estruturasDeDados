package com.loiane.estruturadados.vetor.teste;

import com.cursoLoiane.estruturas.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args){
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        if(vetor.busca(c1) > -1)
            System.out.println("O contato existe!");
        else{
            System.out.println("O contato não existe!");
        }

        System.out.println(vetor);
    }
}
