package com.br.estruturadados.vetor.teste;

import com.br.estruturadados.vetor.Vetor;

public class aula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("G");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);

        vetor.remove(1);
        System.out.println("Elemento G foi removido com sucesso");

        System.out.println(vetor);

        System.out.println("Remover o elemento C");

        int pos = vetor.busca("C");
        if (pos > -1) {
            vetor.remove(pos);
            System.out.println("Elemento C foi removido com sucesso");

        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);

    }
}
