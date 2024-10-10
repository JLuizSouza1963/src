package ApplicationSec13_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesSec13_1.Employee;
import entitiesSec13_1.Product;
import entitiesSec13_1.UsedProduct;
import entitiesSec13_1.importedProduct;

public class Program02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com o numero de produtos : ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Dados dos produtos : ");
			System.out.println("Comum, usado ou importado (c/u/i) ? ");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome : ");
			String nome = sc.next();
			System.out.println("Preço : ");
			double preco = sc.nextDouble();
			
			String produtoTag;
			if (tipo=='i') {
				System.out.println("Custo de importação : ");
				double customsFee = sc.nextDouble();
				list.add(new importedProduct(nome, preco, customsFee));
			} else if (tipo=='u') {
				System.out.println("Data de fabricação : ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(nome, preco,data));
			} else {
				list.add(new Product(nome, preco));				
			}
		}
		System.out.println("Etiquetas de preço");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
