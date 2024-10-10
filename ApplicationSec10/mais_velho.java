package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar ? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		int maiorIdade = 0;
		String nomeMaisVelho = null;
		int seq = 0;
		for (int i=0; i<n; i++) {
			seq = i+1;
			System.out.println("Dados da " + seq + "a Pessoa : ");
			System.out.print("Nome");
			nome[i] = sc.next();
			System.out.print("Idade");
			idade[i] = sc.nextInt();

			if(idade[i]>maiorIdade) {
				maiorIdade = idade[i];
				nomeMaisVelho = nome[i];
			}
			
		}
		
		System.out.println("A pessoa mais velha é : " + nomeMaisVelho);
		sc.close();

	}

}
