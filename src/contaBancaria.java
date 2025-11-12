public class contaBancaria {
    private String titular;
    private int numeroConta;
    private double saldoConta;

    // Construtor
    public contaBancaria(String titular, int numeroConta, double saldoConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    // Getters e Setters
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    // Método de depósito
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoConta += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método de saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldoConta) {
            this.saldoConta -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Titular da conta: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldoConta);
    }
}
