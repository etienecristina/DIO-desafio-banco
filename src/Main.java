public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.depositar(350);
        contaCorrente.transferir(100, contaPoupanca);
        contaCorrente.sacar(100);

        contaCorrente.imprimirExtrato();
        System.out.println("\n-----------------\n");
        contaPoupanca.imprimirExtrato();
    }
}
