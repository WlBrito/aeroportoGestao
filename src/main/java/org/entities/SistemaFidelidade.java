package org.entities;

public class SistemaFidelidade {
    private int pontosAcumulados;
    public SistemaFidelidade(){
        this.pontosAcumulados = 0;
    }
    public void adicionarPontos(int qtdPontos){
        this.pontosAcumulados +=qtdPontos;
    }
    public boolean resgatarPontos(int pontosParaResgate) {
        if (pontosParaResgate <= 0 || pontosParaResgate > this.pontosAcumulados) {
            // Resgate inválido: quantidade negativa ou insuficiente de pontos
            return false;
        } else {
            // Reduz os pontos do saldo após o resgate
            this.pontosAcumulados -= pontosParaResgate;
            return true;
        }
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void setPontosAcumulados(int pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }
}
