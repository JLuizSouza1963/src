package ApplicationSec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesSec10.funcionarios;

public class listaFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<funcionarios> listagem = new ArrayList<>();

		System.out.print("Quantos funcionario deseja ler ? : ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Leia o id do funcionario : ");
			Integer id = sc.nextInt();
			
			while (hasId(funcionarios, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

				System.out.print("Leia o nome do funcionario : ");
				String nome = sc.next();

				System.out.print("Leia o salario do funcionario : ");
				Double salario = sc.nextDouble();

				funcionarios funcionario = new funcionarios(id, nome, salario);
				listagem.add(funcionario);
			}


		System.out.println("Conteúdo do array:");
		for (funcionarios obj : listagem) {
			System.out.println(obj);
		}

		sc.close();

	}

}
