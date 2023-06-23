package poo;

import java.util.Random;

public class Carro {
    // Atributo
    int ano;
    String cor;
    // CONSTRUTOR
    public Carro(){
        Random gerador = new Random(); // gerar números aleatorios
        int Chassi = gerador.nextInt(1000);
        System.out.println("Chassi: " + Chassi);
    }
    // segundo construtor
    public Carro(int ano, String cor) {
        this.ano = ano;
        this.cor = cor;
    }

    // MÉTODOS
    void ligar() {
        System.out.println("engine ON ....");
    }

    void desligar() {
        System.out.println("engine off ....");
    }

    void acelerar() {
        System.out.println("vrummmm ....");
    }
}
