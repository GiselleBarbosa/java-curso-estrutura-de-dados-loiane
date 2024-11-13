package com.br.estruturadados.vetor;

import java.util.Arrays;

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

    // Quantidade de elementos contidos no Vetor
    public int tamanho() {
        return this.numeroDeElementos;
    }

    @Override
    public String toString() {

       /* StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.numeroDeElementos - 1; i++) {
            s.append(this.meuArray[i]);
            s.append(", ");
        }

        if (this.numeroDeElementos > 0) {
            s.append(this.meuArray[this.numeroDeElementos - 1]);
        }
        s.append("]");

        return s.toString();*/

        // simplificando
        return Arrays.toString(Arrays.copyOfRange(meuArray, 0, numeroDeElementos));

    }
}
