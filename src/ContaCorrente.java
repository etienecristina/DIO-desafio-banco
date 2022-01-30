public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta Corrente");
        super.imprimirInfosComuns();
    }
}
