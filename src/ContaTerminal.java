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
		
		System.out.print("Por favor, digite o n�mero da Conta: ");
		numero = entrada.nextInt();
		
		System.out.print("Por favor, digite o n�mero da Ag�ncia: ");
		agencia = entrada.next();
		
		System.out.print("Digite seu saldo: ");
		saldo = entrada.nextDouble();
		
		
		System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " +
							agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� \ndispon�vel para saque.");
	}
}
