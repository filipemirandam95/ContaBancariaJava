package banco;

import java.util.Scanner;

public class ContaTerminal {
	int numero;
	String agencia;
	String nomeCliente;
	float saldo;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor,digite o número da conta: ");
		int numero = scanner.nextInt();
		System.out.println("Por favor,digite o número da Agência: ");
		String agencia = scanner.next();
		System.out.println("Por favor,digite o nome do Cliente: ");
		String nomeCliente = scanner.next();
		System.out.println("Por favor,digite o saldo da conta: ");
		int saldo = scanner.nextInt();
		ContaTerminal novaconta = new ContaTerminal();
		novaconta.numero = numero;
		novaconta.agencia = agencia;
		novaconta.nomeCliente = nomeCliente;
		novaconta.saldo = saldo;
		System.out.println("Olá " + novaconta.nomeCliente + " obrigado por criar uma conta em nosso banco,"
				+ " sua agência é " + novaconta.agencia + " conta " + novaconta.numero + " e seu saldo "
				+ novaconta.saldo + " já está disponível para saque.");

	}

}
