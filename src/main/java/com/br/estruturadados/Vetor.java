package com.br.estruturadados;

public class Vetor {

    private String[] meuArray;
    private int numeroDeElementos;

    public Vetor(int capacidade) {
        this.meuArray = new String[capacidade];
        this.numeroDeElementos = 0;
    }

    // VERSÃO 01
    /*public void adiciona(String elemento) {
        for (int i = 0; i < this.meuArray.length; i++) {
            if (this.meuArray[i] == null) {
                this.meuArray[i] = elemento;
                break;
            }
        }
    }*/

    // VERSÃO 02 COM TRATAMENTO DE EXCEÇÃO
   /* public void adiciona(String elemento) throws Exception {
        if (this.numeroDeElementos < this.meuArray.length) {
            this.meuArray[this.numeroDeElementos] = elemento;
            this.numeroDeElementos++;
        } else {
            throw new Exception("Vetor cheio, não é possível adicionar mais elementos.");
        }
    }*/

    // VERSÃO 03 UTILIZANDO BOOLEAN PARA NAO PRECISAR LANÇAR EXCEÇÃO
    public boolean adiciona(String elemento) {
        if (this.numeroDeElementos < this.meuArray.length) {
            this.meuArray[this.numeroDeElementos] = elemento;
            this.numeroDeElementos++;

            return true;
        }
        return false;
    }
}
