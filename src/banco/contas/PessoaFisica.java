package banco.contas;

public class PessoaFisica {
    public static void main(String[] args) {
        // PRIMEIRA CONTA
        Conta cc1 = new Conta();
        cc1.setCliente("Neemias Brito");
        cc1.setSaldo(23000);
        System.out.println("Cliente: " + cc1.getCLiente());
        cc1.exibirsaldo();
        cc1.sacar(200);
        cc1.exibirsaldo();
        System.out.println("----------------");
        // SEGUNDA CONTA
        Conta cc2 = new Conta();
        cc2.setCliente("Rosangela Rodrigues");
        cc2.setSaldo(85000);
        System.out.println("Cliente: " + cc2.getCLiente());
        cc2.exibirsaldo();
        cc2.depositar(350);
        cc2.exibirsaldo();
        System.out.println("----------------");
        // TRANSFERÊNCIA DE CONTAS
        System.out.println("Transferência");
        System.out.println("Cliente: " + cc1.getCLiente());
        System.out.println("Favorecido: " + cc2.getCLiente());
        cc1.transferir(cc2, 400);
        System.out.println("");
        System.out.println("Cliente: " + cc1.getCLiente());
        cc1.exibirsaldo();
        System.out.println("cliente: " + cc2.getCLiente());
        cc2.exibirsaldo();
        System.out.println("----------------");
        //RELATÓRIO GERENCIAL
        System.out.println("Relatório gerencial");
        Conta gerente = new Conta();
        double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
        System.out.println("Saldo total nas contas: R$ " + relatorio);

    }
}
