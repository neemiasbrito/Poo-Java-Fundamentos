package poo;
// classe que tem herança da classe carro
public class Aviao extends Carro{
    double envergadura;

    void aterrizar() {
        System.out.println("----------____________ aterrizou");
    }
    // metodo de polimorfismo foi sobreescrito do metodo carro
    void acelerar() {
        System.out.println("________--------- decolou");
    }
}
