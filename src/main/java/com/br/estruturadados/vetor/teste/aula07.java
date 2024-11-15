package com.br.estruturadados.vetor.teste;

import com.br.estruturadados.vetor.Vetor;

public class aula07 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("F");
        vetor.adiciona("G");

        vetor.adiciona(0,"A");
        vetor.adiciona(3,"D");
        vetor.adiciona(4,"E");

        System.out.println(vetor);

    }
}
