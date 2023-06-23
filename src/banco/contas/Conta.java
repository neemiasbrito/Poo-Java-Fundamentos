package banco.contas;

public class Conta {
    // atributos com o modificador de acesso e encapsulando com os métodos get e set
    private String cliente;
    private double saldo;
    // metodos get e set 
    public String getCLiente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //construtor
    public Conta() {
        System.out.println("Agência 0261");
    }

    //métodos com o modificador de acesso
    protected void exibirsaldo() {
        System.out.println("saldo: R$ " + saldo);
    }

    // método com passagem de parametro
    void sacar(double valor) {
        saldo -= valor;
        System.out.println("Débito: R$ " + valor);
    }
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Crédito: R$ " + valor);
    }

    // método com passagem de objeto e atributo
    void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência: R$ " + valor);
    }

    //método com retorno e com dois parametros
    double soma(double cc1, double cc2) {
        double total = cc1 + cc2;
        return total;
    }

}
