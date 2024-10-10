package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec10.Produto2;

public class Programa2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto2[] vect = new Produto2[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produto2(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++ ) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/vect.length;
		System.out.printf("Media de preço = %.2f%n", avg);
		
		sc.close();
		
	}

}
