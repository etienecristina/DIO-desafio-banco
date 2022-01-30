public  abstract class Conta implements IConta {
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Olá! \nO número da sua agência é: %d", this.agencia));
        System.out.println(String.format("Sua conta é: %d", this.numeroConta));
        System.out.println(String.format("O total de seu saldo é de: %.2f", this.saldo));
    }
}

