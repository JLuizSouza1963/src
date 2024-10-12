package AplicationSec14;

import java.util.Scanner;

import EntitiesSec14.Account;
import model.exceptions.DomainException;

public class ProgramExFix {

	public static void main(String[] args) throws DomainException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados da conta");
		
		try {
		System.out.print("Número : ");
		int number = sc.nextInt();
		System.out.print("Nome do cliente : ");
		String holder = sc.next();
		System.out.print("Saldo Inicial : ");
		Double balance = sc.nextDouble();
		System.out.print("Limite da conta : ");
		double withDrawLimite = sc.nextDouble();
		System.out.print("Digite o valor do saque : ");
		double withdraw = sc.nextDouble();
		Account account = new Account(null, holder, balance, withDrawLimite, withdraw);
		System.out.print(account);
		}
		catch (DomainException e) {
			System.out.println("O valor do saque excede o permitido");
		}

	}
}
