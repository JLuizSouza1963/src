package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class medias_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("QUantos elementos o vetor vai ter ? ");
		int n = sc.nextInt();
		double soma = 0;
		int divisor = 0;
		double num = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digiter um número : ");
			num = sc.nextDouble();

			if (num % 2 == 0) {
				soma += num;
				divisor++;
			}

		}

		if (soma > 0) {

			System.out.print("Medias dos pares : " + soma / divisor);
		} else
			System.out.print("Não há números pares.");

		sc.close();

	}

}
