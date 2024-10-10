package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Exercicio3Sec8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Notas notas = new Notas();
		
		System.out.println("Digite o Nome, e as notas do aluno : ");
		System.out.print("Nome : ");
		notas.nome = sc.nextLine();

		System.out.print("Nota do Trimestre 1 : ");
		notas.n1 = sc.nextDouble();

		System.out.print("Nota do Trimestre 2 : ");
		notas.n2 = sc.nextDouble();

		System.out.print("Nota do Trimestre 3 : ");
		notas.n3 = sc.nextDouble();
		
		if (notas.notaFinal() >5.0) {
			System.out.println(notas);
			System.out.println("Media final  - " + notas.notaFinal() + " Aprovado");
		}else {
			System.out.println(notas);
		    System.out.println("Media final  - " + notas.notaFinal() + " Reprovado");
			System.out.println("Falta para passar " + notas.faltaFinal());
		}
	}
	
}
