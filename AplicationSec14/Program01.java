package AplicationSec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Method1();
		System.out.println("Fim do programa");
	}
	
	public static void Method1() {
		System.out.println("Inicio Metodo 1");
		method2();
		System.out.println("Inicio Metodo 1");
	}

	public static void method2() {
		System.out.println("Inicio Metodo 2");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição invalida");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
		}
		sc.close();
		System.out.println("Fim Metodo 2");
	}
}
