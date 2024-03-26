package org.example;

import org.entities.Aeroporto;
import org.entities.Passageiro;
import org.entities.Voo;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Passageiro newPassageiro = new Passageiro("Whendell", "077.677"); //criando passageiro
        newPassageiro.addPontos(100); //colocando pontos diretamente no passageiro
        System.out.println(newPassageiro.toString()); //print do passageiro
        Aeroporto gru = new Aeroporto("GRU", "Sao Paulo-SP"); //criando aeroporto
        Voo voo1 = new Voo();
        voo1.addPassageiro(newPassageiro); // passageiro add na lista de passageiros do voo
        voo1.setCapMaxPassageiros(300);
        voo1.setCapMinPassageiros(5);
        voo1.setEstadoDoVoo("Pronto para decolagem");
        System.out.println("\n\n");
        gru.addVoos(voo1);
        System.out.println("\n\n");
        gru.listarVoos(); //lista o voo add
        System.out.println("\n\n");
        voo1.toString();
        System.out.println("\n\n");
        gru.iniciarVoo(voo1);



    }
}