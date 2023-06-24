package com.cursoloiane.estruturasdados.vetor.exercicios;

import com.cursoloiane.estruturasdados.vetor.teste.Contato;

import java.util.ArrayList;

/*
    Utilize a classe ArrayList e desenvolva os seguintes items:
        1. Crie uma lista utilizando a classe ArrayList da API do Java;
        2. Passe todos os contatos do vetor para o ArrayList;
        3. Crie um exemplo para utilizar cada método da classe ArrayList(somente os métodos que implementamos de
        forma similar na classe List.);
 */
public class Ex07 {
    public static void main(String[] args) {
        ArrayList<Contato> arrayList = new ArrayList<>();
        Contato contato;

        for (int i = 1; i <= 20; i ++){
            contato = new Contato("Fulano"+i, "1234-1345","fulano"+i+"@email.com");
            arrayList.add(contato);
        }

        System.out.println(arrayList);

        contato = new Contato("Fulano1", "1234-1345","fulano1@email.com");

        arrayList.remove(contato);

        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.add(0,contato);

        System.out.println(arrayList);

        System.out.println(arrayList.get(1));

        contato = new Contato("Fulano20", "1234-1345","fulano20@email.com");
        System.out.println(arrayList.contains(contato));

        System.out.println(arrayList.size());

        System.out.println(arrayList.indexOf(contato));

        arrayList.clear();

        System.out.println("\n"+arrayList);
    }
}
