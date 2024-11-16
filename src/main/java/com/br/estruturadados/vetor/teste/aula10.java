package com.br.estruturadados.vetor.teste;

import com.br.estruturadados.vetor.VetorObjetos;

public class aula10 {

    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(10);

        /*
        vetor.adiciona("maça");
        vetor.adiciona("banana");
        vetor.adiciona("laranja");
        vetor.adiciona("uva");
        vetor.adiciona("maracuja");

        System.out.println(vetor);

        System.out.println(vetor.busca(3));*/

        Contato c1 = new Contato("contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("contato 2", "3456-7890", "contato2@email.com");
        Contato c3 = new Contato("contato 3", "9876-4321", "contato3@email.com");

        Contato c4 = new Contato("contato 3", "9876-4321", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho do vetor = " + vetor.espacosUtilizados());

        System.out.println(vetor);

        int posicao = vetor.busca(c4);

        System.out.println("buscando por: c4");

        if (posicao > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
    }
}
