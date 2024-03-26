package org.entities;

import java.util.Random;

public class Passageiro {
    private Random geradorID;
    private int idPassageiro;
    private String nomePassageiro;
    private String cpfPassageiro;
    private SistemaFidelidade analiseFidelidade;

    public Passageiro(String nomePassageiro, String cpfPassageiro) {
        this.cpfPassageiro = cpfPassageiro;
        this.nomePassageiro = nomePassageiro;
        this.analiseFidelidade = new SistemaFidelidade();
        geradorID = new Random();
        this.idPassageiro = geradorID.nextInt(1000) + 1;
    }

    public void addPontos(int qtdPontos){
        analiseFidelidade.adicionarPontos(qtdPontos);
    }
    public void resgatarPontos(int qtdPontos){
        analiseFidelidade.resgatarPontos(qtdPontos);
    }
    public void verificaQtdPontos(){
        System.out.println("Pontos:" + analiseFidelidade.getPontosAcumulados());
    }
    public String getCpfPassageiro() {
        return cpfPassageiro;
    }

    public void setCpfPassageiro(String cpfPassageiro) {
        this.cpfPassageiro = cpfPassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }


    @Override
    public String toString() {
        return "--Dados Passageiro--\n" + "ID:" + idPassageiro + "\nNome:" + nomePassageiro +
                "\nCPF:" + cpfPassageiro + "\nPontos acumulados:" + analiseFidelidade.getPontosAcumulados();
    }
}
