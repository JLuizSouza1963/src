package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão incluidas : ");
		int n = sc.nextInt();
		int seq = 0;
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		double maiorAltura = 0.0;
		double menorAltura = 100.0;
		double somaAlturaMulheres = 0.0;
		int nroHomens = 0;
		int nroMulheres = 0;
		
		for (int i=0; i<n; i++) {
			seq = seq+1;
			System.out.print("Altura da " + seq + "a pessoa : ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + seq + "a pessoa : ");
			genero[i] = sc.next().charAt(0);

			
			if (altura[i]>maiorAltura ) {
				maiorAltura = altura[i];
			}

			if (altura[i]<menorAltura ) {
				menorAltura = altura[i];
			}

			if (genero[i]=='F') {
				nroMulheres = nroMulheres + 1;
				somaAlturaMulheres = somaAlturaMulheres + altura[i];
			} else {
				nroHomens = nroHomens + 1;
			}

		}
		
		System.out.println("Menor altura : " + menorAltura);
		System.out.println("Maior alltura = " + maiorAltura);
		System.out.println("Media da altura das mulheres = " + (somaAlturaMulheres/nroMulheres));
		System.out.println("Numero de homens = " + nroHomens);
		
		sc.close();

	}

}
