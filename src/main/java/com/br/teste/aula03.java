package com.br.teste;

import com.br.estruturadados.Vetor;

public class aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        // REFERENTE A VERSAO 02 (VETOR) COM TRATAMENTO DE EXCEÇÃO
        /*try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");

    }
}
