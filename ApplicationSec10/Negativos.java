package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros você vai ler ?");
		int n = sc.nextInt();
		 int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número : ");
			vetor[i] = sc.nextInt();
			
		}
		
		System.out.println("Valor negativos;");
		
	    for (int i=0; i<n; i++) {
	        if (vetor[i] < 0) {
	        	System.out.printf("%d\n", vetor[i]);
	        }
	    }
		
		sc.close();
		
	}

}
