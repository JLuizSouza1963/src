package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos números você vai digitar ? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		
		soma = 0;
		for (int i=0; i<vetor.length; i++) {
			
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
		}
		
		
		System.out.println("Valores = ");
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i] + " - ");
		}

		System.out.println();
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + (soma/vetor.length));
		
		
	}

}
