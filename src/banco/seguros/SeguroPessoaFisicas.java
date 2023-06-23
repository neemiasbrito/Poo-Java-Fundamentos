package banco.seguros;

import banco.contas.Conta;

public class SeguroPessoaFisicas extends Conta{
    public static void main(String[] args) {
        SeguroPessoaFisicas cc3 = new SeguroPessoaFisicas();
        cc3.setCliente("Eliana Ramos");
        cc3.setSaldo(98000);
        System.out.println("Cliente: " + cc3.getCLiente());
        cc3.exibirsaldo();
    }
}
