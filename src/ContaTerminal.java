import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criar o objeto Scanner para ler do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar e obter os dados do usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); // Consumir quebra de linha pendente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem final formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}