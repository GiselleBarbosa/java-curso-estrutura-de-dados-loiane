package com.br.estruturadados.vetor.teste;

import com.br.estruturadados.vetor.Vetor;

public class aula04 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.espacosUtilizados());

        System.out.println(vetor);
    }
}
