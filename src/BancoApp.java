import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Coleta os dados do usuário
        System.out.print("Digite o nome do dono da conta: ");
        String titular = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = sc.nextDouble();

        // Cria o objeto conta (usando o construtor correto)
        contaBancaria conta = new contaBancaria(titular, numeroConta, saldoInicial);

        // Operação de depósito
        System.out.print("Informe o valor que deseja depositar na sua conta: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        // Operação de saque
        System.out.print("Informe o valor que deseja sacar da sua conta: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        // Exibe as informações finais da conta
        System.out.println("\n--- INFORMAÇÕES DA CONTA ---");
        conta.exibirInformacoes();

        sc.close();
    }
}
