package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;
import entities.Triangle;

public class Exercicio1Sec8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Digite o valor da base e altura do Retangulo : ");
		x.base = sc.nextDouble();
		x.altura = sc.nextDouble();

		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();
		
		System.out.format("Area do retangulo : %.2f%n", area);
		System.out.format("Perimetro do retangulo : %.2f%n", perimetro);
		System.out.format("Diagonal do retangulo : %.2f%n", diagonal);
	
	}

}
