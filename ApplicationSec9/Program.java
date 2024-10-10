package ApplicationSec9;

import java.util.Locale;
import java.util.Scanner;

import entitiesSec9.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Product product = new Product();*/
		System.out.println("Enter product data : ");
		System.out.print("Name : ");
		String name = sc.nextLine();

		System.out.print("Price : ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock : ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);

		System.out.println("Product data : " + product);
		
		System.out.println();
		System.out.print("Enter the number of products do be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Updated data : " + product);
		
		System.out.println();
		System.out.print("Enter the number of products do be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProcucts(quantity);

		System.out.println();
		System.out.print("Updated data : " + product);
		
		sc.close();
	}
}

