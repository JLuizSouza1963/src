package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do preço do dollar : ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quanto dólares você vai comprar : ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Total a pagar em reais = %.2f%n", result);
		
		sc.close();

	}

}
