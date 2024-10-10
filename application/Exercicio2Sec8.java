package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.RelRH;

public class Exercicio2Sec8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RelRH relRH = new RelRH();
		
		System.out.println("Digite o Nome, Salario Bruto e imposto : ");
		System.out.print("Nome : ");
		relRH.nome = sc.nextLine();
		System.out.print("Salario : ");
		relRH.salario = sc.nextDouble();
		System.out.print("Imposto : ");
		relRH.imposto = sc.nextDouble();
		System.out.print("Dissidio : ");
		relRH.dissidio = sc.nextDouble();
		
		System.out.println("Dados financeiros : " + relRH);
		
	}

}
