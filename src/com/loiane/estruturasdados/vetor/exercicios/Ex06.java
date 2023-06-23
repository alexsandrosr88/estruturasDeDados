package com.loiane.estruturasdados.vetor.exercicios;

import com.loiane.estruturasdados.vetor.Lista;
import com.loiane.estruturasdados.vetor.teste.Contato;

/*
    Utilize a classe Lista ou Vetor e classe Contato (criada durante as aulas) e desenvolva os seguintes items:
    1. Crie um vetor com capacidade para 20 contatos;
    2. Insira 20 contatos no vetor (isso é possível ser feito através de um loop)
    3. Crie um exemplo para utilizar cada método da classe Lista.
 */
public class Ex06 {
    public static void main(String[] args) {
        Contato contato;
        Lista<Contato> vetor = new Lista<>(20);

        for (int i = 1; i <= 20; i ++){
            contato = new Contato("Fulano"+i, "1234-1345","fulano"+i+"@email.com");
            vetor.adiciona(contato);
        }
        System.out.println(vetor);

        System.out.println(vetor.getTamanho());

        System.out.println(vetor.obtem(8));
        System.out.println(vetor.busca(17));

        contato = new Contato("Fulano21","1234-1324","fulano21@email.com" );
        vetor.adiciona(contato);

        contato = new Contato("Fulano22","1234-1324","fulano22@email.com" );
        vetor.adiciona(contato);

        System.out.println(vetor);

        contato = new Contato("Fulano1","1234-1345","fulano1@email.com");

        System.out.println(vetor.contem(contato));

        contato = new Contato("Fulano1","1234-1345","fulano1@email.com");

        System.out.println(vetor.ultimoIndice(contato));

        vetor.remove(0);

        System.out.println(vetor);

        contato = new Contato("Fulano22","1234-1324","fulano22@email.com" );

        System.out.println(vetor.remove(contato));

        System.out.println(vetor);

        contato = new Contato("Fulano21","1234-1324","fulano21@email.com");

        System.out.println(vetor.busca(contato));

        vetor.limpar();
        System.out.println("\n"+vetor);

    }
}
