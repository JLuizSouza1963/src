package ApplicationSec13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entitiesSec13.OrderItem;

public class Program03 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<OrderItem> list = new ArrayList<>();

		System.out.print("Digite o nome do cliente : ");
		System.out.print("Nome : ");
		String name = sc.nextLine();
		System.out.println("Email : ");
		String email = sc.nextLine();
		System.out.println("Data de nascimento : ");
		Date birthDate = sdf.parse(sc.next());
		System.out.println("Digite os dados do pedido : ");
		System.out.println("QUanto itens terá este pedido : ");
		int items = sc.nextInt();
		
		String[] Produto = new String[items];
		Double[] Preco = new Double[items];
		int[] Quantidade = new int[items];
		
		for (int i=0; i<items; i++) {
			System.out.print("Digite o item #" + i + ": ");
			System.out.println("Descrição : ");
			Produto[i] = sc.next();
			System.out.println("Preço : ");
			Preco[i] = sc.nextDouble();
			System.out.println("Quantidade : ");
			Quantidade[i] = sc.nextInt();
			list.add(new OrderItem(Quantidade[i], Preco[i], null));
		}

		double totalPrice = 0;
		System.out.println("RESUMO DO PEDIDO");
		System.out.println("Data do pedido" + sdf);
		System.out.println("Situação do pedido : " + OrderStatus.PROCESSING);
		System.out.println("Cliente : " + name + "(" + birthDate + ") - " + email);
		System.out.println("Itens do pedido");
		for (int j=0; j<items; j++) {
			System.out.println(Produto + ", " + Preco[j] + ", Quantidade : " + Quantidade[j] + ", Subtotal : " + Quantidade[j] * Preco[j]);
			totalPrice = totalPrice + Quantidade[j] * Preco[j];
		}
		System.out.println("Preço Total = " + totalPrice);
		
	}

}
