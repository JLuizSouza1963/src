package ApplicationSec9;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec9.DadosCliente;

public class ContaBancaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero da conta : ");
		String nroConta = sc.nextLine();

		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();

		double depInicial = 0.00;
		double deposito = 0.00;
		double retirada = 0.00;
		DadosCliente dadosCliente = new DadosCliente(nroConta, nome, depInicial, deposito, retirada);
		
		System.out.print("Existe deposito inicial S/N) :  ");
		String resp = sc.nextLine();

		if (resp.equals("S")) {
			System.out.print("Valor deposito inicial : $ ");
			depInicial = sc.nextDouble();
			dadosCliente.addSaldo(depInicial);
		}

		System.out.println();
		System.out.println(dadosCliente);

		System.out.println();
		System.out.print("Valor do deposito  : $ ");
		deposito = sc.nextDouble();
		dadosCliente.addSaldo(deposito);
		System.out.print(dadosCliente);
		
		System.out.println();
		System.out.println("Valor da retirada : $ ");
		retirada = sc.nextDouble();

		dadosCliente.addSaldo((retirada * -1) - 5.00);

		System.out.println();
		System.out.print(dadosCliente);

		sc.close();
	}
}
