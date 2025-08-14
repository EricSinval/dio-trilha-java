import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();
        scanner.nextLine(); // limpar quebra de linha pendente

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
            nome, agencia, conta, saldo
        );

        scanner.close();
    }
}
