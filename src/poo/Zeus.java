package poo;

public class Zeus {
    public static void main(String[] args) {
        Aviao zeus = new Aviao();
        zeus.ano = 2020;
        zeus.cor = "pretop com laranja";
        zeus.envergadura = 17;
        System.out.println("Avião: Zeus");
        System.out.println("Ano: " + zeus.ano);
        System.out.println("Cor: " + zeus.cor);
        System.out.println("Envergadura " + zeus.envergadura + "m");
        zeus.ligar();
        zeus.acelerar(); // metodo sobreescrito(polimorfismo)
    }
}
