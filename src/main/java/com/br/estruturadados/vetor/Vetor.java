package com.br.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        return false;
    }

    // Quantidade de elementos contidos no Vetor
    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    public int busca(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            // algoritmo de busca sequencial
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.copyOfRange(elementos, 0, tamanho));
    }
}
