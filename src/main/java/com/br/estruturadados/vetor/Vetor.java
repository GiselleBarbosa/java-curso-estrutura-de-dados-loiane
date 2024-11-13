package com.br.estruturadados.vetor;

public class Vetor {

    private String[] meuArray;
    private int numeroDeElementos;

    public Vetor(int capacidade) {
        this.meuArray = new String[capacidade];
        this.numeroDeElementos = 0;
    }

    public boolean adiciona(String elemento) {
        if (this.numeroDeElementos < this.meuArray.length) {
            this.meuArray[this.numeroDeElementos] = elemento;
            this.numeroDeElementos++;

            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.numeroDeElementos;
    }
}
