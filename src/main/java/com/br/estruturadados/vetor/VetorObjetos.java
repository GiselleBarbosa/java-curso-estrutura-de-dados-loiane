package com.br.estruturadados.vetor;

import java.util.Arrays;

public class VetorObjetos {

    private Object[] array;
    private int espacosUtilizados;

    public VetorObjetos(int tamanho) {
        this.array = new Object[tamanho];
        this.espacosUtilizados = 0;
    }

    public void adiciona(Object elemento) {

        this.aumentaCapacidade();

        if (this.espacosUtilizados < this.array.length) {
            this.array[this.espacosUtilizados] = elemento;
            this.espacosUtilizados++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao < 0 || posicao > this.espacosUtilizados) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        if (this.espacosUtilizados == this.array.length) {
            throw new IllegalStateException("Array está cheio, não é possível adicionar mais array.");
        }

        for (int i = this.espacosUtilizados - 1; i >= posicao; i--) {
            this.array[i + 1] = this.array[i];
        }

        this.array[posicao] = elemento;
        this.espacosUtilizados++;
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= this.espacosUtilizados) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.espacosUtilizados - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.espacosUtilizados - 1] = null;
        this.espacosUtilizados--;
    }

    private void aumentaCapacidade() {
        if (this.espacosUtilizados == this.array.length) {
            Object[] arrayNovos = new Object[this.array.length * 2];

            for (int i = 0; i < this.array.length; i++) {
                arrayNovos[i] = this.array[i];
            }

            this.array = arrayNovos;
        }
    }

    // Quantidade de array contidos no Vetor
    public int espacosUtilizados() {
        return this.espacosUtilizados;
    }

    public Object busca(int posicao) {

        if (!(posicao >= 0 && posicao < this.espacosUtilizados)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.array[posicao];
    }

    public int busca(Object elemento) {

        for (int i = 0; i < this.espacosUtilizados; i++) {
            // algoritmo de busca sequencial
            if (this.array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.copyOfRange(array, 0, VetorObjetos.this.espacosUtilizados));
    }
}

