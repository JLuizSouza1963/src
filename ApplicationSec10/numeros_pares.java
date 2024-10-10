package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar ? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número : ");
			vetor[i] = sc.nextInt();
			
		}

		System.out.print("Numeros  pares :  ");
		int nros = 0;
		for (int numero : vetor) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
				nros += 1;
			}
		}
		System.out.println();
		System.out.println("Quantidade de números pares : " + nros);
		sc.close();

	}

}
