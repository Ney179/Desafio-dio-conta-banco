import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor, digite seu nome: ");
		nomeCliente = entrada.nextLine();
		
		System.out.print("Por favor, digite o número da Conta: ");
		numero = entrada.nextInt();
		
		System.out.print("Por favor, digite o número da Agência: ");
		agencia = entrada.next();
		
		System.out.print("Digite seu saldo: ");
		saldo = entrada.nextDouble();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
							agencia + ", conta " + numero + " e seu saldo " + saldo + " já está \ndisponível para saque.");
	}
}
