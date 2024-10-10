package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas : ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        int somaMenos16 = 0;
        double somaAltura = 0;
        
        
        int nroPessoa = 1;
        for(int i=0; i<n; i++) {
        	System.out.println("Dados da pessoas " + nroPessoa + " :");
        	nroPessoa += 1;
        	System.out.println("Nome : ");
        	nome[i] = sc.nextLine();
        	String nomeD = sc.nextLine();
        	System.out.println("Idade : ");
        	int idadeD = sc.nextInt();
        	System.out.println("Altura : ");
        	double alturaD = sc.nextDouble();
        	somaAltura += alturaD;
        	if(idadeD<16) {
        		somaMenos16 += 1;
        	}
        	
        }
		
		System.out.println("Altura Média : ");
		System.out.print(somaAltura / altura.length);
		System.out.println("Pessoas com menos de 16 anos:" + ((100*somaMenos16)/nroPessoa));
		sc.close();		
	}


}
