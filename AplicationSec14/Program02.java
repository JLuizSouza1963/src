package AplicationSec14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		File file = new File("c:\\zpl\\script_1265.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro na abertura do arquivo : " + e.getMessage());
		}
		finally {
			if (sc !=null) {
				sc.close();
			}
		}
		
	}

}
