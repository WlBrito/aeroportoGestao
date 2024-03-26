package org.entities;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nomeAeroporto;
    private String localizacao;
    private List<Voo> listaDeVoos;

    public Aeroporto(String nomeAeroporto, String localizacao){
        this.nomeAeroporto = nomeAeroporto;
        this.localizacao = localizacao;
        this.listaDeVoos = new ArrayList<>();
    }
    public void addVoos(Voo voo){
        this.listaDeVoos.add(voo);
    }
    public void remVoos(Voo voo){
        this.listaDeVoos.remove(voo);
    }
    public void listarVoos(){
        for(Voo voo:listaDeVoos)
            System.out.println(voo.toString());
    }
    public void iniciarVoo(Voo voo){
        if (voo.verificaCapacidadeVoo() == true) {
            System.out.println("Voo pronto para decolagem! Bon voyage!");
            System.out.println("**sons de turbina**");
        }
        else
            System.out.println("Voo ainda nao autorizado para decolagem!");
    }
}
