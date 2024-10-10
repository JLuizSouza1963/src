package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar ? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Digite um números : ");
			vetor[i] = sc.nextDouble();
		}

		double maior = 0;
		int pos = 0;
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i]>maior) {
				maior = vetor[i];
				pos = i;
			}
			
		}
		
		System.out.println("Maior valor : " + maior);
		System.out.println("Posição do maior valor : " + pos);
		
		sc.close();

	}

}
