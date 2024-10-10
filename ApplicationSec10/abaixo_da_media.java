package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor ?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0;
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número : ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		System.out.println("Media do vetor = " + soma/n);
		System.out.println("Elementos abaixo da média:");
		for (int i=0; i<n; i++) {
			if(vetor[i]<(soma/n)) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();


	}

}
