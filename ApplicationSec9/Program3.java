package ApplicationSec9;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec9.Product3;

public class Program3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Product3 p = new Product3();*/
		
		/*Product product = new Product();*/
		System.out.println("Enter product data : ");
		System.out.print("Name : ");
		String name = sc.nextLine();

		System.out.print("Price : ");
		double price = sc.nextDouble();

		Product3 product3 = new Product3(name, price);
		
		product3.setName("Computador");
		System.out.println("Alterado nome : " + product3.getName());
		product3.setPrice(1200.0);
		System.out.println("Preço alterado : " + product3.getPrice());
		
		
		System.out.println("Product data : " + product3);
		
		System.out.println();
		System.out.print("Enter the number of products do be added in stock: ");
		int quantity = sc.nextInt();
		product3.addProducts(quantity);
				
		System.out.println();
		System.out.print("Updated data : " + product3);
		
		System.out.println();
		System.out.print("Enter the number of products do be removed in stock: ");
		quantity = sc.nextInt();
		product3.removeProcucts(quantity);

		System.out.println();
		System.out.print("Updated data : " + product3);
		
		sc.close();
	}
}

