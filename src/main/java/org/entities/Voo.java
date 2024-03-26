package org.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Voo {
    private Random geradorIDVoo;
    private int numeroVoo;
    private int capMaxPassageiros;
    private int capMinPassageiros;
    private List<Passageiro> listaDePassageiros;
    private List<String> listaDeEscalas;
    private String estadoDoVoo;

    public Voo() {
        this.geradorIDVoo = new Random();
        this.numeroVoo = geradorIDVoo.nextInt(1000) + 1;
        this.capMaxPassageiros = 0;
        this.capMinPassageiros = 0;
        this.listaDePassageiros = new ArrayList<>();
        this.listaDeEscalas = new ArrayList<>();
        this.estadoDoVoo = "";
    }

    public Voo(int capMaxPassageiros, List<Passageiro> listaDePassageiros, List<String> listaDeEscalas, String estadoDoVoo, int capMinPassageiros) {
        this.geradorIDVoo = new Random();
        this.numeroVoo = geradorIDVoo.nextInt(1000) + 1;
        this.capMaxPassageiros = capMaxPassageiros;
        this.capMinPassageiros = capMinPassageiros;
        this.listaDePassageiros = listaDePassageiros;
        this.listaDeEscalas = listaDeEscalas;
        this.estadoDoVoo = estadoDoVoo;
    }

    @Override
    public String toString() {
        return "Identificador do Voo: " + numeroVoo + "\nCapacidade Max:" + capMaxPassageiros +
                "\nCapacidade Min:" + capMinPassageiros + "\nQuantidade de passageiros:" + listaDePassageiros.size()
                + "\nEstado do Voo:" + estadoDoVoo;
    }

    public void addPassageiro(Passageiro passageiro) {
        if (listaDePassageiros.size() <= capMaxPassageiros){
            listaDePassageiros.add(passageiro);
            passageiro.addPontos(50);
            System.out.println("Passageiro cadastrado na lista do voo com sucesso!");
        }
        else {
            System.out.println("Voo está lotado! Não é possível alocar novos passageiros!");
        }
    }

    public void remPassageiro(Passageiro passageiro) {
        listaDePassageiros.remove(passageiro);
        System.out.println("Passageiro removido da lista do voo com sucesso!");
    }

    public void alterarEstadoVoo(String novoEstado) {
        this.estadoDoVoo = novoEstado;
    }

    public boolean verificaCapacidadeVoo() {
        for (Passageiro passgeiro : listaDePassageiros) {
            if (listaDePassageiros.size() < this.capMinPassageiros) {
                System.out.println("Voo nao atende o numero minimo para decolagem!");
                return false;
            }
            else if (listaDePassageiros.size() > this.capMaxPassageiros) {
                System.out.println("O voo esta com super lotacao! Passageiros em excesso, risco de decolagem!");
                return false;
            }
            else {
                System.out.println("Voo OK!");
                return true;
            }
        }
        return false;
    }

    public int getCapMinPassageiros() {
        return capMinPassageiros;
    }

    public void setCapMinPassageiros(int capMinPassageiros) {
        this.capMinPassageiros = capMinPassageiros;
    }

    public int getCapMaxPassageiros() {
        return capMaxPassageiros;
    }

    public void setCapMaxPassageiros(int capMaxPassageiros) {
        this.capMaxPassageiros = capMaxPassageiros;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getEstadoDoVoo() {
        return estadoDoVoo;
    }

    public void setEstadoDoVoo(String estadoDoVoo) {
        this.estadoDoVoo = estadoDoVoo;
    }
}
